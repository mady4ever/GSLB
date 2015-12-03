
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCustomerPackageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomerPackageInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="clientCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pkgInfo" type="{urn:com:verisign:dnsa:api:schema:1}CustomerPackageInfo"/>
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
@XmlType(name = "UpdateCustomerPackageInfoType", propOrder = {
    "clientCustomerId",
    "pkgInfo"
})
public class UpdateCustomerPackageInfoType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String clientCustomerId;
    @XmlElement(required = true)
    protected CustomerPackageInfo pkgInfo;

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

}
