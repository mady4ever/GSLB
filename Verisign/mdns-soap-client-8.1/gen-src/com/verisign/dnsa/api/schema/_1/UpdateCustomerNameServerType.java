
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCustomerNameServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomerNameServerType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="nameServer" type="{urn:com:verisign:dnsa:api:schema:1}CustomerNameServer"/>
 *         &lt;element name="tsigInfo" type="{urn:com:verisign:dnsa:api:schema:1}TSIGInfoType"/>
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
@XmlType(name = "UpdateCustomerNameServerType", propOrder = {
    "nameServer",
    "tsigInfo"
})
public class UpdateCustomerNameServerType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected CustomerNameServer nameServer;
    @XmlElement(required = true)
    protected TSIGInfoType tsigInfo;

    /**
     * Gets the value of the nameServer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameServer }
     *     
     */
    public CustomerNameServer getNameServer() {
        return nameServer;
    }

    /**
     * Sets the value of the nameServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameServer }
     *     
     */
    public void setNameServer(CustomerNameServer value) {
        this.nameServer = value;
    }

    /**
     * Gets the value of the tsigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TSIGInfoType }
     *     
     */
    public TSIGInfoType getTsigInfo() {
        return tsigInfo;
    }

    /**
     * Sets the value of the tsigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSIGInfoType }
     *     
     */
    public void setTsigInfo(TSIGInfoType value) {
        this.tsigInfo = value;
    }

}
