
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerListResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerListResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="resellerCustomer" type="{urn:com:verisign:dnsa:api:schema:1}ResellerCustomerInfo"/>
 *           &lt;element name="resellerAffiliate" type="{urn:com:verisign:dnsa:api:schema:1}CustomerInfo"/>
 *           &lt;element name="resellerAffiliateCustomer" type="{urn:com:verisign:dnsa:api:schema:1}ResellerCustomerInfo"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerListResType", propOrder = {
    "totalCount",
    "resellerCustomerOrResellerAffiliateOrResellerAffiliateCustomer"
})
public class CustomerListResType
    extends BaseDnsaResType
{

    protected int totalCount;
    @XmlElementRefs({
        @XmlElementRef(name = "resellerAffiliateCustomer", namespace = "urn:com:verisign:dnsa:api:schema:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "resellerAffiliate", namespace = "urn:com:verisign:dnsa:api:schema:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "resellerCustomer", namespace = "urn:com:verisign:dnsa:api:schema:1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends CustomerInfo>> resellerCustomerOrResellerAffiliateOrResellerAffiliateCustomer;

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the resellerCustomerOrResellerAffiliateOrResellerAffiliateCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resellerCustomerOrResellerAffiliateOrResellerAffiliateCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResellerCustomerOrResellerAffiliateOrResellerAffiliateCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ResellerCustomerInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link ResellerCustomerInfo }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends CustomerInfo>> getResellerCustomerOrResellerAffiliateOrResellerAffiliateCustomer() {
        if (resellerCustomerOrResellerAffiliateOrResellerAffiliateCustomer == null) {
            resellerCustomerOrResellerAffiliateOrResellerAffiliateCustomer = new ArrayList<JAXBElement<? extends CustomerInfo>>();
        }
        return this.resellerCustomerOrResellerAffiliateOrResellerAffiliateCustomer;
    }

}
