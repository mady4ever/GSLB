
package com.verisign.dnsa.auth.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userToken" type="{urn:com:verisign:dnsa:auth:schema:1}UserTokenType"/>
 *         &lt;element name="customerContext" type="{urn:com:verisign:dnsa:auth:schema:1}CustomerContextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthInfoType", propOrder = {
    "userToken",
    "customerContext"
})
public class AuthInfoType {

    @XmlElement(required = true)
    protected UserTokenType userToken;
    protected CustomerContextType customerContext;

    /**
     * Gets the value of the userToken property.
     * 
     * @return
     *     possible object is
     *     {@link UserTokenType }
     *     
     */
    public UserTokenType getUserToken() {
        return userToken;
    }

    /**
     * Sets the value of the userToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTokenType }
     *     
     */
    public void setUserToken(UserTokenType value) {
        this.userToken = value;
    }

    /**
     * Gets the value of the customerContext property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerContextType }
     *     
     */
    public CustomerContextType getCustomerContext() {
        return customerContext;
    }

    /**
     * Sets the value of the customerContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerContextType }
     *     
     */
    public void setCustomerContext(CustomerContextType value) {
        this.customerContext = value;
    }

}
