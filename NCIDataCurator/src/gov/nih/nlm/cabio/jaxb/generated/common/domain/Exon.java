//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 02:01:37 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.common.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *       &lt;/sequence>
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exon", propOrder = {
    "exonArrayReporterCollection",
    "transcript"
})
public class Exon {

    protected Exon.ExonArrayReporterCollection exonArrayReporterCollection;
    protected Exon.Transcript transcript;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String source;
    @XmlAttribute
    protected Long sourceId;

    /**
     * Gets the value of the exonArrayReporterCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Exon.ExonArrayReporterCollection }
     *     
     */
    public Exon.ExonArrayReporterCollection getExonArrayReporterCollection() {
        return exonArrayReporterCollection;
    }

    /**
     * Sets the value of the exonArrayReporterCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exon.ExonArrayReporterCollection }
     *     
     */
    public void setExonArrayReporterCollection(Exon.ExonArrayReporterCollection value) {
        this.exonArrayReporterCollection = value;
    }

    /**
     * Gets the value of the transcript property.
     * 
     * @return
     *     possible object is
     *     {@link Exon.Transcript }
     *     
     */
    public Exon.Transcript getTranscript() {
        return transcript;
    }

    /**
     * Sets the value of the transcript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exon.Transcript }
     *     
     */
    public void setTranscript(Exon.Transcript value) {
        this.transcript = value;
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
     *     {@link Long }
     *     
     */
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceId(Long value) {
        this.sourceId = value;
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
        protected gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript transcript;

        /**
         * Gets the value of the transcript property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript getTranscript() {
            return transcript;
        }

        /**
         * Sets the value of the transcript property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript }
         *     
         */
        public void setTranscript(gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript value) {
            this.transcript = value;
        }

    }

}
