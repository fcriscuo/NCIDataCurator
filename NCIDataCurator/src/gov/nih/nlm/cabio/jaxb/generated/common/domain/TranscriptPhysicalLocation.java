//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 02:01:37 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.common.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranscriptPhysicalLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranscriptPhysicalLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}PhysicalLocation">
 *       &lt;sequence>
 *         &lt;element name="transcript" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Transcript" minOccurs="0"/>
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
@XmlType(name = "TranscriptPhysicalLocation", propOrder = {
    "transcript"
})
public class TranscriptPhysicalLocation
    extends PhysicalLocation
{

    protected TranscriptPhysicalLocation.Transcript transcript;

    /**
     * Gets the value of the transcript property.
     * 
     * @return
     *     possible object is
     *     {@link TranscriptPhysicalLocation.Transcript }
     *     
     */
    public TranscriptPhysicalLocation.Transcript getTranscript() {
        return transcript;
    }

    /**
     * Sets the value of the transcript property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranscriptPhysicalLocation.Transcript }
     *     
     */
    public void setTranscript(TranscriptPhysicalLocation.Transcript value) {
        this.transcript = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}Transcript" minOccurs="0"/>
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
        "transcript"
    })
    public static class Transcript {

        @XmlElement(name = "Transcript")
        protected gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript transcript;

        /**
         * Gets the value of the transcript property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript }
         *     
         */
        public gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript getTranscript() {
            return transcript;
        }

        /**
         * Sets the value of the transcript property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript }
         *     
         */
        public void setTranscript(gov.nih.nlm.cabio.jaxb.generated.common.domain.Transcript value) {
            this.transcript = value;
        }

    }

}
