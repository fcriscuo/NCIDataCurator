//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 01:59:40 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.pathways;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transcript complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transcript">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="physicalLocationCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}TranscriptPhysicalLocation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exonArrayReporterCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ExonArrayReporter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="geneCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Gene" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exonCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Exon" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strand" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalProbeCount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transcript", propOrder = {
    "physicalLocationCollection",
    "exonArrayReporterCollection",
    "geneCollection",
    "exonCollection"
})
public class Transcript {

    protected Transcript.PhysicalLocationCollection physicalLocationCollection;
    protected Transcript.ExonArrayReporterCollection exonArrayReporterCollection;
    protected Transcript.GeneCollection geneCollection;
    protected Transcript.ExonCollection exonCollection;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String source;
    @XmlAttribute
    protected String sourceId;
    @XmlAttribute
    protected String strand;
    @XmlAttribute
    protected Long totalProbeCount;

    /**
     * Gets the value of the physicalLocationCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Transcript.PhysicalLocationCollection }
     *     
     */
    public Transcript.PhysicalLocationCollection getPhysicalLocationCollection() {
        return physicalLocationCollection;
    }

    /**
     * Sets the value of the physicalLocationCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transcript.PhysicalLocationCollection }
     *     
     */
    public void setPhysicalLocationCollection(Transcript.PhysicalLocationCollection value) {
        this.physicalLocationCollection = value;
    }

    /**
     * Gets the value of the exonArrayReporterCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Transcript.ExonArrayReporterCollection }
     *     
     */
    public Transcript.ExonArrayReporterCollection getExonArrayReporterCollection() {
        return exonArrayReporterCollection;
    }

    /**
     * Sets the value of the exonArrayReporterCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transcript.ExonArrayReporterCollection }
     *     
     */
    public void setExonArrayReporterCollection(Transcript.ExonArrayReporterCollection value) {
        this.exonArrayReporterCollection = value;
    }

    /**
     * Gets the value of the geneCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Transcript.GeneCollection }
     *     
     */
    public Transcript.GeneCollection getGeneCollection() {
        return geneCollection;
    }

    /**
     * Sets the value of the geneCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transcript.GeneCollection }
     *     
     */
    public void setGeneCollection(Transcript.GeneCollection value) {
        this.geneCollection = value;
    }

    /**
     * Gets the value of the exonCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Transcript.ExonCollection }
     *     
     */
    public Transcript.ExonCollection getExonCollection() {
        return exonCollection;
    }

    /**
     * Sets the value of the exonCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transcript.ExonCollection }
     *     
     */
    public void setExonCollection(Transcript.ExonCollection value) {
        this.exonCollection = value;
    }

    /**
     * Gets the value of the bigid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBigid() {
        return bigid;
    }

    /**
     * Sets the value of the bigid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBigid(String value) {
        this.bigid = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the strand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrand() {
        return strand;
    }

    /**
     * Sets the value of the strand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrand(String value) {
        this.strand = value;
    }

    /**
     * Gets the value of the totalProbeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalProbeCount() {
        return totalProbeCount;
    }

    /**
     * Sets the value of the totalProbeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalProbeCount(Long value) {
        this.totalProbeCount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ExonArrayReporter" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exonArrayReporter"
    })
    public static class ExonArrayReporterCollection {

        @XmlElement(name = "ExonArrayReporter")
        protected List<ExonArrayReporter> exonArrayReporter;

        /**
         * Gets the value of the exonArrayReporter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exonArrayReporter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExonArrayReporter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExonArrayReporter }
         * 
         * 
         */
        public List<ExonArrayReporter> getExonArrayReporter() {
            if (exonArrayReporter == null) {
                exonArrayReporter = new ArrayList<ExonArrayReporter>();
            }
            return this.exonArrayReporter;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Exon" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exon"
    })
    public static class ExonCollection {

        @XmlElement(name = "Exon")
        protected List<Exon> exon;

        /**
         * Gets the value of the exon property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exon property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExon().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Exon }
         * 
         * 
         */
        public List<Exon> getExon() {
            if (exon == null) {
                exon = new ArrayList<Exon>();
            }
            return this.exon;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Gene" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gene"
    })
    public static class GeneCollection {

        @XmlElement(name = "Gene")
        protected List<Gene> gene;

        /**
         * Gets the value of the gene property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gene property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGene().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Gene }
         * 
         * 
         */
        public List<Gene> getGene() {
            if (gene == null) {
                gene = new ArrayList<Gene>();
            }
            return this.gene;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}TranscriptPhysicalLocation" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transcriptPhysicalLocation"
    })
    public static class PhysicalLocationCollection {

        @XmlElement(name = "TranscriptPhysicalLocation")
        protected List<TranscriptPhysicalLocation> transcriptPhysicalLocation;

        /**
         * Gets the value of the transcriptPhysicalLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transcriptPhysicalLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTranscriptPhysicalLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TranscriptPhysicalLocation }
         * 
         * 
         */
        public List<TranscriptPhysicalLocation> getTranscriptPhysicalLocation() {
            if (transcriptPhysicalLocation == null) {
                transcriptPhysicalLocation = new ArrayList<TranscriptPhysicalLocation>();
            }
            return this.transcriptPhysicalLocation;
        }

    }

}
