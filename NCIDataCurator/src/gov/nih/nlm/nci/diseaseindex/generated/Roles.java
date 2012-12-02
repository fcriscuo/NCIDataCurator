//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.13 at 11:40:13 AM PDT 
//


package gov.nih.nlm.nci.diseaseindex.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}PrimaryNCIRoleCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OtherRole" maxOccurs="unbounded" minOccurs="0"/>
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
    "primaryNCIRoleCode",
    "otherRole"
})
@XmlRootElement(name = "Roles")
public class Roles {

    @XmlElement(name = "PrimaryNCIRoleCode")
    protected List<String> primaryNCIRoleCode;
    @XmlElement(name = "OtherRole")
    protected List<String> otherRole;

    /**
     * Gets the value of the primaryNCIRoleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryNCIRoleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryNCIRoleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrimaryNCIRoleCode() {
        if (primaryNCIRoleCode == null) {
            primaryNCIRoleCode = new ArrayList<String>();
        }
        return this.primaryNCIRoleCode;
    }

    /**
     * Gets the value of the otherRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherRole() {
        if (otherRole == null) {
            otherRole = new ArrayList<String>();
        }
        return this.otherRole;
    }

}
