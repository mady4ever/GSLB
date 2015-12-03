
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondaryZoneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryZoneInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}ZoneInfo">
 *       &lt;sequence>
 *         &lt;element name="customerPrimaryNameServerInfo" type="{urn:com:verisign:dnsa:api:schema:1}CustomerNameServer" minOccurs="0"/>
 *         &lt;element name="customerSecondaryNameServerInfo" type="{urn:com:verisign:dnsa:api:schema:1}CustomerNameServer" minOccurs="0"/>
 *         &lt;element name="distroNameServerIP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryZoneInfo", propOrder = {
    "customerPrimaryNameServerInfo",
    "customerSecondaryNameServerInfo",
    "distroNameServerIP"
})
public class SecondaryZoneInfo
    extends ZoneInfo
{

    protected CustomerNameServer customerPrimaryNameServerInfo;
    protected CustomerNameServer customerSecondaryNameServerInfo;
    protected List<String> distroNameServerIP;

    /**
     * Gets the value of the customerPrimaryNameServerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameServer }
     *     
     */
    public CustomerNameServer getCustomerPrimaryNameServerInfo() {
        return customerPrimaryNameServerInfo;
    }

    /**
     * Sets the value of the customerPrimaryNameServerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameServer }
     *     
     */
    public void setCustomerPrimaryNameServerInfo(CustomerNameServer value) {
        this.customerPrimaryNameServerInfo = value;
    }

    /**
     * Gets the value of the customerSecondaryNameServerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameServer }
     *     
     */
    public CustomerNameServer getCustomerSecondaryNameServerInfo() {
        return customerSecondaryNameServerInfo;
    }

    /**
     * Sets the value of the customerSecondaryNameServerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameServer }
     *     
     */
    public void setCustomerSecondaryNameServerInfo(CustomerNameServer value) {
        this.customerSecondaryNameServerInfo = value;
    }

    /**
     * Gets the value of the distroNameServerIP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distroNameServerIP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistroNameServerIP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistroNameServerIP() {
        if (distroNameServerIP == null) {
            distroNameServerIP = new ArrayList<String>();
        }
        return this.distroNameServerIP;
    }

}
