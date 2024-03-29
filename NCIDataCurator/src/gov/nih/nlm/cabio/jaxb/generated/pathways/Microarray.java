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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Microarray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Microarray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrayReporterCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ArrayReporter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="annotationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="annotationVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bigid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbSNPVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genomeVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="LSID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Microarray", propOrder = {
    "arrayReporterCollection"
})
public class Microarray {

    protected Microarray.ArrayReporterCollection arrayReporterCollection;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar annotationDate;
    @XmlAttribute
    protected String annotationVersion;
    @XmlAttribute
    protected String bigid;
    @XmlAttribute
    protected String dbSNPVersion;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    protected String genomeVersion;
    @XmlAttribute
    protected Long id;
    @XmlAttribute(name = "LSID")
    protected String lsid;
    @XmlAttribute
    protected String manufacturer;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String type;

    /**
     * Gets the value of the arrayReporterCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Microarray.ArrayReporterCollection }
     *     
     */
    public Microarray.ArrayReporterCollection getArrayReporterCollection() {
        return arrayReporterCollection;
    }

    /**
     * Sets the value of the arrayReporterCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Microarray.ArrayReporterCollection }
     *     
     */
    public void setArrayReporterCollection(Microarray.ArrayReporterCollection value) {
        this.arrayReporterCollection = value;
    }

    /**
     * Gets the value of the annotationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnotationDate() {
        return annotationDate;
    }

    /**
     * Sets the value of the annotationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnotationDate(XMLGregorianCalendar value) {
        this.annotationDate = value;
    }

    /**
     * Gets the value of the annotationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationVersion() {
        return annotationVersion;
    }

    /**
     * Sets the value of the annotationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationVersion(String value) {
        this.annotationVersion = value;
    }

    /**
     * Gets the value of the bigid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBigid() {
        return bigid;
    }

    /**
     * Sets the value of the bigid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBigid(String value) {
        this.bigid = value;
    }

    /**
     * Gets the value of the dbSNPVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbSNPVersion() {
        return dbSNPVersion;
    }

    /**
     * Sets the value of the dbSNPVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbSNPVersion(String value) {
        this.dbSNPVersion = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the genomeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenomeVersion() {
        return genomeVersion;
    }

    /**
     * Sets the value of the genomeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenomeVersion(String value) {
        this.genomeVersion = value;
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
     * Gets the value of the lsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSID() {
        return lsid;
    }

    /**
     * Sets the value of the lsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSID(String value) {
        this.lsid = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     *         &lt;element ref="{gme://caCORE.caBIO/4.3/gov.nih.nci.cabio.domain}ArrayReporter" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class ArrayReporterCollection {

        @XmlElement(name = "ArrayReporter")
        protected List<ArrayReporter> arrayReporter;

        /**
         * Gets the value of the arrayReporter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arrayReporter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArrayReporter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayReporter }
         * 
         * 
         */
        public List<ArrayReporter> getArrayReporter() {
            if (arrayReporter == null) {
                arrayReporter = new ArrayList<ArrayReporter>();
            }
            return this.arrayReporter;
        }

    }

}
