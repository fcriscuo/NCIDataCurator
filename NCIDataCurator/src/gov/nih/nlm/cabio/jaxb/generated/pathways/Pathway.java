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
 * <p>Java class for Pathway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pathway">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactionCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}Interaction" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="taxon" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Taxon" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="histopathologyCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Histopathology" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="pathwayReferenceCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}PathwayReference" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="curator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="diagram" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reviewer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pathway", propOrder = {
    "interactionCollection",
    "taxon",
    "histopathologyCollection",
    "geneCollection",
    "pathwayReferenceCollection"
})
public class Pathway {

    protected Pathway.InteractionCollection interactionCollection;
    protected Pathway.Taxon taxon;
    protected Pathway.HistopathologyCollection histopathologyCollection;
    protected Pathway.GeneCollection geneCollection;
    protected Pathway.PathwayReferenceCollection pathwayReferenceCollection;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected String curator;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    protected String diagram;
    @XmlAttribute
    protected String displayValue;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String reviewer;
    @XmlAttribute
    protected String source;

    /**
     * Gets the value of the interactionCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Pathway.InteractionCollection }
     *     
     */
    public Pathway.InteractionCollection getInteractionCollection() {
        return interactionCollection;
    }

    /**
     * Sets the value of the interactionCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pathway.InteractionCollection }
     *     
     */
    public void setInteractionCollection(Pathway.InteractionCollection value) {
        this.interactionCollection = value;
    }

    /**
     * Gets the value of the taxon property.
     * 
     * @return
     *     possible object is
     *     {@link Pathway.Taxon }
     *     
     */
    public Pathway.Taxon getTaxon() {
        return taxon;
    }

    /**
     * Sets the value of the taxon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pathway.Taxon }
     *     
     */
    public void setTaxon(Pathway.Taxon value) {
        this.taxon = value;
    }

    /**
     * Gets the value of the histopathologyCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Pathway.HistopathologyCollection }
     *     
     */
    public Pathway.HistopathologyCollection getHistopathologyCollection() {
        return histopathologyCollection;
    }

    /**
     * Sets the value of the histopathologyCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pathway.HistopathologyCollection }
     *     
     */
    public void setHistopathologyCollection(Pathway.HistopathologyCollection value) {
        this.histopathologyCollection = value;
    }

    /**
     * Gets the value of the geneCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Pathway.GeneCollection }
     *     
     */
    public Pathway.GeneCollection getGeneCollection() {
        return geneCollection;
    }

    /**
     * Sets the value of the geneCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pathway.GeneCollection }
     *     
     */
    public void setGeneCollection(Pathway.GeneCollection value) {
        this.geneCollection = value;
    }

    /**
     * Gets the value of the pathwayReferenceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Pathway.PathwayReferenceCollection }
     *     
     */
    public Pathway.PathwayReferenceCollection getPathwayReferenceCollection() {
        return pathwayReferenceCollection;
    }

    /**
     * Sets the value of the pathwayReferenceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pathway.PathwayReferenceCollection }
     *     
     */
    public void setPathwayReferenceCollection(Pathway.PathwayReferenceCollection value) {
        this.pathwayReferenceCollection = value;
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
     * Gets the value of the curator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurator() {
        return curator;
    }

    /**
     * Sets the value of the curator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurator(String value) {
        this.curator = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the diagram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagram() {
        return diagram;
    }

    /**
     * Sets the value of the diagram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagram(String value) {
        this.diagram = value;
    }

    /**
     * Gets the value of the displayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayValue(String value) {
        this.displayValue = value;
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
     * Gets the value of the reviewer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * Sets the value of the reviewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewer(String value) {
        this.reviewer = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Histopathology" maxOccurs="unbounded" minOccurs="0"/>
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
        "histopathology"
    })
    public static class HistopathologyCollection {

        @XmlElement(name = "Histopathology")
        protected List<Histopathology> histopathology;

        /**
         * Gets the value of the histopathology property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the histopathology property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHistopathology().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Histopathology }
         * 
         * 
         */
        public List<Histopathology> getHistopathology() {
            if (histopathology == null) {
                histopathology = new ArrayList<Histopathology>();
            }
            return this.histopathology;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}Interaction" maxOccurs="unbounded" minOccurs="0"/>
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
        "interaction"
    })
    public static class InteractionCollection {

        @XmlElement(name = "Interaction", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways")
        protected List<Interaction> interaction;

        /**
         * Gets the value of the interaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInteraction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Interaction }
         * 
         * 
         */
        public List<Interaction> getInteraction() {
            if (interaction == null) {
                interaction = new ArrayList<Interaction>();
            }
            return this.interaction;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}PathwayReference" maxOccurs="unbounded" minOccurs="0"/>
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
        "pathwayReference"
    })
    public static class PathwayReferenceCollection {

        @XmlElement(name = "PathwayReference", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways")
        protected List<PathwayReference> pathwayReference;

        /**
         * Gets the value of the pathwayReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pathwayReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPathwayReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PathwayReference }
         * 
         * 
         */
        public List<PathwayReference> getPathwayReference() {
            if (pathwayReference == null) {
                pathwayReference = new ArrayList<PathwayReference>();
            }
            return this.pathwayReference;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Taxon" minOccurs="0"/>
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
    public static class Taxon {

        @XmlElement(name = "Taxon")
        protected gov.nih.nlm.cabio.jaxb.generated.pathways.Taxon taxon;

        /**
         * Gets the value of the taxon property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.pathways.Taxon }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.pathways.Taxon getTaxon() {
            return taxon;
        }

        /**
         * Sets the value of the taxon property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.pathways.Taxon }
         *     
         */
        public void setTaxon(gov.nih.nlm.cabio.jaxb.generated.pathways.Taxon value) {
            this.taxon = value;
        }

    }

}