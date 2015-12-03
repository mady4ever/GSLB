
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResellerCustomerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResellerCustomerInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}CustomerInfo">
 *       &lt;sequence>
 *         &lt;element name="pkgInfo" type="{urn:com:verisign:dnsa:api:schema:1}CustomerPackageInfo"/>
 *         &lt;element name="failoverService" type="{urn:com:verisign:dnsa:api:schema:1}CustomerFailoverServiceInfo" minOccurs="0"/>
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
@XmlType(name = "ResellerCustomerInfo", propOrder = {
    "pkgInfo",
    "failoverService"
})
public class ResellerCustomerInfo
    extends CustomerInfo
{

    @XmlElement(required = true)
    protected CustomerPackageInfo pkgInfo;
    protected CustomerFailoverServiceInfo failoverService;

    /**
     * Gets the value of the pkgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPackageInfo }
     *     
     */
    public CustomerPackageInfo getPkgInfo() {
        return pkgInfo;
    }

    /**
     * Sets the value of the pkgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPackageInfo }
     *     
     */
    public void setPkgInfo(CustomerPackageInfo value) {
        this.pkgInfo = value;
    }

    /**
     * Gets the value of the failoverService property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFailoverServiceInfo }
     *     
     */
    public CustomerFailoverServiceInfo getFailoverService() {
        return failoverService;
    }

    /**
     * Sets the value of the failoverService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFailoverServiceInfo }
     *     
     */
    public void setFailoverService(CustomerFailoverServiceInfo value) {
        this.failoverService = value;
    }

}
