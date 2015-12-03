
package com.verisign.dnsa.auth.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResellerAffiliateCustomerContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResellerAffiliateCustomerContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resellerAffiliateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resellerAffiliateCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResellerAffiliateCustomerContextType", propOrder = {
    "resellerAffiliateId",
    "resellerAffiliateCustomerId"
})
public class ResellerAffiliateCustomerContextType {

    @XmlElement(required = true)
    protected String resellerAffiliateId;
    @XmlElement(required = true)
    protected String resellerAffiliateCustomerId;

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
     * Gets the value of the resellerAffiliateCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerAffiliateCustomerId() {
        return resellerAffiliateCustomerId;
    }

    /**
     * Sets the value of the resellerAffiliateCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerAffiliateCustomerId(String value) {
        this.resellerAffiliateCustomerId = value;
    }

}
