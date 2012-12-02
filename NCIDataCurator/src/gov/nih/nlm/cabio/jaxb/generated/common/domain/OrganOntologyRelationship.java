//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 02:01:37 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.common.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganOntologyRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganOntologyRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentOrganOntology" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}OrganOntology" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="childOrganOntology" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}OrganOntology" minOccurs="0"/>
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
@XmlType(name = "OrganOntologyRelationship", propOrder = {
    "parentOrganOntology",
    "childOrganOntology"
})
public class OrganOntologyRelationship {

    protected OrganOntologyRelationship.ParentOrganOntology parentOrganOntology;
    protected OrganOntologyRelationship.ChildOrganOntology childOrganOntology;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String type;

    /**
     * Gets the value of the parentOrganOntology property.
     * 
     * @return
     *     possible object is
     *     {@link OrganOntologyRelationship.ParentOrganOntology }
     *     
     */
    public OrganOntologyRelationship.ParentOrganOntology getParentOrganOntology() {
        return parentOrganOntology;
    }

    /**
     * Sets the value of the parentOrganOntology property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganOntologyRelationship.ParentOrganOntology }
     *     
     */
    public void setParentOrganOntology(OrganOntologyRelationship.ParentOrganOntology value) {
        this.parentOrganOntology = value;
    }

    /**
     * Gets the value of the childOrganOntology property.
     * 
     * @return
     *     possible object is
     *     {@link OrganOntologyRelationship.ChildOrganOntology }
     *     
     */
    public OrganOntologyRelationship.ChildOrganOntology getChildOrganOntology() {
        return childOrganOntology;
    }

    /**
     * Sets the value of the childOrganOntology property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganOntologyRelationship.ChildOrganOntology }
     *     
     */
    public void setChildOrganOntology(OrganOntologyRelationship.ChildOrganOntology value) {
        this.childOrganOntology = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}OrganOntology" minOccurs="0"/>
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
        "organOntology"
    })
    public static class ChildOrganOntology {

        @XmlElement(name = "OrganOntology")
        protected OrganOntology organOntology;

        /**
         * Gets the value of the organOntology property.
         * 
         * @return
         *     possible object is
         *     {@link OrganOntology }
         *     
         */
        public OrganOntology getOrganOntology() {
            return organOntology;
        }

        /**
         * Sets the value of the organOntology property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganOntology }
         *     
         */
        public void setOrganOntology(OrganOntology value) {
            this.organOntology = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}OrganOntology" minOccurs="0"/>
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
        "organOntology"
    })
    public static class ParentOrganOntology {

        @XmlElement(name = "OrganOntology")
        protected OrganOntology organOntology;

        /**
         * Gets the value of the organOntology property.
         * 
         * @return
         *     possible object is
         *     {@link OrganOntology }
         *     
         */
        public OrganOntology getOrganOntology() {
            return organOntology;
        }

        /**
         * Sets the value of the organOntology property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganOntology }
         *     
         */
        public void setOrganOntology(OrganOntology value) {
            this.organOntology = value;
        }

    }

}