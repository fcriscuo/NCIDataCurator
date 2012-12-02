//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 01:55:55 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExonArrayReporter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExonArrayReporter">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}TranscriptArrayReporter">
 *       &lt;sequence>
 *         &lt;element name="exon" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Exon" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="transcript" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Transcript" minOccurs="0"/>
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
 *       &lt;/sequence>
 *       &lt;attribute name="probeCount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="probeSelectionRegionId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="strand" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExonArrayReporter", propOrder = {
    "exon",
    "transcript",
    "geneCollection"
})
public class ExonArrayReporter
    extends TranscriptArrayReporter
{

    protected ExonArrayReporter.Exon exon;
    protected ExonArrayReporter.Transcript transcript;
    protected ExonArrayReporter.GeneCollection geneCollection;
    @XmlAttribute
    protected Long probeCount;
    @XmlAttribute
    protected Long probeSelectionRegionId;
    @XmlAttribute
    protected String strand;

    /**
     * Gets the value of the exon property.
     * 
     * @return
     *     possible object is
     *     {@link ExonArrayReporter.Exon }
     *     
     */
    public ExonArrayReporter.Exon getExon() {
        return exon;
    }

    /**
     * Sets the value of the exon property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExonArrayReporter.Exon }
     *     
     */
    public void setExon(ExonArrayReporter.Exon value) {
        this.exon = value;
    }

    /**
     * Gets the value of the transcript property.
     * 
     * @return
     *     possible object is
     *     {@link ExonArrayReporter.Transcript }
     *     
     */
    public ExonArrayReporter.Transcript getTranscript() {
        return transcript;
    }

    /**
     * Sets the value of the transcript property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExonArrayReporter.Transcript }
     *     
     */
    public void setTranscript(ExonArrayReporter.Transcript value) {
        this.transcript = value;
    }

    /**
     * Gets the value of the geneCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ExonArrayReporter.GeneCollection }
     *     
     */
    public ExonArrayReporter.GeneCollection getGeneCollection() {
        return geneCollection;
    }

    /**
     * Sets the value of the geneCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExonArrayReporter.GeneCollection }
     *     
     */
    public void setGeneCollection(ExonArrayReporter.GeneCollection value) {
        this.geneCollection = value;
    }

    /**
     * Gets the value of the probeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProbeCount() {
        return probeCount;
    }

    /**
     * Sets the value of the probeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProbeCount(Long value) {
        this.probeCount = value;
    }

    /**
     * Gets the value of the probeSelectionRegionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProbeSelectionRegionId() {
        return probeSelectionRegionId;
    }

    /**
     * Sets the value of the probeSelectionRegionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProbeSelectionRegionId(Long value) {
        this.probeSelectionRegionId = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Exon" minOccurs="0"/>
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
    public static class Exon {

        @XmlElement(name = "Exon")
        protected gov.nih.nlm.cabio.jaxb.generated.domain.Exon exon;

        /**
         * Gets the value of the exon property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Exon }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.domain.Exon getExon() {
            return exon;
        }

        /**
         * Sets the value of the exon property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Exon }
         *     
         */
        public void setExon(gov.nih.nlm.cabio.jaxb.generated.domain.Exon value) {
            this.exon = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Transcript" minOccurs="0"/>
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
        "transcript"
    })
    public static class Transcript {

        @XmlElement(name = "Transcript")
        protected gov.nih.nlm.cabio.jaxb.generated.domain.Transcript transcript;

        /**
         * Gets the value of the transcript property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Transcript }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.domain.Transcript getTranscript() {
            return transcript;
        }

        /**
         * Sets the value of the transcript property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Transcript }
         *     
         */
        public void setTranscript(gov.nih.nlm.cabio.jaxb.generated.domain.Transcript value) {
            this.transcript = value;
        }

    }

}
