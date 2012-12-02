//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 01:59:40 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.pathways;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SNPPhysicalLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SNPPhysicalLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}PhysicalLocation">
 *       &lt;sequence>
 *         &lt;element name="SNP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}SNP" minOccurs="0"/>
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
@XmlType(name = "SNPPhysicalLocation", propOrder = {
    "snp"
})
public class SNPPhysicalLocation
    extends PhysicalLocation
{

    @XmlElement(name = "SNP")
    protected SNPPhysicalLocation.SNP snp;

    /**
     * Gets the value of the snp property.
     * 
     * @return
     *     possible object is
     *     {@link SNPPhysicalLocation.SNP }
     *     
     */
    public SNPPhysicalLocation.SNP getSNP() {
        return snp;
    }

    /**
     * Sets the value of the snp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNPPhysicalLocation.SNP }
     *     
     */
    public void setSNP(SNPPhysicalLocation.SNP value) {
        this.snp = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}SNP" minOccurs="0"/>
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
        "snp"
    })
    public static class SNP {

        @XmlElement(name = "SNP")
        protected gov.nih.nlm.cabio.jaxb.generated.pathways.SNP snp;

        /**
         * Gets the value of the snp property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.pathways.SNP }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.pathways.SNP getSNP() {
            return snp;
        }

        /**
         * Sets the value of the snp property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.pathways.SNP }
         *     
         */
        public void setSNP(gov.nih.nlm.cabio.jaxb.generated.pathways.SNP value) {
            this.snp = value;
        }

    }

}
