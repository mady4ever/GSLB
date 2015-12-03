
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.BaseDnsaResType;
import com.verisign.dnsa.api.schema._1.SecondaryZoneInfo;


/**
 * <p>Java class for GetZoneInfoResType_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetZoneInfoResType_V2">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;choice>
 *         &lt;element name="primaryZoneInfo" type="{urn:com:verisign:dnsa:api:schema:2}PrimaryZoneInfo_V2"/>
 *         &lt;element name="secondaryZoneInfo" type="{urn:com:verisign:dnsa:api:schema:1}SecondaryZoneInfo"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetZoneInfoResType_V2", propOrder = {
    "primaryZoneInfo",
    "secondaryZoneInfo"
})
public class GetZoneInfoResTypeV2
    extends BaseDnsaResType
{

    protected PrimaryZoneInfoV2 primaryZoneInfo;
    protected SecondaryZoneInfo secondaryZoneInfo;

    /**
     * Gets the value of the primaryZoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryZoneInfoV2 }
     *     
     */
    public PrimaryZoneInfoV2 getPrimaryZoneInfo() {
        return primaryZoneInfo;
    }

    /**
     * Sets the value of the primaryZoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryZoneInfoV2 }
     *     
     */
    public void setPrimaryZoneInfo(PrimaryZoneInfoV2 value) {
        this.primaryZoneInfo = value;
    }

    /**
     * Gets the value of the secondaryZoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryZoneInfo }
     *     
     */
    public SecondaryZoneInfo getSecondaryZoneInfo() {
        return secondaryZoneInfo;
    }

    /**
     * Sets the value of the secondaryZoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryZoneInfo }
     *     
     */
    public void setSecondaryZoneInfo(SecondaryZoneInfo value) {
        this.secondaryZoneInfo = value;
    }

}
