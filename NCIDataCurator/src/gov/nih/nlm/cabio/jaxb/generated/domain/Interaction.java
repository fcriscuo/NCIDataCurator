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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Interaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interaction">
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
 *         &lt;element name="referenceCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Evidence" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="participantCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}Participant" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="evidenceCodeCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}EvidenceCode" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interaction", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways", propOrder = {
    "pathwayCollection",
    "referenceCollection",
    "participantCollection",
    "evidenceCodeCollection"
})
@XmlSeeAlso({
    GeneRegulation.class,
    PathwayReference.class,
    Macroprocess.class,
    BiochemicalReaction.class
})
public class Interaction {

    protected Interaction.PathwayCollection pathwayCollection;
    protected Interaction.ReferenceCollection referenceCollection;
    protected Interaction.ParticipantCollection participantCollection;
    protected Interaction.EvidenceCodeCollection evidenceCodeCollection;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String source;

    /**
     * Gets the value of the pathwayCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Interaction.PathwayCollection }
     *     
     */
    public Interaction.PathwayCollection getPathwayCollection() {
        return pathwayCollection;
    }

    /**
     * Sets the value of the pathwayCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interaction.PathwayCollection }
     *     
     */
    public void setPathwayCollection(Interaction.PathwayCollection value) {
        this.pathwayCollection = value;
    }

    /**
     * Gets the value of the referenceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Interaction.ReferenceCollection }
     *     
     */
    public Interaction.ReferenceCollection getReferenceCollection() {
        return referenceCollection;
    }

    /**
     * Sets the value of the referenceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interaction.ReferenceCollection }
     *     
     */
    public void setReferenceCollection(Interaction.ReferenceCollection value) {
        this.referenceCollection = value;
    }

    /**
     * Gets the value of the participantCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Interaction.ParticipantCollection }
     *     
     */
    public Interaction.ParticipantCollection getParticipantCollection() {
        return participantCollection;
    }

    /**
     * Sets the value of the participantCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interaction.ParticipantCollection }
     *     
     */
    public void setParticipantCollection(Interaction.ParticipantCollection value) {
        this.participantCollection = value;
    }

    /**
     * Gets the value of the evidenceCodeCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Interaction.EvidenceCodeCollection }
     *     
     */
    public Interaction.EvidenceCodeCollection getEvidenceCodeCollection() {
        return evidenceCodeCollection;
    }

    /**
     * Sets the value of the evidenceCodeCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interaction.EvidenceCodeCollection }
     *     
     */
    public void setEvidenceCodeCollection(Interaction.EvidenceCodeCollection value) {
        this.evidenceCodeCollection = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}EvidenceCode" maxOccurs="unbounded" minOccurs="0"/>
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
        "evidenceCode"
    })
    public static class EvidenceCodeCollection {

        @XmlElement(name = "EvidenceCode")
        protected List<EvidenceCode> evidenceCode;

        /**
         * Gets the value of the evidenceCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evidenceCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvidenceCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvidenceCode }
         * 
         * 
         */
        public List<EvidenceCode> getEvidenceCode() {
            if (evidenceCode == null) {
                evidenceCode = new ArrayList<EvidenceCode>();
            }
            return this.evidenceCode;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}Participant" maxOccurs="unbounded" minOccurs="0"/>
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
        "participant"
    })
    public static class ParticipantCollection {

        @XmlElement(name = "Participant", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways")
        protected List<Participant> participant;

        /**
         * Gets the value of the participant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the participant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParticipant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Participant }
         * 
         * 
         */
        public List<Participant> getParticipant() {
            if (participant == null) {
                participant = new ArrayList<Participant>();
            }
            return this.participant;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Evidence" maxOccurs="unbounded" minOccurs="0"/>
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
        "evidence"
    })
    public static class ReferenceCollection {

        @XmlElement(name = "Evidence")
        protected List<Evidence> evidence;

        /**
         * Gets the value of the evidence property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evidence property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvidence().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Evidence }
         * 
         * 
         */
        public List<Evidence> getEvidence() {
            if (evidence == null) {
                evidence = new ArrayList<Evidence>();
            }
            return this.evidence;
        }

    }

}
