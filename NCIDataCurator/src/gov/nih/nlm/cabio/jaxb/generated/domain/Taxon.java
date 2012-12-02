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
 * <p>Java class for Taxon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Taxon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pathwayCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Pathway" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cloneCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Clone" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tissueCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Tissue" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="proteinCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Protein" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="markerCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Marker" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="chromosomeCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Chromosome" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="multipleAlignmentCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}MultipleAlignment" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="commonName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ethnicityStrain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="scientificName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Taxon", propOrder = {
    "pathwayCollection",
    "cloneCollection",
    "tissueCollection",
    "geneCollection",
    "proteinCollection",
    "markerCollection",
    "chromosomeCollection",
    "multipleAlignmentCollection"
})
public class Taxon {

    protected Taxon.PathwayCollection pathwayCollection;
    protected Taxon.CloneCollection cloneCollection;
    protected Taxon.TissueCollection tissueCollection;
    protected Taxon.GeneCollection geneCollection;
    protected Taxon.ProteinCollection proteinCollection;
    protected Taxon.MarkerCollection markerCollection;
    protected Taxon.ChromosomeCollection chromosomeCollection;
    protected Taxon.MultipleAlignmentCollection multipleAlignmentCollection;
    @XmlAttribute
    protected String abbreviation;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected String commonName;
    @XmlAttribute
    protected String ethnicityStrain;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String scientificName;

    /**
     * Gets the value of the pathwayCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.PathwayCollection }
     *     
     */
    public Taxon.PathwayCollection getPathwayCollection() {
        return pathwayCollection;
    }

    /**
     * Sets the value of the pathwayCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.PathwayCollection }
     *     
     */
    public void setPathwayCollection(Taxon.PathwayCollection value) {
        this.pathwayCollection = value;
    }

    /**
     * Gets the value of the cloneCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.CloneCollection }
     *     
     */
    public Taxon.CloneCollection getCloneCollection() {
        return cloneCollection;
    }

    /**
     * Sets the value of the cloneCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.CloneCollection }
     *     
     */
    public void setCloneCollection(Taxon.CloneCollection value) {
        this.cloneCollection = value;
    }

    /**
     * Gets the value of the tissueCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.TissueCollection }
     *     
     */
    public Taxon.TissueCollection getTissueCollection() {
        return tissueCollection;
    }

    /**
     * Sets the value of the tissueCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.TissueCollection }
     *     
     */
    public void setTissueCollection(Taxon.TissueCollection value) {
        this.tissueCollection = value;
    }

    /**
     * Gets the value of the geneCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.GeneCollection }
     *     
     */
    public Taxon.GeneCollection getGeneCollection() {
        return geneCollection;
    }

    /**
     * Sets the value of the geneCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.GeneCollection }
     *     
     */
    public void setGeneCollection(Taxon.GeneCollection value) {
        this.geneCollection = value;
    }

    /**
     * Gets the value of the proteinCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.ProteinCollection }
     *     
     */
    public Taxon.ProteinCollection getProteinCollection() {
        return proteinCollection;
    }

    /**
     * Sets the value of the proteinCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.ProteinCollection }
     *     
     */
    public void setProteinCollection(Taxon.ProteinCollection value) {
        this.proteinCollection = value;
    }

    /**
     * Gets the value of the markerCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.MarkerCollection }
     *     
     */
    public Taxon.MarkerCollection getMarkerCollection() {
        return markerCollection;
    }

    /**
     * Sets the value of the markerCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.MarkerCollection }
     *     
     */
    public void setMarkerCollection(Taxon.MarkerCollection value) {
        this.markerCollection = value;
    }

    /**
     * Gets the value of the chromosomeCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.ChromosomeCollection }
     *     
     */
    public Taxon.ChromosomeCollection getChromosomeCollection() {
        return chromosomeCollection;
    }

    /**
     * Sets the value of the chromosomeCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.ChromosomeCollection }
     *     
     */
    public void setChromosomeCollection(Taxon.ChromosomeCollection value) {
        this.chromosomeCollection = value;
    }

