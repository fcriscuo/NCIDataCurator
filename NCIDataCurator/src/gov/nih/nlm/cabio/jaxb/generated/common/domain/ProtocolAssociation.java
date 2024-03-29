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
 * <p>Java class for ProtocolAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clinicalTrialProtocol" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ClinicalTrialProtocol" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CTEPNAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="diseaseCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="diseaseSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="IMTCODE" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolAssociation", propOrder = {
    "clinicalTrialProtocol"
})
public class ProtocolAssociation {

    protected ProtocolAssociation.ClinicalTrialProtocol clinicalTrialProtocol;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute(name = "CTEPNAME")
    protected String ctepname;
    @XmlAttribute
    protected String diseaseCategory;
    @XmlAttribute
    protected String diseaseSubCategory;
    @XmlAttribute
    protected Long id;
    @XmlAttribute(name = "IMTCODE")
    protected Long imtcode;

    /**
     * Gets the value of the clinicalTrialProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolAssociation.ClinicalTrialProtocol }
     *     
     */
    public ProtocolAssociation.ClinicalTrialProtocol getClinicalTrialProtocol() {
        return clinicalTrialProtocol;
    }

    /**
     * Sets the value of the clinicalTrialProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolAssociation.ClinicalTrialProtocol }
     *     
     */
    public void setClinicalTrialProtocol(ProtocolAssociation.ClinicalTrialProtocol value) {
        this.clinicalTrialProtocol = value;
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
     * Gets the value of the ctepname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTEPNAME() {
        return ctepname;
    }

    /**
     * Sets the value of the ctepname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTEPNAME(String value) {
        this.ctepname = value;
    }

    /**
     * Gets the value of the diseaseCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiseaseCategory() {
        return diseaseCategory;
    }

    /**
     * Sets the value of the diseaseCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiseaseCategory(String value) {
        this.diseaseCategory = value;
    }

    /**
     * Gets the value of the diseaseSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiseaseSubCategory() {
        return diseaseSubCategory;
    }

    /**
     * Sets the value of the diseaseSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiseaseSubCategory(String value) {
        this.diseaseSubCategory = value;
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
     * Gets the value of the imtcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIMTCODE() {
        return imtcode;
    }

    /**
     * Sets the value of the imtcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIMTCODE(Long value) {
        this.imtcode = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ClinicalTrialProtocol" minOccurs="0"/>
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
    public static class ClinicalTrialProtocol {

        @XmlElement(name = "ClinicalTrialProtocol")
        protected gov.nih.nlm.cabio.jaxb.generated.common.domain.ClinicalTrialProtocol clinicalTrialProtocol;

        /**
         * Gets the value of the clinicalTrialProtocol property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.common.domain.ClinicalTrialProtocol }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.common.domain.ClinicalTrialProtocol getClinicalTrialProtocol() {
            return clinicalTrialProtocol;
        }

        /**
         * Sets the value of the clinicalTrialProtocol property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.common.domain.ClinicalTrialProtocol }
         *     
         */
        public void setClinicalTrialProtocol(gov.nih.nlm.cabio.jaxb.generated.common.domain.ClinicalTrialProtocol value) {
            this.clinicalTrialProtocol = value;
        }

    }

}
