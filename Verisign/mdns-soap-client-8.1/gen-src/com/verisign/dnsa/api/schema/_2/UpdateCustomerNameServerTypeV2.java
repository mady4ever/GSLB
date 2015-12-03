
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.BaseExtensibleType;


/**
 * <p>Java class for UpdateCustomerNameServerType_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomerNameServerType_V2">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="existingIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newNameServerInfo" type="{urn:com:verisign:dnsa:api:schema:2}NameServerInfo_V2"/>
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
@XmlType(name = "UpdateCustomerNameServerType_V2", propOrder = {
    "existingIPAddress",
    "newNameServerInfo"
})
public class UpdateCustomerNameServerTypeV2
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String existingIPAddress;
    @XmlElement(required = true)
    protected NameServerInfoV2 newNameServerInfo;

    /**
     * Gets the value of the existingIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingIPAddress() {
        return existingIPAddress;
    }

    /**
     * Sets the value of the existingIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingIPAddress(String value) {
        this.existingIPAddress = value;
    }

    /**
     * Gets the value of the newNameServerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NameServerInfoV2 }
     *     
     */
    public NameServerInfoV2 getNewNameServerInfo() {
        return newNameServerInfo;
    }

    /**
     * Sets the value of the newNameServerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameServerInfoV2 }
     *     
     */
    public void setNewNameServerInfo(NameServerInfoV2 value) {
        this.newNameServerInfo = value;
    }

}
