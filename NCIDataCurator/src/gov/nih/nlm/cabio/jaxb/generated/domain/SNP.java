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
 * <p>Java class for SNP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SNP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="populationFrequencyCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}PopulationFrequency" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cytogeneticLocationCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}SNPCytogeneticLocation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="databaseCrossReferenceCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.common.domain}DatabaseCrossReference" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="relativeLocationCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}RelativeLocation" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}SNPPhysicalLocation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="snpArrayReporterCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}SNPArrayReporter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="alleleA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="alleleB" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aminoAcidChange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="chrXPseudoAutosomalRegion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DBSNPID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="validationStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SNP", propOrder = {
    "populationFrequencyCollection",
    "cytogeneticLocationCollection",
    "databaseCrossReferenceCollection",
    "relativeLocationCollection",
    "physicalLocationCollection",
    "snpArrayReporterCollection"
})
public class SNP {

    protected SNP.PopulationFrequencyCollection populationFrequencyCollection;
    protected SNP.CytogeneticLocationCollection cytogeneticLocationCollection;
    protected SNP.DatabaseCrossReferenceCollection databaseCrossReferenceCollection;
    protected SNP.RelativeLocationCollection relativeLocationCollection;
    protected SNP.PhysicalLocationCollection physicalLocationCollection;
    protected SNP.SnpArrayReporterCollection snpArrayReporterCollection;
    @XmlAttribute
    protected String alleleA;
    @XmlAttribute
    protected String alleleB;
    @XmlAttribute
    protected String aminoAcidChange;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected String chrXPseudoAutosomalRegion;
    @XmlAttribute
    protected String codingStatus;
    @XmlAttribute(name = "DBSNPID")
    protected String dbsnpid;
    @XmlAttribute
    protected String flank;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String validationStatus;

    /**
     * Gets the value of the populationFrequencyCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SNP.PopulationFrequencyCollection }
     *     
     */
    public SNP.PopulationFrequencyCollection getPopulationFrequencyCollection() {
        return populationFrequencyCollection;
    }

    /**
     * Sets the value of the populationFrequencyCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNP.PopulationFrequencyCollection }
     *     
     */
    public void setPopulationFrequencyCollection(SNP.PopulationFrequencyCollection value) {
        this.populationFrequencyCollection = value;
    }

    /**
     * Gets the value of the cytogeneticLocationCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SNP.CytogeneticLocationCollection }
     *     
     */
    public SNP.CytogeneticLocationCollection getCytogeneticLocationCollection() {
        return cytogeneticLocationCollection;
    }

    /**
     * Sets the value of the cytogeneticLocationCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNP.CytogeneticLocationCollection }
     *     
     */
    public void setCytogeneticLocationCollection(SNP.CytogeneticLocationCollection value) {
        this.cytogeneticLocationCollection = value;
    }

    /**
     * Gets the value of the databaseCrossReferenceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SNP.DatabaseCrossReferenceCollection }
     *     
     */
    public SNP.DatabaseCrossReferenceCollection getDatabaseCrossReferenceCollection() {
        return databaseCrossReferenceCollection;
    }

    /**
     * Sets the value of the databaseCrossReferenceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNP.DatabaseCrossReferenceCollection }
     *     
     */
    public void setDatabaseCrossReferenceCollection(SNP.DatabaseCrossReferenceCollection value) {
        this.databaseCrossReferenceCollection = value;
    }

    /**
     * Gets the value of the relativeLocationCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SNP.RelativeLocationCollection }
     *     
     */
    public SNP.RelativeLocationCollection getRelativeLocationCollection() {
        return relativeLocationCollection;
    }

    /**
     * Sets the value of the relativeLocationCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNP.RelativeLocationCollection }
     *     
     */
    public void setRelativeLocationCollection(SNP.RelativeLocationCollection value) {
        this.relativeLocationCollection = value;
    }

    /**
     * Gets the value of the physicalLocationCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SNP.PhysicalLocationCollection }
     *     
     */
    public SNP.PhysicalLocationCollection getPhysicalLocationCollection() {
        return physicalLocationCollection;
    }

    /**
     * Sets the value of the physicalLocationCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNP.PhysicalLocationCollection }
     *     
     */
    public void setPhysicalLocationCollection(SNP.PhysicalLocationCollection value) {
        this.physicalLocationCollection = value;
    }

    /**
     * Gets the value of the snpArrayReporterCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SNP.SnpArrayReporterCollection }
     *     
     */
    public SNP.SnpArrayReporterCollection getSnpArrayReporterCollection() {
        return snpArrayReporterCollection;
    }

    /**
     * Sets the value of the snpArrayReporterCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNP.SnpArrayReporterCollection }
     *     
     */
    public void setSnpArrayReporterCollection(SNP.SnpArrayReporterCollection value) {
        this.snpArrayReporterCollection = value;
    }

