
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.BaseDnsaResType;


/**
 * <p>Java class for UpdateCustomerNameServerResType_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomerNameServerResType_V2">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="nameServerInfo" type="{urn:com:verisign:dnsa:api:schema:2}NameServerInfo_V2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCustomerNameServerResType_V2", propOrder = {
    "nameServerInfo"
})
public class UpdateCustomerNameServerResTypeV2
    extends BaseDnsaResType
{

    @XmlElement(required = true)
    protected NameServerInfoV2 nameServerInfo;

    /**
     * Gets the value of the nameServerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NameServerInfoV2 }
     *     
     */
    public NameServerInfoV2 getNameServerInfo() {
        return nameServerInfo;
    }

    /**
     * Sets the value of the nameServerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameServerInfoV2 }
     *     
     */
    public void setNameServerInfo(NameServerInfoV2 value) {
        this.nameServerInfo = value;
    }

}
