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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyMember">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}PhysicalParticipant">
 *       &lt;sequence>
 *         &lt;element name="familyCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}PhysicalEntity" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyMember", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways", propOrder = {
    "familyCollection"
})
public class FamilyMember
    extends PhysicalParticipant
{

    protected FamilyMember.FamilyCollection familyCollection;

    /**
     * Gets the value of the familyCollection property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyMember.FamilyCollection }
     *     
     */
    public FamilyMember.FamilyCollection getFamilyCollection() {
        return familyCollection;
    }

    /**
     * Sets the value of the familyCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyMember.FamilyCollection }
     *     
     */
    public void setFamilyCollection(FamilyMember.FamilyCollection value) {
        this.familyCollection = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways}PhysicalEntity" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class FamilyCollection {

        @XmlElement(name = "PhysicalEntity", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways")
        protected List<PhysicalEntity> physicalEntity;

        /**
         * Gets the value of the physicalEntity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the physicalEntity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhysicalEntity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhysicalEntity }
         * 
         * 
         */
        public List<PhysicalEntity> getPhysicalEntity() {
            if (physicalEntity == null) {
                physicalEntity = new ArrayList<PhysicalEntity>();
            }
            return this.physicalEntity;
        }

    }

}
