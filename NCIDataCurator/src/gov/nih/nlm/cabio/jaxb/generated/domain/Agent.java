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
 * <p>Java class for Agent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Agent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentAliasCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}AgentAlias" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}GeneAgentAssociation" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="targetCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Target" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}SmallMoleculeEntity" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="absorption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="biotransformation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="casNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="chemicalFormula" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="drugbankAccession" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EVSId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="halfLife" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="indication" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isCMAPAgent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IUPACName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mechanismOfAction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="molecularWeight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NSCNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="percentProteinBinding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pharmacology" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pubchemCompoundId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pubchemSubstanceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="SMILESCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="toxicity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agent", propOrder = {
    "agentAliasCollection",
    "geneFunctionAssociationCollection",
    "clinicalTrialProtocolCollection",
    "targetCollection",
    "pathwayEntityCollection"
})
public class Agent {

    protected Agent.AgentAliasCollection agentAliasCollection;
    protected Agent.GeneFunctionAssociationCollection geneFunctionAssociationCollection;
    protected Agent.ClinicalTrialProtocolCollection clinicalTrialProtocolCollection;
    protected Agent.TargetCollection targetCollection;
    protected Agent.PathwayEntityCollection pathwayEntityCollection;
    @XmlAttribute
    protected String absorption;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected String biotransformation;
    @XmlAttribute
    protected String casNumber;
    @XmlAttribute
    protected String chemicalFormula;
    @XmlAttribute
    protected String comment;
    @XmlAttribute
    protected String drugbankAccession;
    @XmlAttribute(name = "EVSId")
    protected String evsId;
    @XmlAttribute
    protected String halfLife;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String indication;
    @XmlAttribute
    protected Boolean isCMAPAgent;
    @XmlAttribute(name = "IUPACName")
    protected String iupacName;
    @XmlAttribute
    protected String mechanismOfAction;
    @XmlAttribute
    protected Double molecularWeight;
    @XmlAttribute
    protected String name;
    @XmlAttribute(name = "NSCNumber")
    protected Long nscNumber;
    @XmlAttribute
    protected String percentProteinBinding;
    @XmlAttribute
    protected String pharmacology;
    @XmlAttribute
    protected Long pubchemCompoundId;
    @XmlAttribute
    protected Long pubchemSubstanceId;
    @XmlAttribute(name = "SMILESCode")
    protected String smilesCode;
    @XmlAttribute
    protected String source;
    @XmlAttribute
    protected String toxicity;

    /**
     * Gets the value of the agentAliasCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Agent.AgentAliasCollection }
     *     
     */
    public Agent.AgentAliasCollection getAgentAliasCollection() {
        return agentAliasCollection;
    }

    /**
     * Sets the value of the agentAliasCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent.AgentAliasCollection }
     *     
     */
    public void setAgentAliasCollection(Agent.AgentAliasCollection value) {
        this.agentAliasCollection = value;
    }

    /**
     * Gets the value of the geneFunctionAssociationCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Agent.GeneFunctionAssociationCollection }
     *     
     */
    public Agent.GeneFunctionAssociationCollection getGeneFunctionAssociationCollection() {
        return geneFunctionAssociationCollection;
    }

    /**
     * Sets the value of the geneFunctionAssociationCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent.GeneFunctionAssociationCollection }
     *     
     */
    public void setGeneFunctionAssociationCollection(Agent.GeneFunctionAssociationCollection value) {
        this.geneFunctionAssociationCollection = value;
    }

    /**
     * Gets the value of the clinicalTrialProtocolCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Agent.ClinicalTrialProtocolCollection }
     *     
     */
    public Agent.ClinicalTrialProtocolCollection getClinicalTrialProtocolCollection() {
        return clinicalTrialProtocolCollection;
    }

    /**
     * Sets the value of the clinicalTrialProtocolCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent.ClinicalTrialProtocolCollection }
     *     
     */
    public void setClinicalTrialProtocolCollection(Agent.ClinicalTrialProtocolCollection value) {
        this.clinicalTrialProtocolCollection = value;
    }

    /**
     * Gets the value of the targetCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Agent.TargetCollection }
     *     
     */
    public Agent.TargetCollection getTargetCollection() {
        return targetCollection;
    }

    /**
     * Sets the value of the targetCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent.TargetCollection }
     *     
     */
    public void setTargetCollection(Agent.TargetCollection value) {
        this.targetCollection = value;
    }

    /**
     * Gets the value of the pathwayEntityCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Agent.PathwayEntityCollection }
     *     
     */
    public Agent.PathwayEntityCollection getPathwayEntityCollection() {
        return pathwayEntityCollection;
    }

    /**
     * Sets the value of the pathwayEntityCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent.PathwayEntityCollection }
     *     
     */
    public void setPathwayEntityCollection(Agent.PathwayEntityCollection value) {
        this.pathwayEntityCollection = value;
    }

