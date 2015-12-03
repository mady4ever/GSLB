
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLoadBalanceResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLoadBalanceResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="loadBalanceInfo" type="{urn:com:verisign:dnsa:api:schema:2}LoadBalanceResType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLoadBalanceResType", propOrder = {
    "loadBalanceInfo"
})
public class GetLoadBalanceResType
    extends BaseDnsaResType
{

    protected LoadBalanceResType loadBalanceInfo;

    /**
     * Gets the value of the loadBalanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBalanceResType }
     *     
     */
    public LoadBalanceResType getLoadBalanceInfo() {
        return loadBalanceInfo;
    }

    /**
     * Sets the value of the loadBalanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBalanceResType }
     *     
     */
    public void setLoadBalanceInfo(LoadBalanceResType value) {
        this.loadBalanceInfo = value;
    }

}
