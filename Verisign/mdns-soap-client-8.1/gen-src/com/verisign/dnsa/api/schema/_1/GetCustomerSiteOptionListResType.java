
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerSiteOptionListResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerSiteOptionListResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="resolutionSiteSet" type="{urn:com:verisign:dnsa:api:schema:1}SiteOptionInfo"/>
 *         &lt;element name="standardSiteOption" type="{urn:com:verisign:dnsa:api:schema:1}SiteOptionInfo" maxOccurs="unbounded"/>
 *         &lt;element name="customerSiteOption" type="{urn:com:verisign:dnsa:api:schema:1}SiteOptionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerSiteOptionListResType", propOrder = {
    "resolutionSiteSet",
    "standardSiteOption",
    "customerSiteOption"
})
public class GetCustomerSiteOptionListResType
    extends BaseDnsaResType
{

    @XmlElement(required = true)
    protected SiteOptionInfo resolutionSiteSet;
    @XmlElement(required = true)
    protected List<SiteOptionInfo> standardSiteOption;
    protected List<SiteOptionInfo> customerSiteOption;

    /**
     * Gets the value of the resolutionSiteSet property.
     * 
     * @return
     *     possible object is
     *     {@link SiteOptionInfo }
     *     
     */
    public SiteOptionInfo getResolutionSiteSet() {
        return resolutionSiteSet;
    }

    /**
     * Sets the value of the resolutionSiteSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteOptionInfo }
     *     
     */
    public void setResolutionSiteSet(SiteOptionInfo value) {
        this.resolutionSiteSet = value;
    }

    /**
     * Gets the value of the standardSiteOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardSiteOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardSiteOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteOptionInfo }
     * 
     * 
     */
    public List<SiteOptionInfo> getStandardSiteOption() {
        if (standardSiteOption == null) {
            standardSiteOption = new ArrayList<SiteOptionInfo>();
        }
        return this.standardSiteOption;
    }

    /**
     * Gets the value of the customerSiteOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerSiteOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerSiteOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteOptionInfo }
     * 
     * 
     */
    public List<SiteOptionInfo> getCustomerSiteOption() {
        if (customerSiteOption == null) {
            customerSiteOption = new ArrayList<SiteOptionInfo>();
        }
        return this.customerSiteOption;
    }

}
