
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCustomerWithServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustomerWithServicesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="resellerCustomer" type="{urn:com:verisign:dnsa:api:schema:1}CustomerWithServicesType"/>
 *           &lt;element name="resellerAffiliate" type="{urn:com:verisign:dnsa:api:schema:1}CustomerInfo"/>
 *           &lt;element name="resellerAffiliateCustomer" type="{urn:com:verisign:dnsa:api:schema:1}CustomerWithServicesType"/>
 *         &lt;/choice>
 *         &lt;element name="masterUser" type="{urn:com:verisign:dnsa:api:schema:1}UserInfo"/>
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
@XmlType(name = "CreateCustomerWithServicesType", propOrder = {
    "resellerCustomer",
    "resellerAffiliate",
    "resellerAffiliateCustomer",
    "masterUser"
})
public class CreateCustomerWithServicesType
    extends BaseExtensibleType
{

    protected CustomerWithServicesType resellerCustomer;
    protected CustomerInfo resellerAffiliate;
    protected CustomerWithServicesType resellerAffiliateCustomer;
    @XmlElement(required = true)
    protected UserInfo masterUser;

    /**
     * Gets the value of the resellerCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerWithServicesType }
     *     
     */
    public CustomerWithServicesType getResellerCustomer() {
        return resellerCustomer;
    }

    /**
     * Sets the value of the resellerCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerWithServicesType }
     *     
     */
    public void setResellerCustomer(CustomerWithServicesType value) {
        this.resellerCustomer = value;
    }

    /**
     * Gets the value of the resellerAffiliate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo }
     *     
     */
    public CustomerInfo getResellerAffiliate() {
        return resellerAffiliate;
    }

    /**
     * Sets the value of the resellerAffiliate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo }
     *     
     */
    public void setResellerAffiliate(CustomerInfo value) {
        this.resellerAffiliate = value;
    }

    /**
     * Gets the value of the resellerAffiliateCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerWithServicesType }
     *     
     */
    public CustomerWithServicesType getResellerAffiliateCustomer() {
        return resellerAffiliateCustomer;
    }

    /**
     * Sets the value of the resellerAffiliateCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerWithServicesType }
     *     
     */
    public void setResellerAffiliateCustomer(CustomerWithServicesType value) {
        this.resellerAffiliateCustomer = value;
    }

    /**
     * Gets the value of the masterUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getMasterUser() {
        return masterUser;
    }

    /**
     * Sets the value of the masterUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     */
    public void setMasterUser(UserInfo value) {
        this.masterUser = value;
    }

}
