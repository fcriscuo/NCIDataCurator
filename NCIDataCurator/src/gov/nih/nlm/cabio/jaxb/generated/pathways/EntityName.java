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
 * <p>Java class for EntityName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="physicalEntityCollection" minOccurs="0">
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
@XmlType(name = "EntityName", namespace = "gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.pathways", propOrder = {
    "physicalEntityCollection"
})
public class EntityName {

    protected EntityName.PhysicalEntityCollection physicalEntityCollection;
    @XmlAttribute
    protected Long id;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the physicalEntityCollection property.
     * 
     * @return
     *     possible object is
     *     {@link EntityName.PhysicalEntityCollection }
     *     
     */
    public EntityName.PhysicalEntityCollection getPhysicalEntityCollection() {
        return physicalEntityCollection;
    }

    /**
     * Sets the value of the physicalEntityCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityName.PhysicalEntityCollection }
     *     
     */
    public void setPhysicalEntityCollection(EntityName.PhysicalEntityCollection value) {
        this.physicalEntityCollection = value;
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
    public static class PhysicalEntityCollection {

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
