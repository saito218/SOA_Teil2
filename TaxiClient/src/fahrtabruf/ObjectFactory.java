
package fahrtabruf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fahrtabruf package. 
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

    private final static QName _GetFahrtlisteMitDatum_QNAME = new QName("http://fahrtabruf/", "getFahrtlisteMitDatum");
    private final static QName _GetFahrtlisteMitDatumResponse_QNAME = new QName("http://fahrtabruf/", "getFahrtlisteMitDatumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fahrtabruf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFahrtlisteMitDatum }
     * 
     */
    public GetFahrtlisteMitDatum createGetFahrtlisteMitDatum() {
        return new GetFahrtlisteMitDatum();
    }

    /**
     * Create an instance of {@link GetFahrtlisteMitDatumResponse }
     * 
     */
    public GetFahrtlisteMitDatumResponse createGetFahrtlisteMitDatumResponse() {
        return new GetFahrtlisteMitDatumResponse();
    }

    /**
     * Create an instance of {@link Taxi }
     * 
     */
    public Taxi createTaxi() {
        return new Taxi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFahrtlisteMitDatum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFahrtlisteMitDatum }{@code >}
     */
    @XmlElementDecl(namespace = "http://fahrtabruf/", name = "getFahrtlisteMitDatum")
    public JAXBElement<GetFahrtlisteMitDatum> createGetFahrtlisteMitDatum(GetFahrtlisteMitDatum value) {
        return new JAXBElement<GetFahrtlisteMitDatum>(_GetFahrtlisteMitDatum_QNAME, GetFahrtlisteMitDatum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFahrtlisteMitDatumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFahrtlisteMitDatumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://fahrtabruf/", name = "getFahrtlisteMitDatumResponse")
    public JAXBElement<GetFahrtlisteMitDatumResponse> createGetFahrtlisteMitDatumResponse(GetFahrtlisteMitDatumResponse value) {
        return new JAXBElement<GetFahrtlisteMitDatumResponse>(_GetFahrtlisteMitDatumResponse_QNAME, GetFahrtlisteMitDatumResponse.class, null, value);
    }

}
