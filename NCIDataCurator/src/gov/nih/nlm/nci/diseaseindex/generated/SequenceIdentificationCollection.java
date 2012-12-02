//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.13 at 11:40:13 AM PDT 
//


package gov.nih.nlm.nci.diseaseindex.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}HgncID"/>
 *         &lt;element ref="{}LocusLinkID"/>
 *         &lt;element ref="{}GenbankAccession"/>
 *         &lt;element ref="{}RefSeqID"/>
 *         &lt;element ref="{}UniProtID"/>
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
    "hgncID",
    "locusLinkID",
    "genbankAccession",
    "refSeqID",
    "uniProtID"
})
@XmlRootElement(name = "SequenceIdentificationCollection")
public class SequenceIdentificationCollection {

    @XmlElement(name = "HgncID", required = true)
    protected String hgncID;
    @XmlElement(name = "LocusLinkID", required = true)
    protected String locusLinkID;
    @XmlElement(name = "GenbankAccession", required = true)
    protected String genbankAccession;
    @XmlElement(name = "RefSeqID", required = true)
    protected String refSeqID;
    @XmlElement(name = "UniProtID", required = true)
    protected String uniProtID;

    /**
     * Gets the value of the hgncID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHgncID() {
        return hgncID;
    }

    /**
     * Sets the value of the hgncID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHgncID(String value) {
        this.hgncID = value;
    }

    /**
     * Gets the value of the locusLinkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocusLinkID() {
        return locusLinkID;
    }

    /**
     * Sets the value of the locusLinkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocusLinkID(String value) {
        this.locusLinkID = value;
    }

    /**
     * Gets the value of the genbankAccession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenbankAccession() {
        return genbankAccession;
    }

    /**
     * Sets the value of the genbankAccession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenbankAccession(String value) {
        this.genbankAccession = value;
    }

    /**
     * Gets the value of the refSeqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefSeqID() {
        return refSeqID;
    }

    /**
     * Sets the value of the refSeqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefSeqID(String value) {
        this.refSeqID = value;
    }

    /**
     * Gets the value of the uniProtID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniProtID() {
        return uniProtID;
    }

    /**
     * Sets the value of the uniProtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniProtID(String value) {
        this.uniProtID = value;
    }

}