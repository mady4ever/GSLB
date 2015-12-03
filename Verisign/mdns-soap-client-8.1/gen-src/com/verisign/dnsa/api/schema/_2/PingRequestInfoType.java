
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pingRequestInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pingRequestInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="percentagePacketLossAllowed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfPacketsToSend" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxRTTAllowedInMilliSeconds" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "pingRequestInfoType", propOrder = {
    "percentagePacketLossAllowed",
    "numberOfPacketsToSend",
    "maxRTTAllowedInMilliSeconds"
})
public class PingRequestInfoType
    extends BaseExtensibleType
{

    @XmlElement(defaultValue = "0")
    protected int percentagePacketLossAllowed;
    @XmlElement(defaultValue = "10")
    protected int numberOfPacketsToSend;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long maxRTTAllowedInMilliSeconds;

    /**
     * Gets the value of the percentagePacketLossAllowed property.
     * 
     */
    public int getPercentagePacketLossAllowed() {
        return percentagePacketLossAllowed;
    }

    /**
     * Sets the value of the percentagePacketLossAllowed property.
     * 
     */
    public void setPercentagePacketLossAllowed(int value) {
        this.percentagePacketLossAllowed = value;
    }

    /**
     * Gets the value of the numberOfPacketsToSend property.
     * 
     */
    public int getNumberOfPacketsToSend() {
        return numberOfPacketsToSend;
    }

    /**
     * Sets the value of the numberOfPacketsToSend property.
     * 
     */
    public void setNumberOfPacketsToSend(int value) {
        this.numberOfPacketsToSend = value;
    }

    /**
     * Gets the value of the maxRTTAllowedInMilliSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRTTAllowedInMilliSeconds() {
        return maxRTTAllowedInMilliSeconds;
    }

    /**
     * Sets the value of the maxRTTAllowedInMilliSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRTTAllowedInMilliSeconds(Long value) {
        this.maxRTTAllowedInMilliSeconds = value;
    }

}
