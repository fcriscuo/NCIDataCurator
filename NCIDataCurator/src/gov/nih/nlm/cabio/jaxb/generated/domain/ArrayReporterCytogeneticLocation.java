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
 * <p>Java class for ArrayReporterCytogeneticLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayReporterCytogeneticLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}CytogeneticLocation">
 *       &lt;sequence>
 *         &lt;element name="arrayReporter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ArrayReporter" minOccurs="0"/>
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
@XmlType(name = "ArrayReporterCytogeneticLocation", propOrder = {
    "arrayReporter"
})
public class ArrayReporterCytogeneticLocation
    extends CytogeneticLocation
{

    protected ArrayReporterCytogeneticLocation.ArrayReporter arrayReporter;

    /**
     * Gets the value of the arrayReporter property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayReporterCytogeneticLocation.ArrayReporter }
     *     
     */
    public ArrayReporterCytogeneticLocation.ArrayReporter getArrayReporter() {
        return arrayReporter;
    }

    /**
     * Sets the value of the arrayReporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayReporterCytogeneticLocation.ArrayReporter }
     *     
     */
    public void setArrayReporter(ArrayReporterCytogeneticLocation.ArrayReporter value) {
        this.arrayReporter = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ArrayReporter" minOccurs="0"/>
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
        "arrayReporter"
    })
    public static class ArrayReporter {

        @XmlElement(name = "ArrayReporter")
        protected gov.nih.nlm.cabio.jaxb.generated.domain.ArrayReporter arrayReporter;

        /**
         * Gets the value of the arrayReporter property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.ArrayReporter }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.domain.ArrayReporter getArrayReporter() {
            return arrayReporter;
        }

        /**
         * Sets the value of the arrayReporter property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.ArrayReporter }
         *     
         */
        public void setArrayReporter(gov.nih.nlm.cabio.jaxb.generated.domain.ArrayReporter value) {
            this.arrayReporter = value;
        }

    }

}