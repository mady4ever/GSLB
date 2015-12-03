
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerInfoResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInfoResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;choice>
 *         &lt;element name="resellerCustomer" type="{urn:com:verisign:dnsa:api:schema:1}ResellerCustomerInfo"/>
 *         &lt;element name="resellerAffiliate" type="{urn:com:verisign:dnsa:api:schema:1}CustomerInfo"/>
 *         &lt;element name="resellerAffiliateCustomer" type="{urn:com:verisign:dnsa:api:schema:1}ResellerCustomerInfo"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfoResType", propOrder = {
    "resellerCustomer",
    "resellerAffiliate",
    "resellerAffiliateCustomer"
})
public class CustomerInfoResType
    extends BaseDnsaResType
{

    protected ResellerCustomerInfo resellerCustomer;
    protected CustomerInfo resellerAffiliate;
    protected ResellerCustomerInfo resellerAffiliateCustomer;

    /**
     * Gets the value of the resellerCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ResellerCustomerInfo }
     *     
     */
    public ResellerCustomerInfo getResellerCustomer() {
        return resellerCustomer;
    }

    /**
     * Sets the value of the resellerCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResellerCustomerInfo }
     *     
     */
    public void setResellerCustomer(ResellerCustomerInfo value) {
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
     *     {@link ResellerCustomerInfo }
     *     
     */
    public ResellerCustomerInfo getResellerAffiliateCustomer() {
        return resellerAffiliateCustomer;
    }

    /**
     * Sets the value of the resellerAffiliateCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResellerCustomerInfo }
     *     
     */
    public void setResellerAffiliateCustomer(ResellerCustomerInfo value) {
        this.resellerAffiliateCustomer = value;
    }

}
