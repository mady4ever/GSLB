
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConvertPrimary2SecondaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertPrimary2SecondaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="zoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primaryNameServerIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondaryNameServerIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ConvertPrimary2SecondaryType", propOrder = {
    "zoneName",
    "primaryNameServerIP",
    "secondaryNameServerIP"
})
public class ConvertPrimary2SecondaryType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String zoneName;
    @XmlElement(required = true)
    protected String primaryNameServerIP;
    protected String secondaryNameServerIP;

    /**
     * Gets the value of the zoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets the value of the zoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneName(String value) {
        this.zoneName = value;
    }

    /**
     * Gets the value of the primaryNameServerIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryNameServerIP() {
        return primaryNameServerIP;
    }

    /**
     * Sets the value of the primaryNameServerIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryNameServerIP(String value) {
        this.primaryNameServerIP = value;
    }

    /**
     * Gets the value of the secondaryNameServerIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryNameServerIP() {
        return secondaryNameServerIP;
    }

    /**
     * Sets the value of the secondaryNameServerIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryNameServerIP(String value) {
        this.secondaryNameServerIP = value;
    }

}
