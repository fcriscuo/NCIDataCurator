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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalParticipant">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}Participant">
 *       &lt;sequence>
 *         &lt;element name="physicalEntity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}PhysicalEntity" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="activityState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="postTranslationalMod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalParticipant", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways", propOrder = {
    "physicalEntity"
})
@XmlSeeAlso({
    Input.class,
    PositiveControl.class,
    Output.class,
    ComplexComponent.class,
    NegativeControl.class,
    FamilyMember.class
})
public class PhysicalParticipant
    extends Participant
{

    protected PhysicalParticipant.PhysicalEntity physicalEntity;
    @XmlAttribute
    protected String activityState;
    @XmlAttribute
    protected String location;
    @XmlAttribute
    protected String postTranslationalMod;

    /**
     * Gets the value of the physicalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalParticipant.PhysicalEntity }
     *     
     */
    public PhysicalParticipant.PhysicalEntity getPhysicalEntity() {
        return physicalEntity;
    }

    /**
     * Sets the value of the physicalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalParticipant.PhysicalEntity }
     *     
     */
    public void setPhysicalEntity(PhysicalParticipant.PhysicalEntity value) {
        this.physicalEntity = value;
    }

    /**
     * Gets the value of the activityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityState() {
        return activityState;
    }

    /**
     * Sets the value of the activityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityState(String value) {
        this.activityState = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the postTranslationalMod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTranslationalMod() {
        return postTranslationalMod;
    }

    /**
     * Sets the value of the postTranslationalMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTranslationalMod(String value) {
        this.postTranslationalMod = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}PhysicalEntity" minOccurs="0"/>
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
        "physicalEntity"
    })
    public static class PhysicalEntity {

        @XmlElement(name = "PhysicalEntity", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways")
        protected gov.nih.nlm.cabio.jaxb.generated.common.domain.PhysicalEntity physicalEntity;

        /**
         * Gets the value of the physicalEntity property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.common.domain.PhysicalEntity }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.common.domain.PhysicalEntity getPhysicalEntity() {
            return physicalEntity;
        }

        /**
         * Sets the value of the physicalEntity property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.common.domain.PhysicalEntity }
         *     
         */
        public void setPhysicalEntity(gov.nih.nlm.cabio.jaxb.generated.common.domain.PhysicalEntity value) {
            this.physicalEntity = value;
        }

    }

}
