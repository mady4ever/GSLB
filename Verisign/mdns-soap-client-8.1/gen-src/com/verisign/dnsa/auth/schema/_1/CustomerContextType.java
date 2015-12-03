
package com.verisign.dnsa.auth.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="resellerCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resellerAffiliateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resellerAffiliateCustomer" type="{urn:com:verisign:dnsa:auth:schema:1}ResellerAffiliateCustomerContextType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerContextType", propOrder = {
    "resellerCustomerId",
    "resellerAffiliateId",
    "resellerAffiliateCustomer"
})
public class CustomerContextType {

    protected String resellerCustomerId;
    protected String resellerAffiliateId;
    protected ResellerAffiliateCustomerContextType resellerAffiliateCustomer;

    /**
     * Gets the value of the resellerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerCustomerId() {
        return resellerCustomerId;
    }

    /**
     * Sets the value of the resellerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerCustomerId(String value) {
        this.resellerCustomerId = value;
    }

    /**
     * Gets the value of the resellerAffiliateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerAffiliateId() {
        return resellerAffiliateId;
    }

    /**
     * Sets the value of the resellerAffiliateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerAffiliateId(String value) {
        this.resellerAffiliateId = value;
    }

    /**
     * Gets the value of the resellerAffiliateCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ResellerAffiliateCustomerContextType }
     *     
     */
    public ResellerAffiliateCustomerContextType getResellerAffiliateCustomer() {
        return resellerAffiliateCustomer;
    }

    /**
     * Sets the value of the resellerAffiliateCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResellerAffiliateCustomerContextType }
     *     
     */
    public void setResellerAffiliateCustomer(ResellerAffiliateCustomerContextType value) {
        this.resellerAffiliateCustomer = value;
    }

}
