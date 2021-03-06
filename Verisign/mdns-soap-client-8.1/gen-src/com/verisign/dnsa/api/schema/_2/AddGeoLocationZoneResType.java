
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.ZoneInfo;


/**
 * <p>Java class for AddGeoLocationZoneResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGeoLocationZoneResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="zoneInfo" type="{urn:com:verisign:dnsa:api:schema:1}ZoneInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGeoLocationZoneResType", propOrder = {
    "zoneInfo"
})
public class AddGeoLocationZoneResType
    extends BaseDnsaResType
{

    @XmlElement(required = true)
    protected ZoneInfo zoneInfo;

    /**
     * Gets the value of the zoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneInfo }
     *     
     */
    public ZoneInfo getZoneInfo() {
        return zoneInfo;
    }

    /**
     * Sets the value of the zoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneInfo }
     *     
     */
    public void setZoneInfo(ZoneInfo value) {
        this.zoneInfo = value;
    }

}
