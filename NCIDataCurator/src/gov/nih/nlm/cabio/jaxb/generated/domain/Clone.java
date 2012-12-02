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
 * <p>Java class for Clone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Clone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxonCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Taxon" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="library" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Library" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cloneRelativeLocationCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}CloneRelativeLocation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nucleicAcidSequenceCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}NucleicAcidSequence" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="insertSize" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clone", propOrder = {
    "taxonCollection",
    "library",
    "cloneRelativeLocationCollection",
    "nucleicAcidSequenceCollection"
})
public class Clone {

    protected Clone.TaxonCollection taxonCollection;
    protected Clone.Library library;
    protected Clone.CloneRelativeLocationCollection cloneRelativeLocationCollection;
    protected Clone.NucleicAcidSequenceCollection nucleicAcidSequenceCollection;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected Long insertSize;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String type;

    /**
     * Gets the value of the taxonCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Clone.TaxonCollection }
     *     
     */
    public Clone.TaxonCollection getTaxonCollection() {
        return taxonCollection;
    }

    /**
     * Sets the value of the taxonCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clone.TaxonCollection }
     *     
     */
    public void setTaxonCollection(Clone.TaxonCollection value) {
        this.taxonCollection = value;
    }

    /**
     * Gets the value of the library property.
     * 
     * @return
     *     possible object is
     *     {@link Clone.Library }
     *     
     */
    public Clone.Library getLibrary() {
        return library;
    }

    /**
     * Sets the value of the library property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clone.Library }
     *     
     */
    public void setLibrary(Clone.Library value) {
        this.library = value;
    }

    /**
     * Gets the value of the cloneRelativeLocationCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Clone.CloneRelativeLocationCollection }
     *     
     */
    public Clone.CloneRelativeLocationCollection getCloneRelativeLocationCollection() {
        return cloneRelativeLocationCollection;
    }

    /**
     * Sets the value of the cloneRelativeLocationCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clone.CloneRelativeLocationCollection }
     *     
     */
    public void setCloneRelativeLocationCollection(Clone.CloneRelativeLocationCollection value) {
        this.cloneRelativeLocationCollection = value;
    }

    /**
     * Gets the value of the nucleicAcidSequenceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Clone.NucleicAcidSequenceCollection }
     *     
     */
    public Clone.NucleicAcidSequenceCollection getNucleicAcidSequenceCollection() {
        return nucleicAcidSequenceCollection;
    }

    /**
     * Sets the value of the nucleicAcidSequenceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clone.NucleicAcidSequenceCollection }
     *     
     */
    public void setNucleicAcidSequenceCollection(Clone.NucleicAcidSequenceCollection value) {
        this.nucleicAcidSequenceCollection = value;
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
     * Gets the value of the insertSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsertSize() {
        return insertSize;
    }

    /**
     * Sets the value of the insertSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsertSize(Long value) {
        this.insertSize = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}CloneRelativeLocation" maxOccurs="unbounded" minOccurs="0"/>
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
        "cloneRelativeLocation"
    })
    public static class CloneRelativeLocationCollection {

        @XmlElement(name = "CloneRelativeLocation")
        protected List<CloneRelativeLocation> cloneRelativeLocation;

        /**
         * Gets the value of the cloneRelativeLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cloneRelativeLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCloneRelativeLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CloneRelativeLocation }
         * 
         * 
         */
        public List<CloneRelativeLocation> getCloneRelativeLocation() {
            if (cloneRelativeLocation == null) {
                cloneRelativeLocation = new ArrayList<CloneRelativeLocation>();
            }
            return this.cloneRelativeLocation;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Library" minOccurs="0"/>
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
        "library"
    })
    public static class Library {

        @XmlElement(name = "Library")
        protected gov.nih.nlm.cabio.jaxb.generated.domain.Library library;

        /**
         * Gets the value of the library property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Library }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.domain.Library getLibrary() {
            return library;
        }

        /**
         * Sets the value of the library property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Library }
         *     
         */
        public void setLibrary(gov.nih.nlm.cabio.jaxb.generated.domain.Library value) {
            this.library = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}NucleicAcidSequence" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class NucleicAcidSequenceCollection {

        @XmlElement(name = "NucleicAcidSequence")
        protected List<NucleicAcidSequence> nucleicAcidSequence;

        /**
         * Gets the value of the nucleicAcidSequence property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nucleicAcidSequence property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNucleicAcidSequence().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NucleicAcidSequence }
         * 
         * 
         */
        public List<NucleicAcidSequence> getNucleicAcidSequence() {
            if (nucleicAcidSequence == null) {
                nucleicAcidSequence = new ArrayList<NucleicAcidSequence>();
            }
            return this.nucleicAcidSequence;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Taxon" maxOccurs="unbounded" minOccurs="0"/>
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
        "taxon"
    })
    public static class TaxonCollection {

        @XmlElement(name = "Taxon")
        protected List<Taxon> taxon;

        /**
         * Gets the value of the taxon property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxon property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxon().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Taxon }
         * 
         * 
         */
        public List<Taxon> getTaxon() {
            if (taxon == null) {
                taxon = new ArrayList<Taxon>();
            }
            return this.taxon;
        }

    }

}
