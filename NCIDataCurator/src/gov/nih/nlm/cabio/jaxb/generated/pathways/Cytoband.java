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
 * <p>Java class for Cytoband complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cytoband">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chromosome" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Chromosome" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="physicalLocationCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}CytobandPhysicalLocation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cytoband", propOrder = {
    "chromosome",
    "physicalLocationCollection"
})
public class Cytoband {

    protected Cytoband.Chromosome chromosome;
    protected Cytoband.PhysicalLocationCollection physicalLocationCollection;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the chromosome property.
     * 
     * @return
     *     possible object is
     *     {@link Cytoband.Chromosome }
     *     
     */
    public Cytoband.Chromosome getChromosome() {
        return chromosome;
    }

    /**
     * Sets the value of the chromosome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cytoband.Chromosome }
     *     
     */
    public void setChromosome(Cytoband.Chromosome value) {
        this.chromosome = value;
    }

    /**
     * Gets the value of the physicalLocationCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Cytoband.PhysicalLocationCollection }
     *     
     */
    public Cytoband.PhysicalLocationCollection getPhysicalLocationCollection() {
        return physicalLocationCollection;
    }

    /**
     * Sets the value of the physicalLocationCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cytoband.PhysicalLocationCollection }
     *     
     */
    public void setPhysicalLocationCollection(Cytoband.PhysicalLocationCollection value) {
        this.physicalLocationCollection = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Chromosome" minOccurs="0"/>
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
        "chromosome"
    })
    public static class Chromosome {

        @XmlElement(name = "Chromosome")
        protected gov.nih.nlm.cabio.jaxb.generated.pathways.Chromosome chromosome;

        /**
         * Gets the value of the chromosome property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.pathways.Chromosome }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.pathways.Chromosome getChromosome() {
            return chromosome;
        }

        /**
         * Sets the value of the chromosome property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.pathways.Chromosome }
         *     
         */
        public void setChromosome(gov.nih.nlm.cabio.jaxb.generated.pathways.Chromosome value) {
            this.chromosome = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}CytobandPhysicalLocation" maxOccurs="unbounded" minOccurs="0"/>
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
        "cytobandPhysicalLocation"
    })
    public static class PhysicalLocationCollection {

        @XmlElement(name = "CytobandPhysicalLocation")
        protected List<CytobandPhysicalLocation> cytobandPhysicalLocation;

        /**
         * Gets the value of the cytobandPhysicalLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cytobandPhysicalLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCytobandPhysicalLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CytobandPhysicalLocation }
         * 
         * 
         */
        public List<CytobandPhysicalLocation> getCytobandPhysicalLocation() {
            if (cytobandPhysicalLocation == null) {
                cytobandPhysicalLocation = new ArrayList<CytobandPhysicalLocation>();
            }
            return this.cytobandPhysicalLocation;
        }

    }

}
