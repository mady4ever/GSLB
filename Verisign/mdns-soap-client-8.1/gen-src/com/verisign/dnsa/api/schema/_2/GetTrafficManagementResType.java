
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTrafficManagementResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTrafficManagementResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="trafficInfo" type="{urn:com:verisign:dnsa:api:schema:2}TrafficManagementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTrafficManagementResType", propOrder = {
    "trafficInfo"
})
public class GetTrafficManagementResType
    extends BaseDnsaResType
{

    protected TrafficManagementType trafficInfo;

    /**
     * Gets the value of the trafficInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficManagementType }
     *     
     */
    public TrafficManagementType getTrafficInfo() {
        return trafficInfo;
    }

    /**
     * Sets the value of the trafficInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficManagementType }
     *     
     */
    public void setTrafficInfo(TrafficManagementType value) {
        this.trafficInfo = value;
    }

}
