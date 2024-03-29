//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 01:55:55 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CytobandPhysicalLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CytobandPhysicalLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}PhysicalLocation">
 *       &lt;sequence>
 *         &lt;element name="cytoband" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Cytoband" minOccurs="0"/>
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
@XmlType(name = "CytobandPhysicalLocation", propOrder = {
    "cytoband"
})
public class CytobandPhysicalLocation
    extends PhysicalLocation
{

    protected CytobandPhysicalLocation.Cytoband cytoband;

    /**
     * Gets the value of the cytoband property.
     * 
     * @return
     *     possible object is
     *     {@link CytobandPhysicalLocation.Cytoband }
     *     
     */
    public CytobandPhysicalLocation.Cytoband getCytoband() {
        return cytoband;
    }

    /**
     * Sets the value of the cytoband property.
     * 
     * @param value
     *     allowed object is
     *     {@link CytobandPhysicalLocation.Cytoband }
     *     
     */
    public void setCytoband(CytobandPhysicalLocation.Cytoband value) {
        this.cytoband = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Cytoband" minOccurs="0"/>
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
        "cytoband"
    })
    public static class Cytoband {

        @XmlElement(name = "Cytoband")
        protected gov.nih.nlm.cabio.jaxb.generated.domain.Cytoband cytoband;

        /**
         * Gets the value of the cytoband property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Cytoband }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.domain.Cytoband getCytoband() {
            return cytoband;
        }

        /**
         * Sets the value of the cytoband property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.Cytoband }
         *     
         */
        public void setCytoband(gov.nih.nlm.cabio.jaxb.generated.domain.Cytoband value) {
            this.cytoband = value;
        }

    }

}
