
package com.verisign.dnsa.messaging.schema._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.verisign.dnsa.messaging.schema._1 package. 
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

    private final static QName _ReliableMessageRes_QNAME = new QName("urn:com:verisign:dnsa:messaging:schema:1", "reliableMessageRes");
    private final static QName _ReliableMessageReq_QNAME = new QName("urn:com:verisign:dnsa:messaging:schema:1", "reliableMessageReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.verisign.dnsa.messaging.schema._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link HeaderBaseType }
     * 
     */
    public HeaderBaseType createHeaderBaseType() {
        return new HeaderBaseType();
    }

    /**
     * Create an instance of {@link EmptyType }
     * 
     */
    public EmptyType createEmptyType() {
        return new EmptyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:verisign:dnsa:messaging:schema:1", name = "reliableMessageRes")
    public JAXBElement<ResponseType> createReliableMessageRes(ResponseType value) {
        return new JAXBElement<ResponseType>(_ReliableMessageRes_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:verisign:dnsa:messaging:schema:1", name = "reliableMessageReq")
    public JAXBElement<RequestType> createReliableMessageReq(RequestType value) {
        return new JAXBElement<RequestType>(_ReliableMessageReq_QNAME, RequestType.class, null, value);
    }

}
