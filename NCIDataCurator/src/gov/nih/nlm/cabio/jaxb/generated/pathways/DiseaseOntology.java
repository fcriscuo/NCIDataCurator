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
 * <p>Java class for DiseaseOntology complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiseaseOntology">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="childDiseaseOntologyRelationshipCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}DiseaseOntologyRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clinicalTrialProtocolCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ClinicalTrialProtocol" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="parentDiseaseOntologyRelationshipCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}DiseaseOntologyRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="geneFunctionAssociationCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}GeneDiseaseAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EVSId" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "DiseaseOntology", propOrder = {
    "childDiseaseOntologyRelationshipCollection",
    "clinicalTrialProtocolCollection",
    "histopathologyCollection",
    "parentDiseaseOntologyRelationshipCollection",
    "geneFunctionAssociationCollection"
})
public class DiseaseOntology {

    protected DiseaseOntology.ChildDiseaseOntologyRelationshipCollection childDiseaseOntologyRelationshipCollection;
    protected DiseaseOntology.ClinicalTrialProtocolCollection clinicalTrialProtocolCollection;
    protected DiseaseOntology.HistopathologyCollection histopathologyCollection;
    protected DiseaseOntology.ParentDiseaseOntologyRelationshipCollection parentDiseaseOntologyRelationshipCollection;
    protected DiseaseOntology.GeneFunctionAssociationCollection geneFunctionAssociationCollection;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute(name = "EVSId")
    protected String evsId;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the childDiseaseOntologyRelationshipCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DiseaseOntology.ChildDiseaseOntologyRelationshipCollection }
     *     
     */
    public DiseaseOntology.ChildDiseaseOntologyRelationshipCollection getChildDiseaseOntologyRelationshipCollection() {
        return childDiseaseOntologyRelationshipCollection;
    }

    /**
     * Sets the value of the childDiseaseOntologyRelationshipCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiseaseOntology.ChildDiseaseOntologyRelationshipCollection }
     *     
     */
    public void setChildDiseaseOntologyRelationshipCollection(DiseaseOntology.ChildDiseaseOntologyRelationshipCollection value) {
        this.childDiseaseOntologyRelationshipCollection = value;
    }

    /**
     * Gets the value of the clinicalTrialProtocolCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DiseaseOntology.ClinicalTrialProtocolCollection }
     *     
     */
    public DiseaseOntology.ClinicalTrialProtocolCollection getClinicalTrialProtocolCollection() {
        return clinicalTrialProtocolCollection;
    }

    /**
     * Sets the value of the clinicalTrialProtocolCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiseaseOntology.ClinicalTrialProtocolCollection }
     *     
     */
    public void setClinicalTrialProtocolCollection(DiseaseOntology.ClinicalTrialProtocolCollection value) {
        this.clinicalTrialProtocolCollection = value;
    }

    /**
     * Gets the value of the histopathologyCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DiseaseOntology.HistopathologyCollection }
     *     
     */
    public DiseaseOntology.HistopathologyCollection getHistopathologyCollection() {
        return histopathologyCollection;
    }

    /**
     * Sets the value of the histopathologyCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiseaseOntology.HistopathologyCollection }
     *     
     */
    public void setHistopathologyCollection(DiseaseOntology.HistopathologyCollection value) {
        this.histopathologyCollection = value;
    }

    /**
     * Gets the value of the parentDiseaseOntologyRelationshipCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DiseaseOntology.ParentDiseaseOntologyRelationshipCollection }
     *     
     */
    public DiseaseOntology.ParentDiseaseOntologyRelationshipCollection getParentDiseaseOntologyRelationshipCollection() {
        return parentDiseaseOntologyRelationshipCollection;
    }

    /**
     * Sets the value of the parentDiseaseOntologyRelationshipCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiseaseOntology.ParentDiseaseOntologyRelationshipCollection }
     *     
     */
    public void setParentDiseaseOntologyRelationshipCollection(DiseaseOntology.ParentDiseaseOntologyRelationshipCollection value) {
        this.parentDiseaseOntologyRelationshipCollection = value;
    }

    /**
     * Gets the value of the geneFunctionAssociationCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DiseaseOntology.GeneFunctionAssociationCollection }
     *     
     */
    public DiseaseOntology.GeneFunctionAssociationCollection getGeneFunctionAssociationCollection() {
        return geneFunctionAssociationCollection;
    }

    /**
     * Sets the value of the geneFunctionAssociationCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiseaseOntology.GeneFunctionAssociationCollection }
     *     
     */
    public void setGeneFunctionAssociationCollection(DiseaseOntology.GeneFunctionAssociationCollection value) {
        this.geneFunctionAssociationCollection = value;
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
     * Gets the value of the evsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVSId() {
        return evsId;
    }

    /**
     * Sets the value of the evsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVSId(String value) {
        this.evsId = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}DiseaseOntologyRelationship" maxOccurs="unbounded" minOccurs="0"/>
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
        "diseaseOntologyRelationship"
    })
    public static class ChildDiseaseOntologyRelationshipCollection {

        @XmlElement(name = "DiseaseOntologyRelationship")
        protected List<DiseaseOntologyRelationship> diseaseOntologyRelationship;

        /**
         * Gets the value of the diseaseOntologyRelationship property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diseaseOntologyRelationship property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiseaseOntologyRelationship().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiseaseOntologyRelationship }
         * 
         * 
         */
        public List<DiseaseOntologyRelationship> getDiseaseOntologyRelationship() {
            if (diseaseOntologyRelationship == null) {
                diseaseOntologyRelationship = new ArrayList<DiseaseOntologyRelationship>();
            }
            return this.diseaseOntologyRelationship;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ClinicalTrialProtocol" maxOccurs="unbounded" minOccurs="0"/>
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
        "clinicalTrialProtocol"
    })
    public static class ClinicalTrialProtocolCollection {

        @XmlElement(name = "ClinicalTrialProtocol")
        protected List<ClinicalTrialProtocol> clinicalTrialProtocol;

        /**
         * Gets the value of the clinicalTrialProtocol property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clinicalTrialProtocol property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClinicalTrialProtocol().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClinicalTrialProtocol }
         * 
         * 
         */
        public List<ClinicalTrialProtocol> getClinicalTrialProtocol() {
            if (clinicalTrialProtocol == null) {
                clinicalTrialProtocol = new ArrayList<ClinicalTrialProtocol>();
            }
            return this.clinicalTrialProtocol;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}GeneDiseaseAssociation" maxOccurs="unbounded" minOccurs="0"/>
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
        "geneDiseaseAssociation"
    })
    public static class GeneFunctionAssociationCollection {

        @XmlElement(name = "GeneDiseaseAssociation")
        protected List<GeneDiseaseAssociation> geneDiseaseAssociation;

        /**
         * Gets the value of the geneDiseaseAssociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the geneDiseaseAssociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeneDiseaseAssociation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeneDiseaseAssociation }
         * 
         * 
         */
        public List<GeneDiseaseAssociation> getGeneDiseaseAssociation() {
            if (geneDiseaseAssociation == null) {
                geneDiseaseAssociation = new ArrayList<GeneDiseaseAssociation>();
            }
            return this.geneDiseaseAssociation;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}DiseaseOntologyRelationship" maxOccurs="unbounded" minOccurs="0"/>
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
        "diseaseOntologyRelationship"
    })
    public static class ParentDiseaseOntologyRelationshipCollection {

        @XmlElement(name = "DiseaseOntologyRelationship")
        protected List<DiseaseOntologyRelationship> diseaseOntologyRelationship;

        /**
         * Gets the value of the diseaseOntologyRelationship property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diseaseOntologyRelationship property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiseaseOntologyRelationship().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiseaseOntologyRelationship }
         * 
         * 
         */
        public List<DiseaseOntologyRelationship> getDiseaseOntologyRelationship() {
            if (diseaseOntologyRelationship == null) {
                diseaseOntologyRelationship = new ArrayList<DiseaseOntologyRelationship>();
            }
            return this.diseaseOntologyRelationship;
        }

    }

}
