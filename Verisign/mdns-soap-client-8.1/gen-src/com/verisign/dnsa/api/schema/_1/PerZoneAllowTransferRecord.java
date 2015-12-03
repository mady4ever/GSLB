
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerZoneAllowTransferRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerZoneAllowTransferRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerZoneAllowTransferRecord", propOrder = {
    "fromIPAddress",
    "toIPAddress"
})
public class PerZoneAllowTransferRecord {

    @XmlElement(required = true)
    protected String fromIPAddress;
    protected String toIPAddress;

    /**
     * Gets the value of the fromIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromIPAddress() {
        return fromIPAddress;
    }

    /**
     * Sets the value of the fromIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromIPAddress(String value) {
        this.fromIPAddress = value;
    }

    /**
     * Gets the value of the toIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToIPAddress() {
        return toIPAddress;
    }

    /**
     * Sets the value of the toIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToIPAddress(String value) {
        this.toIPAddress = value;
    }

}
