package edu.jhu.en605.fcriscu1.ncidc.seqcontainer.dataminer;

import org.apache.commons.lang.StringUtils;

import com.sleepycat.dbxml.XmlException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import edu.jhu.en605.fcriscu1.ncidc.service.EMBLDbFetchService;
import edu.jhu.en605.fcriscu1.ncidc.util.CommonNames;
import edu.jhu.en605.fcriscu1.ncidc.util.CommonUtils;
import edu.jhu.fcriscu1.ncidc.generated.sequenceref.RetrievedSequenceEntry;
import edu.jhu.fcriscu1.ncidc.generated.sequenceref.SequenceProvenanceChain;
import edu.jhu.fcriscu1.ncidc.generated.sequenceref.SequenceReference;
import edu.jhu.fcriscu1.ncidc.generated.sequenceref.SequenceReferenceIdentifier;


/*
 * Public class to mine sequence data from EMBL, map it to a SequenceReferenceObject
 * and persist it into the Sequence container
 * The mined data is the RefSeq in FASTA format
 * 
 */
public class RefSeqDataMiner extends SequenceContainerAbstractMiner {

	public RefSeqDataMiner() {
		super();
	}
	
	public String mineRefSeqByRefSeqId( String refseqId, String hugoSymbol){
		if (StringUtils.isEmpty(refseqId ) || StringUtils.isEmpty(hugoSymbol)){
			System.out.println(this.getClass().getSimpleName() +" invoked with null or invalid parameter(s)");
			return null;
		}
		String docName = "SeqRef_RefSeq_" +refseqId +".xml";
		if (!this.validDocumentExists(refseqId, docName)){
			SequenceReference seqRef = this.mapSequencReference(refseqId, hugoSymbol);
			this.persistSequenceReference(seqRef, docName);
		}
		
		System.out.println("RefSeq: " +refseqId +" persisted as " +docName);
		return docName;
	}
	
	private SequenceReference mapSequencReference(String refseqId, String hugoSymbol){
		SequenceReference seqRef = new SequenceReference();
		seqRef.setHugoSymbol(hugoSymbol);
		seqRef.setLastRetrievalDate(CommonUtils.setCurrentDateInXMLGregorianCalendar());
		seqRef.setSequenceProvenanceChain(this.mapProvenceChain(refseqId));
		seqRef.setSequenceType("Nucleotide");
		seqRef.setSequenceReferenceIdentifier(this.mapSequenceIdentifier(refseqId));
		seqRef.setRetrievedSequenceEntry(this.mapRetrievedSequence(refseqId));
		seqRef.setSequence(this.retrieveSequenceRest(refseqId));
		return seqRef;
		
	}
	
	
	private SequenceReferenceIdentifier mapSequenceIdentifier(String refseqId){
		SequenceReferenceIdentifier refId = new SequenceReferenceIdentifier();
		refId.setSequenceSource("EMBL");
		refId.setAccessionID(refseqId);
		
		return refId;
	}
	
	
	private SequenceProvenanceChain mapProvenceChain(String refseqId){
		SequenceProvenanceChain chain = new SequenceProvenanceChain();
		chain.setPrimarySource(true);
		chain.setSequenceDataset("RefSeq");
		chain.setSequenceSource("EMBL");
		
		String url ="http://www.ebi.ac.uk/Tools/webservices/rest/dbfetch/refseq/"
			+refseqId +"/fasta";
			
		chain.setSourceURL(url);
		
		
		return chain;
	}
	
	
	/*
	 * private method to embed the RefSeq FASTA entry into the RetrievedSequence element
	 */
	private RetrievedSequenceEntry mapRetrievedSequence(String refseqId){
		RetrievedSequenceEntry seqEntry = new RetrievedSequenceEntry();
		String fastaString = EMBLDbFetchService.instance.fetchRefSeqAsFasta(refseqId);
		if (StringUtils.isEmpty(fastaString)){
			System.out.println("Unable to retrieve RefSeq " +refseqId);
			return null;
		}
		// put the data into an XML element
		// since this is under an xs:Any element, it can be anything we want
		StringBuffer sb = new StringBuffer(CommonNames.FASTA_XML_OPEN_ELEMENT );
		sb.append(fastaString);
		sb.append("\n" +CommonNames.FASTA_XML_CLOSE_ELEMENT);
		seqEntry.setSequenceEntryXML(sb.toString());
		return seqEntry;
	}
	
	
	/*
	 * 
	 * use togows rest service to get sequence
	 */
	private String retrieveSequenceRest(String refseqId) {
		Client client = Client.create();
		WebResource webResource = client.resource("http://togows.dbcls.jp/entry/nucleotide/"
				+refseqId +"/seq");
		return  webResource.get(String.class);
	
		
	}
}
