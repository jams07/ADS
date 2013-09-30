
package adscliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the adscliente package. 
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

    private final static QName _ConvertAreaResponse_QNAME = new QName("http://ads.com/", "ConvertAreaResponse");
    private final static QName _ConvertArea_QNAME = new QName("http://ads.com/", "ConvertArea");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: adscliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertAreaResponse }
     * 
     */
    public ConvertAreaResponse createConvertAreaResponse() {
        return new ConvertAreaResponse();
    }

    /**
     * Create an instance of {@link ConvertArea }
     * 
     */
    public ConvertArea createConvertArea() {
        return new ConvertArea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ads.com/", name = "ConvertAreaResponse")
    public JAXBElement<ConvertAreaResponse> createConvertAreaResponse(ConvertAreaResponse value) {
        return new JAXBElement<ConvertAreaResponse>(_ConvertAreaResponse_QNAME, ConvertAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ads.com/", name = "ConvertArea")
    public JAXBElement<ConvertArea> createConvertArea(ConvertArea value) {
        return new JAXBElement<ConvertArea>(_ConvertArea_QNAME, ConvertArea.class, null, value);
    }

}
