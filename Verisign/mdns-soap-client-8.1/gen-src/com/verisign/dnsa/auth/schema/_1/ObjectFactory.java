
package com.verisign.dnsa.auth.schema._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.verisign.dnsa.auth.schema._1 package. 
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

    private final static QName _AuthInfo_QNAME = new QName("urn:com:verisign:dnsa:auth:schema:1", "authInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.verisign.dnsa.auth.schema._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthInfoType }
     * 
     */
    public AuthInfoType createAuthInfoType() {
        return new AuthInfoType();
    }

    /**
     * Create an instance of {@link CustomerContextType }
     * 
     */
    public CustomerContextType createCustomerContextType() {
        return new CustomerContextType();
    }

    /**
     * Create an instance of {@link UserTokenType }
     * 
     */
    public UserTokenType createUserTokenType() {
        return new UserTokenType();
    }

    /**
     * Create an instance of {@link ResellerAffiliateCustomerContextType }
     * 
     */
    public ResellerAffiliateCustomerContextType createResellerAffiliateCustomerContextType() {
        return new ResellerAffiliateCustomerContextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:verisign:dnsa:auth:schema:1", name = "authInfo")
    public JAXBElement<AuthInfoType> createAuthInfo(AuthInfoType value) {
        return new JAXBElement<AuthInfoType>(_AuthInfo_QNAME, AuthInfoType.class, null, value);
    }

}