    /**
     * Gets the value of the alleleA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlleleA() {
        return alleleA;
    }

    /**
     * Sets the value of the alleleA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlleleA(String value) {
        this.alleleA = value;
    }

    /**
     * Gets the value of the alleleB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlleleB() {
        return alleleB;
    }

    /**
     * Sets the value of the alleleB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlleleB(String value) {
        this.alleleB = value;
    }

    /**
     * Gets the value of the aminoAcidChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAminoAcidChange() {
        return aminoAcidChange;
    }

    /**
     * Sets the value of the aminoAcidChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAminoAcidChange(String value) {
        this.aminoAcidChange = value;
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
     * Gets the value of the chrXPseudoAutosomalRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrXPseudoAutosomalRegion() {
        return chrXPseudoAutosomalRegion;
    }

    /**
     * Sets the value of the chrXPseudoAutosomalRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrXPseudoAutosomalRegion(String value) {
        this.chrXPseudoAutosomalRegion = value;
    }

    /**
     * Gets the value of the codingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodingStatus() {
        return codingStatus;
    }

    /**
     * Sets the value of the codingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodingStatus(String value) {
        this.codingStatus = value;
    }

    /**
     * Gets the value of the dbsnpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBSNPID() {
        return dbsnpid;
    }

    /**
     * Sets the value of the dbsnpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBSNPID(String value) {
        this.dbsnpid = value;
    }

    /**
     * Gets the value of the flank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlank() {
        return flank;
    }

    /**
     * Sets the value of the flank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlank(String value) {
        this.flank = value;
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
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationStatus(String value) {
        this.validationStatus = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}SNPCytogeneticLocation" maxOccurs="unbounded" minOccurs="0"/>
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
        "snpCytogeneticLocation"
    })
    public static class CytogeneticLocationCollection {

        @XmlElement(name = "SNPCytogeneticLocation")
        protected List<SNPCytogeneticLocation> snpCytogeneticLocation;

        /**
         * Gets the value of the snpCytogeneticLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the snpCytogeneticLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSNPCytogeneticLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SNPCytogeneticLocation }
         * 
         * 
         */
        public List<SNPCytogeneticLocation> getSNPCytogeneticLocation() {
            if (snpCytogeneticLocation == null) {
                snpCytogeneticLocation = new ArrayList<SNPCytogeneticLocation>();
            }
            return this.snpCytogeneticLocation;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.common.domain}DatabaseCrossReference" maxOccurs="unbounded" minOccurs="0"/>
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
        "databaseCrossReference"
    })
    public static class DatabaseCrossReferenceCollection {

        @XmlElement(name = "DatabaseCrossReference", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.common.domain")
        protected List<DatabaseCrossReference> databaseCrossReference;

        /**
         * Gets the value of the databaseCrossReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the databaseCrossReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatabaseCrossReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatabaseCrossReference }
         * 
         * 
         */
        public List<DatabaseCrossReference> getDatabaseCrossReference() {
            if (databaseCrossReference == null) {
                databaseCrossReference = new ArrayList<DatabaseCrossReference>();
            }
            return this.databaseCrossReference;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}SNPPhysicalLocation" maxOccurs="unbounded" minOccurs="0"/>
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
        "snpPhysicalLocation"
    })
    public static class PhysicalLocationCollection {

        @XmlElement(name = "SNPPhysicalLocation")
        protected List<SNPPhysicalLocation> snpPhysicalLocation;

        /**
         * Gets the value of the snpPhysicalLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the snpPhysicalLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSNPPhysicalLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SNPPhysicalLocation }
         * 
         * 
         */
        public List<SNPPhysicalLocation> getSNPPhysicalLocation() {
            if (snpPhysicalLocation == null) {
                snpPhysicalLocation = new ArrayList<SNPPhysicalLocation>();
            }
            return this.snpPhysicalLocation;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}PopulationFrequency" maxOccurs="unbounded" minOccurs="0"/>
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
        "populationFrequency"
    })
    public static class PopulationFrequencyCollection {

        @XmlElement(name = "PopulationFrequency")
        protected List<PopulationFrequency> populationFrequency;

        /**
         * Gets the value of the populationFrequency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the populationFrequency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPopulationFrequency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PopulationFrequency }
         * 
         * 
         */
        public List<PopulationFrequency> getPopulationFrequency() {
            if (populationFrequency == null) {
                populationFrequency = new ArrayList<PopulationFrequency>();
            }
            return this.populationFrequency;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}RelativeLocation" maxOccurs="unbounded" minOccurs="0"/>
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
        "relativeLocation"
    })
    public static class RelativeLocationCollection {

        @XmlElement(name = "RelativeLocation")
        protected List<RelativeLocation> relativeLocation;

        /**
         * Gets the value of the relativeLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relativeLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelativeLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelativeLocation }
         * 
         * 
         */
        public List<RelativeLocation> getRelativeLocation() {
            if (relativeLocation == null) {
                relativeLocation = new ArrayList<RelativeLocation>();
            }
            return this.relativeLocation;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}SNPArrayReporter" maxOccurs="unbounded" minOccurs="0"/>
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
        "snpArrayReporter"
    })
    public static class SnpArrayReporterCollection {

        @XmlElement(name = "SNPArrayReporter")
        protected List<SNPArrayReporter> snpArrayReporter;

        /**
         * Gets the value of the snpArrayReporter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the snpArrayReporter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSNPArrayReporter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SNPArrayReporter }
         * 
         * 
         */
        public List<SNPArrayReporter> getSNPArrayReporter() {
            if (snpArrayReporter == null) {
                snpArrayReporter = new ArrayList<SNPArrayReporter>();
            }
            return this.snpArrayReporter;
        }

    }

}
