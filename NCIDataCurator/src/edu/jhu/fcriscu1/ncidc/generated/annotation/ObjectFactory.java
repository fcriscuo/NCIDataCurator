//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.16 at 05:27:37 PM PDT 
//


package edu.jhu.fcriscu1.ncidc.generated.annotation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.jhu.fcriscu1.ncidc.generated.annotation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HugoSymbol_QNAME = new QName("", "HugoSymbol");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.jhu.fcriscu1.ncidc.generated.annotation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApplicationAnnotationCollection }
     * 
     */
    public ApplicationAnnotationCollection createApplicationAnnotationCollection() {
        return new ApplicationAnnotationCollection();
    }

    /**
     * Create an instance of {@link ApplicationAnnotation }
     * 
     */
    public ApplicationAnnotation createApplicationAnnotation() {
        return new ApplicationAnnotation();
    }

    /**
     * Create an instance of {@link ApplicationUser }
     * 
     */
    public ApplicationUser createApplicationUser() {
        return new ApplicationUser();
    }

    /**
     * Create an instance of {@link AnnotationEvidence }
     * 
     */
    public AnnotationEvidence createAnnotationEvidence() {
        return new AnnotationEvidence();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HugoSymbol")
    public JAXBElement<String> createHugoSymbol(String value) {
        return new JAXBElement<String>(_HugoSymbol_QNAME, String.class, null, value);
    }

}
