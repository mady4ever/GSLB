
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserZoneAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserZoneAssociationsType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="logOnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "getUserZoneAssociationsType", propOrder = {
    "logOnName"
})
public class GetUserZoneAssociationsType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String logOnName;

    /**
     * Gets the value of the logOnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogOnName() {
        return logOnName;
    }

    /**
     * Sets the value of the logOnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogOnName(String value) {
        this.logOnName = value;
    }

}
