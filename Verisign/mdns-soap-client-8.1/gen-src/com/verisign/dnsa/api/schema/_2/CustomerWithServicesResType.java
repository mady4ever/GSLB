
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.CustomerInfo;
import com.verisign.dnsa.api.schema._1.CustomerWithServicesType;


/**
 * <p>Java class for CustomerWithServicesResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerWithServicesResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseDnsaResType">
 *       &lt;choice>
 *         &lt;element name="resellerCustomer" type="{urn:com:verisign:dnsa:api:schema:1}CustomerWithServicesType"/>
 *         &lt;element name="resellerAffiliate" type="{urn:com:verisign:dnsa:api:schema:1}CustomerInfo"/>
 *         &lt;element name="resellerAffiliateCustomer" type="{urn:com:verisign:dnsa:api:schema:1}CustomerWithServicesType"/>
 *         &lt;element name="directCustomer" type="{urn:com:verisign:dnsa:api:schema:1}CustomerWithServicesType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerWithServicesResType", propOrder = {
    "resellerCustomer",
    "resellerAffiliate",
    "resellerAffiliateCustomer",
    "directCustomer"
})
public class CustomerWithServicesResType
    extends BaseDnsaResType
{

    protected CustomerWithServicesType resellerCustomer;
    protected CustomerInfo resellerAffiliate;
    protected CustomerWithServicesType resellerAffiliateCustomer;
    protected CustomerWithServicesType directCustomer;

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
     * Gets the value of the directCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerWithServicesType }
     *     
     */
    public CustomerWithServicesType getDirectCustomer() {
        return directCustomer;
    }

    /**
     * Sets the value of the directCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerWithServicesType }
     *     
     */
    public void setDirectCustomer(CustomerWithServicesType value) {
        this.directCustomer = value;
    }

}
