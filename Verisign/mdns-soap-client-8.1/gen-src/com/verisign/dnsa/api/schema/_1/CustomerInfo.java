
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custContact" type="{urn:com:verisign:dnsa:api:schema:1}ContactInfo" minOccurs="0"/>
 *         &lt;element name="securityPhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusName" type="{urn:com:verisign:dnsa:api:schema:1}CustomerStatusType" minOccurs="0"/>
 *         &lt;element name="parentClientCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfo", propOrder = {
    "accountName",
    "clientCustomerId",
    "custContact",
    "securityPhrase",
    "comments",
    "statusName",
    "parentClientCustomerId"
})
@XmlSeeAlso({
    com.verisign.dnsa.api.schema._2.CustomerWithServicesType.class,
    ResellerCustomerInfo.class,
    com.verisign.dnsa.api.schema._1.CustomerWithServicesType.class
})
public class CustomerInfo
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String accountName;
    @XmlElement(required = true)
    protected String clientCustomerId;
    protected ContactInfo custContact;
    protected String securityPhrase;
    protected String comments;
    protected CustomerStatusType statusName;
    protected String parentClientCustomerId;

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the clientCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCustomerId() {
        return clientCustomerId;
    }

    /**
     * Sets the value of the clientCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCustomerId(String value) {
        this.clientCustomerId = value;
    }

    /**
     * Gets the value of the custContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getCustContact() {
        return custContact;
    }

    /**
     * Sets the value of the custContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setCustContact(ContactInfo value) {
        this.custContact = value;
    }

    /**
     * Gets the value of the securityPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityPhrase() {
        return securityPhrase;
    }

    /**
     * Sets the value of the securityPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityPhrase(String value) {
        this.securityPhrase = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerStatusType }
     *     
     */
    public CustomerStatusType getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerStatusType }
     *     
     */
    public void setStatusName(CustomerStatusType value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the parentClientCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentClientCustomerId() {
        return parentClientCustomerId;
    }

    /**
     * Sets the value of the parentClientCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentClientCustomerId(String value) {
        this.parentClientCustomerId = value;
    }

}