    /**
     * Gets the value of the multipleAlignmentCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.MultipleAlignmentCollection }
     *     
     */
    public Taxon.MultipleAlignmentCollection getMultipleAlignmentCollection() {
        return multipleAlignmentCollection;
    }

    /**
     * Sets the value of the multipleAlignmentCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.MultipleAlignmentCollection }
     *     
     */
    public void setMultipleAlignmentCollection(Taxon.MultipleAlignmentCollection value) {
        this.multipleAlignmentCollection = value;
    }

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
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
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonName(String value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the ethnicityStrain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicityStrain() {
        return ethnicityStrain;
    }

    /**
     * Sets the value of the ethnicityStrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicityStrain(String value) {
        this.ethnicityStrain = value;
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
     * Gets the value of the scientificName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScientificName() {
        return scientificName;
    }

    /**
     * Sets the value of the scientificName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScientificName(String value) {
        this.scientificName = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Chromosome" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class ChromosomeCollection {

        @XmlElement(name = "Chromosome")
        protected List<Chromosome> chromosome;

        /**
         * Gets the value of the chromosome property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chromosome property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChromosome().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Chromosome }
         * 
         * 
         */
        public List<Chromosome> getChromosome() {
            if (chromosome == null) {
                chromosome = new ArrayList<Chromosome>();
            }
            return this.chromosome;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Clone" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class CloneCollection {

        @XmlElement(name = "Clone")
        protected List<Clone> clone;

        /**
         * Gets the value of the clone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Clone }
         * 
         * 
         */
        public List<Clone> getClone() {
            if (clone == null) {
                clone = new ArrayList<Clone>();
            }
            return this.clone;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Marker" maxOccurs="unbounded" minOccurs="0"/>
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
        "marker"
    })
    public static class MarkerCollection {

        @XmlElement(name = "Marker")
        protected List<Marker> marker;

        /**
         * Gets the value of the marker property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the marker property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarker().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Marker }
         * 
         * 
         */
        public List<Marker> getMarker() {
            if (marker == null) {
                marker = new ArrayList<Marker>();
            }
            return this.marker;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}MultipleAlignment" maxOccurs="unbounded" minOccurs="0"/>
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
        "multipleAlignment"
    })
    public static class MultipleAlignmentCollection {

        @XmlElement(name = "MultipleAlignment")
        protected List<MultipleAlignment> multipleAlignment;

        /**
         * Gets the value of the multipleAlignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the multipleAlignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMultipleAlignment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultipleAlignment }
         * 
         * 
         */
        public List<MultipleAlignment> getMultipleAlignment() {
            if (multipleAlignment == null) {
                multipleAlignment = new ArrayList<MultipleAlignment>();
            }
            return this.multipleAlignment;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Pathway" maxOccurs="unbounded" minOccurs="0"/>
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
        "pathway"
    })
    public static class PathwayCollection {

        @XmlElement(name = "Pathway")
        protected List<Pathway> pathway;

        /**
         * Gets the value of the pathway property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pathway property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPathway().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Pathway }
         * 
         * 
         */
        public List<Pathway> getPathway() {
            if (pathway == null) {
                pathway = new ArrayList<Pathway>();
            }
            return this.pathway;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Protein" maxOccurs="unbounded" minOccurs="0"/>
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
        "protein"
    })
    public static class ProteinCollection {

        @XmlElement(name = "Protein")
        protected List<Protein> protein;

        /**
         * Gets the value of the protein property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protein property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProtein().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Protein }
         * 
         * 
         */
        public List<Protein> getProtein() {
            if (protein == null) {
                protein = new ArrayList<Protein>();
            }
            return this.protein;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Tissue" maxOccurs="unbounded" minOccurs="0"/>
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
        "tissue"
    })
    public static class TissueCollection {

        @XmlElement(name = "Tissue")
        protected List<Tissue> tissue;

        /**
         * Gets the value of the tissue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tissue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTissue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tissue }
         * 
         * 
         */
        public List<Tissue> getTissue() {
            if (tissue == null) {
                tissue = new ArrayList<Tissue>();
            }
            return this.tissue;
        }

    }

}