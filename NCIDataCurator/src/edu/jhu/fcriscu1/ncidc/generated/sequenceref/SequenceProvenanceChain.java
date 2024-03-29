//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.10 at 11:18:19 AM PDT 
//


package edu.jhu.fcriscu1.ncidc.generated.sequenceref;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}SequenceSource"/>
 *         &lt;element name="SequenceDataset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PrimarySource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}SequenceProvenanceChain" maxOccurs="2" minOccurs="0"/>
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
    "sequenceSource",
    "sequenceDataset",
    "sourceURL",
    "primarySource",
    "sequenceProvenanceChains"
})
@XmlRootElement(name = "SequenceProvenanceChain")
public class SequenceProvenanceChain {

    @XmlElement(name = "SequenceSource", required = true)
    protected String sequenceSource;
    @XmlElement(name = "SequenceDataset")
    protected String sequenceDataset;
    @XmlElement(name = "SourceURL")
    @XmlSchemaType(name = "anyURI")
    protected String sourceURL;
    @XmlElement(name = "PrimarySource", defaultValue = "true")
    protected boolean primarySource;
    @XmlElement(name = "SequenceProvenanceChain")
    protected List<SequenceProvenanceChain> sequenceProvenanceChains;

    /**
     * Gets the value of the sequenceSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceSource() {
        return sequenceSource;
    }

    /**
     * Sets the value of the sequenceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceSource(String value) {
        this.sequenceSource = value;
    }

    /**
     * Gets the value of the sequenceDataset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceDataset() {
        return sequenceDataset;
    }

    /**
     * Sets the value of the sequenceDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceDataset(String value) {
        this.sequenceDataset = value;
    }

    /**
     * Gets the value of the sourceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURL() {
        return sourceURL;
    }

    /**
     * Sets the value of the sourceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURL(String value) {
        this.sourceURL = value;
    }

    /**
     * Gets the value of the primarySource property.
     * 
     */
    public boolean isPrimarySource() {
        return primarySource;
    }

    /**
     * Sets the value of the primarySource property.
     * 
     */
    public void setPrimarySource(boolean value) {
        this.primarySource = value;
    }

    /**
     * Gets the value of the sequenceProvenanceChains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceProvenanceChains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceProvenanceChains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceProvenanceChain }
     * 
     * 
     */
    public List<SequenceProvenanceChain> getSequenceProvenanceChains() {
        if (sequenceProvenanceChains == null) {
            sequenceProvenanceChains = new ArrayList<SequenceProvenanceChain>();
        }
        return this.sequenceProvenanceChains;
    }

}