    /**
     * Gets the value of the absorption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsorption() {
        return absorption;
    }

    /**
     * Sets the value of the absorption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsorption(String value) {
        this.absorption = value;
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
     * Gets the value of the biotransformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiotransformation() {
        return biotransformation;
    }

    /**
     * Sets the value of the biotransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiotransformation(String value) {
        this.biotransformation = value;
    }

    /**
     * Gets the value of the casNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasNumber() {
        return casNumber;
    }

    /**
     * Sets the value of the casNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasNumber(String value) {
        this.casNumber = value;
    }

    /**
     * Gets the value of the chemicalFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalFormula() {
        return chemicalFormula;
    }

    /**
     * Sets the value of the chemicalFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalFormula(String value) {
        this.chemicalFormula = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the drugbankAccession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugbankAccession() {
        return drugbankAccession;
    }

    /**
     * Sets the value of the drugbankAccession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugbankAccession(String value) {
        this.drugbankAccession = value;
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
     * Gets the value of the halfLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalfLife() {
        return halfLife;
    }

    /**
     * Sets the value of the halfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalfLife(String value) {
        this.halfLife = value;
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
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndication(String value) {
        this.indication = value;
    }

    /**
     * Gets the value of the isCMAPAgent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCMAPAgent() {
        return isCMAPAgent;
    }

    /**
     * Sets the value of the isCMAPAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCMAPAgent(Boolean value) {
        this.isCMAPAgent = value;
    }

    /**
     * Gets the value of the iupacName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUPACName() {
        return iupacName;
    }

    /**
     * Sets the value of the iupacName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUPACName(String value) {
        this.iupacName = value;
    }

    /**
     * Gets the value of the mechanismOfAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanismOfAction() {
        return mechanismOfAction;
    }

    /**
     * Sets the value of the mechanismOfAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismOfAction(String value) {
        this.mechanismOfAction = value;
    }

    /**
     * Gets the value of the molecularWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMolecularWeight() {
        return molecularWeight;
    }

    /**
     * Sets the value of the molecularWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMolecularWeight(Double value) {
        this.molecularWeight = value;
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
     * Gets the value of the nscNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNSCNumber() {
        return nscNumber;
    }

    /**
     * Sets the value of the nscNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNSCNumber(Long value) {
        this.nscNumber = value;
    }

    /**
     * Gets the value of the percentProteinBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentProteinBinding() {
        return percentProteinBinding;
    }

    /**
     * Sets the value of the percentProteinBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentProteinBinding(String value) {
        this.percentProteinBinding = value;
    }

    /**
     * Gets the value of the pharmacology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacology() {
        return pharmacology;
    }

    /**
     * Sets the value of the pharmacology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacology(String value) {
        this.pharmacology = value;
    }

    /**
     * Gets the value of the pubchemCompoundId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPubchemCompoundId() {
        return pubchemCompoundId;
    }

    /**
     * Sets the value of the pubchemCompoundId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPubchemCompoundId(Long value) {
        this.pubchemCompoundId = value;
    }

    /**
     * Gets the value of the pubchemSubstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPubchemSubstanceId() {
        return pubchemSubstanceId;
    }

    /**
     * Sets the value of the pubchemSubstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPubchemSubstanceId(Long value) {
        this.pubchemSubstanceId = value;
    }

    /**
     * Gets the value of the smilesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMILESCode() {
        return smilesCode;
    }

    /**
     * Sets the value of the smilesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMILESCode(String value) {
        this.smilesCode = value;
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
     * Gets the value of the toxicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToxicity() {
        return toxicity;
    }

    /**
     * Sets the value of the toxicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToxicity(String value) {
        this.toxicity = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}AgentAlias" maxOccurs="unbounded" minOccurs="0"/>
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
        "agentAlias"
    })
    public static class AgentAliasCollection {

        @XmlElement(name = "AgentAlias")
        protected List<AgentAlias> agentAlias;

        /**
         * Gets the value of the agentAlias property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agentAlias property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgentAlias().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AgentAlias }
         * 
         * 
         */
        public List<AgentAlias> getAgentAlias() {
            if (agentAlias == null) {
                agentAlias = new ArrayList<AgentAlias>();
            }
            return this.agentAlias;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}GeneAgentAssociation" maxOccurs="unbounded" minOccurs="0"/>
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
        "geneAgentAssociation"
    })
    public static class GeneFunctionAssociationCollection {

        @XmlElement(name = "GeneAgentAssociation")
        protected List<GeneAgentAssociation> geneAgentAssociation;

        /**
         * Gets the value of the geneAgentAssociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the geneAgentAssociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeneAgentAssociation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeneAgentAssociation }
         * 
         * 
         */
        public List<GeneAgentAssociation> getGeneAgentAssociation() {
            if (geneAgentAssociation == null) {
                geneAgentAssociation = new ArrayList<GeneAgentAssociation>();
            }
            return this.geneAgentAssociation;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}SmallMoleculeEntity" maxOccurs="unbounded" minOccurs="0"/>
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
        "smallMoleculeEntity"
    })
    public static class PathwayEntityCollection {

        @XmlElement(name = "SmallMoleculeEntity", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways")
        protected List<SmallMoleculeEntity> smallMoleculeEntity;

        /**
         * Gets the value of the smallMoleculeEntity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the smallMoleculeEntity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSmallMoleculeEntity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SmallMoleculeEntity }
         * 
         * 
         */
        public List<SmallMoleculeEntity> getSmallMoleculeEntity() {
            if (smallMoleculeEntity == null) {
                smallMoleculeEntity = new ArrayList<SmallMoleculeEntity>();
            }
            return this.smallMoleculeEntity;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Target" maxOccurs="unbounded" minOccurs="0"/>
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
        "target"
    })
    public static class TargetCollection {

        @XmlElement(name = "Target")
        protected List<Target> target;

        /**
         * Gets the value of the target property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the target property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTarget().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Target }
         * 
         * 
         */
        public List<Target> getTarget() {
            if (target == null) {
                target = new ArrayList<Target>();
            }
            return this.target;
        }

    }

}
