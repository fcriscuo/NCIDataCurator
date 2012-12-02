//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 01:55:55 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloneRelativeLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloneRelativeLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nucleicAcidSequence" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}NucleicAcidSequence" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clone" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Clone" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloneRelativeLocation", propOrder = {
    "nucleicAcidSequence",
    "clone"
})
public class CloneRelativeLocation {

    protected CloneRelativeLocation.NucleicAcidSequence nucleicAcidSequence;
    protected CloneRelativeLocation.Clone clone;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String type;

    /**
     * Gets the value of the nucleicAcidSequence property.
     * 
     * @return
     *     possible object is
     *     {@link CloneRelativeLocation.NucleicAcidSequence }
     *     
     */
    public CloneRelativeLocation.NucleicAcidSequence getNucleicAcidSequence() {
        return nucleicAcidSequence;
    }

    /**
     * Sets the value of the nucleicAcidSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloneRelativeLocation.NucleicAcidSequence }
     *     
     */
    public void setNucleicAcidSequence(CloneRelativeLocation.NucleicAcidSequence value) {
        this.nucleicAcidSequence = value;
    }

    /**
     * Gets the value of the clone property.
     * 
     * @return
     *     possible object is
     *     {@link CloneRelativeLocation.Clone }
     *     
     */
    public CloneRelativeLocation.Clone getClone() {
        return clone;
    }

    /**
     * Sets the value of the clone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloneRelativeLocation.Clone }
     *     
     */
    public void setClone(CloneRelativeLocation.Clone value) {
        this.clone = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Clone" minOccurs="0"/>
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
        "clone"
    })
    public static class Clone {

        @XmlElement(name = "Clone")
        protected gov.nih.nlm.cabio.jaxb.generated.domain.Clone clone;

        /**
         * Gets the value of the clone property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Clone }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.domain.Clone getClone() {
            return clone;
        }

        /**
         * Sets the value of the clone property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Clone }
         *     
         */
        public void setClone(gov.nih.nlm.cabio.jaxb.generated.domain.Clone value) {
            this.clone = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}NucleicAcidSequence" minOccurs="0"/>
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
        "nucleicAcidSequence"
    })
    public static class NucleicAcidSequence {

        @XmlElement(name = "NucleicAcidSequence")
        protected gov.nih.nlm.cabio.jaxb.generated.domain.NucleicAcidSequence nucleicAcidSequence;

        /**
         * Gets the value of the nucleicAcidSequence property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.NucleicAcidSequence }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.domain.NucleicAcidSequence getNucleicAcidSequence() {
            return nucleicAcidSequence;
        }

        /**
         * Sets the value of the nucleicAcidSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.NucleicAcidSequence }
         *     
         */
        public void setNucleicAcidSequence(gov.nih.nlm.cabio.jaxb.generated.domain.NucleicAcidSequence value) {
            this.nucleicAcidSequence = value;
        }

    }

}