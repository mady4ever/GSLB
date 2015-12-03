
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetZoneInfoResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetZoneInfoResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;choice>
 *         &lt;element name="primaryZoneInfo" type="{urn:com:verisign:dnsa:api:schema:1}PrimaryZoneInfo"/>
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
@XmlType(name = "GetZoneInfoResType", propOrder = {
    "primaryZoneInfo",
    "secondaryZoneInfo"
})
public class GetZoneInfoResType
    extends BaseDnsaResType
{

    protected PrimaryZoneInfo primaryZoneInfo;
    protected SecondaryZoneInfo secondaryZoneInfo;

    /**
     * Gets the value of the primaryZoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryZoneInfo }
     *     
     */
    public PrimaryZoneInfo getPrimaryZoneInfo() {
        return primaryZoneInfo;
    }

    /**
     * Sets the value of the primaryZoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryZoneInfo }
     *     
     */
    public void setPrimaryZoneInfo(PrimaryZoneInfo value) {
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
