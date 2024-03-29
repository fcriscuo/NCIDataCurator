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
 * <p>Java class for Protein complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Protein">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keywords" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="secondaryAccession" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="proteinAliasCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ProteinAlias" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pathwayEntityCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}ProteinEntity" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="proteinSequenceCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ProteinSequence" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copyrightStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="primaryAccession" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uniProtCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Protein", propOrder = {
    "keywords",
    "secondaryAccession",
    "proteinAliasCollection",
    "pathwayEntityCollection",
    "taxonCollection",
    "geneCollection",
    "proteinSequenceCollection"
})
public class Protein {

    protected Protein.Keywords keywords;
    protected Protein.SecondaryAccession secondaryAccession;
    protected Protein.ProteinAliasCollection proteinAliasCollection;
    protected Protein.PathwayEntityCollection pathwayEntityCollection;
    protected Protein.TaxonCollection taxonCollection;
    protected Protein.GeneCollection geneCollection;
    protected Protein.ProteinSequenceCollection proteinSequenceCollection;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected String copyrightStatement;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String primaryAccession;
    @XmlAttribute
    protected String uniProtCode;

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link Protein.Keywords }
     *     
     */
    public Protein.Keywords getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protein.Keywords }
     *     
     */
    public void setKeywords(Protein.Keywords value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the secondaryAccession property.
     * 
     * @return
     *     possible object is
     *     {@link Protein.SecondaryAccession }
     *     
     */
    public Protein.SecondaryAccession getSecondaryAccession() {
        return secondaryAccession;
    }

    /**
     * Sets the value of the secondaryAccession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protein.SecondaryAccession }
     *     
     */
    public void setSecondaryAccession(Protein.SecondaryAccession value) {
        this.secondaryAccession = value;
    }

    /**
     * Gets the value of the proteinAliasCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Protein.ProteinAliasCollection }
     *     
     */
    public Protein.ProteinAliasCollection getProteinAliasCollection() {
        return proteinAliasCollection;
    }

    /**
     * Sets the value of the proteinAliasCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protein.ProteinAliasCollection }
     *     
     */
    public void setProteinAliasCollection(Protein.ProteinAliasCollection value) {
        this.proteinAliasCollection = value;
    }

    /**
     * Gets the value of the pathwayEntityCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Protein.PathwayEntityCollection }
     *     
     */
    public Protein.PathwayEntityCollection getPathwayEntityCollection() {
        return pathwayEntityCollection;
    }

    /**
     * Sets the value of the pathwayEntityCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protein.PathwayEntityCollection }
     *     
     */
    public void setPathwayEntityCollection(Protein.PathwayEntityCollection value) {
        this.pathwayEntityCollection = value;
    }

    /**
     * Gets the value of the taxonCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Protein.TaxonCollection }
     *     
     */
    public Protein.TaxonCollection getTaxonCollection() {
        return taxonCollection;
    }

    /**
     * Sets the value of the taxonCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protein.TaxonCollection }
     *     
     */
    public void setTaxonCollection(Protein.TaxonCollection value) {
        this.taxonCollection = value;
    }

    /**
     * Gets the value of the geneCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Protein.GeneCollection }
     *     
     */
    public Protein.GeneCollection getGeneCollection() {
        return geneCollection;
    }

    /**
     * Sets the value of the geneCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protein.GeneCollection }
     *     
     */
    public void setGeneCollection(Protein.GeneCollection value) {
        this.geneCollection = value;
    }

    /**
     * Gets the value of the proteinSequenceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Protein.ProteinSequenceCollection }
     *     
     */
    public Protein.ProteinSequenceCollection getProteinSequenceCollection() {
        return proteinSequenceCollection;
    }

    /**
     * Sets the value of the proteinSequenceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protein.ProteinSequenceCollection }
     *     
     */
    public void setProteinSequenceCollection(Protein.ProteinSequenceCollection value) {
        this.proteinSequenceCollection = value;
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
     * Gets the value of the copyrightStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightStatement() {
        return copyrightStatement;
    }

    /**
     * Sets the value of the copyrightStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightStatement(String value) {
        this.copyrightStatement = value;
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
     * Gets the value of the primaryAccession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccession() {
        return primaryAccession;
    }

    /**
     * Sets the value of the primaryAccession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccession(String value) {
        this.primaryAccession = value;
    }

    /**
     * Gets the value of the uniProtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniProtCode() {
        return uniProtCode;
    }

    /**
     * Sets the value of the uniProtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniProtCode(String value) {
        this.uniProtCode = value;
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
     *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "string"
    })
    public static class Keywords {

        protected List<String> string;

        /**
         * Gets the value of the string property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the string property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getString().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getString() {
            if (string == null) {
                string = new ArrayList<String>();
            }
            return this.string;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}ProteinEntity" maxOccurs="unbounded" minOccurs="0"/>
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
        "proteinEntity"
    })
    public static class PathwayEntityCollection {

        @XmlElement(name = "ProteinEntity", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways")
        protected List<ProteinEntity> proteinEntity;

        /**
         * Gets the value of the proteinEntity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the proteinEntity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProteinEntity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProteinEntity }
         * 
         * 
         */
        public List<ProteinEntity> getProteinEntity() {
            if (proteinEntity == null) {
                proteinEntity = new ArrayList<ProteinEntity>();
            }
            return this.proteinEntity;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ProteinAlias" maxOccurs="unbounded" minOccurs="0"/>
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
        "proteinAlias"
    })
    public static class ProteinAliasCollection {

        @XmlElement(name = "ProteinAlias")
        protected List<ProteinAlias> proteinAlias;

        /**
         * Gets the value of the proteinAlias property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the proteinAlias property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProteinAlias().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProteinAlias }
         * 
         * 
         */
        public List<ProteinAlias> getProteinAlias() {
            if (proteinAlias == null) {
                proteinAlias = new ArrayList<ProteinAlias>();
            }
            return this.proteinAlias;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ProteinSequence" maxOccurs="unbounded" minOccurs="0"/>
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
        "proteinSequence"
    })
    public static class ProteinSequenceCollection {

        @XmlElement(name = "ProteinSequence")
        protected List<ProteinSequence> proteinSequence;

        /**
         * Gets the value of the proteinSequence property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the proteinSequence property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProteinSequence().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProteinSequence }
         * 
         * 
         */
        public List<ProteinSequence> getProteinSequence() {
            if (proteinSequence == null) {
                proteinSequence = new ArrayList<ProteinSequence>();
            }
            return this.proteinSequence;
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
     *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "string"
    })
    public static class SecondaryAccession {

        protected List<String> string;

        /**
         * Gets the value of the string property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the string property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getString().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getString() {
            if (string == null) {
                string = new ArrayList<String>();
            }
            return this.string;
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
