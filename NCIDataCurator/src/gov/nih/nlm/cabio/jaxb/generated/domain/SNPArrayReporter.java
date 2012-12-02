//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 01:55:55 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SNPArrayReporter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SNPArrayReporter">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ArrayReporter">
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
 *       &lt;attribute name="phastConservation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SNPArrayReporter", propOrder = {
    "snp"
})
public class SNPArrayReporter
    extends ArrayReporter
{

    @XmlElement(name = "SNP")
    protected SNPArrayReporter.SNP snp;
    @XmlAttribute
    protected String phastConservation;

    /**
     * Gets the value of the snp property.
     * 
     * @return
     *     possible object is
     *     {@link SNPArrayReporter.SNP }
     *     
     */
    public SNPArrayReporter.SNP getSNP() {
        return snp;
    }

    /**
     * Sets the value of the snp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNPArrayReporter.SNP }
     *     
     */
    public void setSNP(SNPArrayReporter.SNP value) {
        this.snp = value;
    }

    /**
     * Gets the value of the phastConservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhastConservation() {
        return phastConservation;
    }

    /**
     * Sets the value of the phastConservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhastConservation(String value) {
        this.phastConservation = value;
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
        protected gov.nih.nlm.cabio.jaxb.generated.domain.SNP snp;

        /**
         * Gets the value of the snp property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.SNP }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.domain.SNP getSNP() {
            return snp;
        }

        /**
         * Sets the value of the snp property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.domain.SNP }
         *     
         */
        public void setSNP(gov.nih.nlm.cabio.jaxb.generated.domain.SNP value) {
            this.snp = value;
        }

    }

}
