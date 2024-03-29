//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.09 at 02:02:26 PM PDT 
//


package gov.nih.nlm.cabio.jaxb.generated.common.provenance.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResearchInstitutionSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResearchInstitutionSource">
 *   &lt;complexContent>
 *     &lt;extension base="{gme://caCORE.caBIO/4.3/gov.nih.nci.common.provenance.domain}Source">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="institutionAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="institutionDepartment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="institutionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="institutionPersons" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResearchInstitutionSource")
public class ResearchInstitutionSource
    extends Source
{

    @XmlAttribute
    protected String institutionAddress;
    @XmlAttribute
    protected String institutionDepartment;
    @XmlAttribute
    protected String institutionName;
    @XmlAttribute
    protected String institutionPersons;

    /**
     * Gets the value of the institutionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionAddress() {
        return institutionAddress;
    }

    /**
     * Sets the value of the institutionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionAddress(String value) {
        this.institutionAddress = value;
    }

    /**
     * Gets the value of the institutionDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionDepartment() {
        return institutionDepartment;
    }

    /**
     * Sets the value of the institutionDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionDepartment(String value) {
        this.institutionDepartment = value;
    }

    /**
     * Gets the value of the institutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Sets the value of the institutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionName(String value) {
        this.institutionName = value;
    }

    /**
     * Gets the value of the institutionPersons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionPersons() {
        return institutionPersons;
    }

    /**
     * Sets the value of the institutionPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionPersons(String value) {
        this.institutionPersons = value;
    }

}
