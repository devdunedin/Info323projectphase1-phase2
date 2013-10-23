
package sign;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sign package. 
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

    private final static QName _SignCalculator_QNAME = new QName("http://sign/", "signCalculator");
    private final static QName _SignCalculatorResponse_QNAME = new QName("http://sign/", "signCalculatorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sign
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignCalculator }
     * 
     */
    public SignCalculator createSignCalculator() {
        return new SignCalculator();
    }

    /**
     * Create an instance of {@link SignCalculatorResponse }
     * 
     */
    public SignCalculatorResponse createSignCalculatorResponse() {
        return new SignCalculatorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignCalculator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sign/", name = "signCalculator")
    public JAXBElement<SignCalculator> createSignCalculator(SignCalculator value) {
        return new JAXBElement<SignCalculator>(_SignCalculator_QNAME, SignCalculator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignCalculatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sign/", name = "signCalculatorResponse")
    public JAXBElement<SignCalculatorResponse> createSignCalculatorResponse(SignCalculatorResponse value) {
        return new JAXBElement<SignCalculatorResponse>(_SignCalculatorResponse_QNAME, SignCalculatorResponse.class, null, value);
    }

}
