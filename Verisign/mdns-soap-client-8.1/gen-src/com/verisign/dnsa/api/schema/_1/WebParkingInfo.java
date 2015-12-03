
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebParkingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebParkingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parkingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pageType" type="{urn:com:verisign:dnsa:api:schema:1}WebParkingPageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebParkingInfo", propOrder = {
    "parkingEnabled",
    "pageType"
})
public class WebParkingInfo {

    protected boolean parkingEnabled;
    protected WebParkingPageType pageType;

    /**
     * Gets the value of the parkingEnabled property.
     * 
     */
    public boolean isParkingEnabled() {
        return parkingEnabled;
    }

    /**
     * Sets the value of the parkingEnabled property.
     * 
     */
    public void setParkingEnabled(boolean value) {
        this.parkingEnabled = value;
    }

    /**
     * Gets the value of the pageType property.
     * 
     * @return
     *     possible object is
     *     {@link WebParkingPageType }
     *     
     */
    public WebParkingPageType getPageType() {
        return pageType;
    }

    /**
     * Sets the value of the pageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebParkingPageType }
     *     
     */
    public void setPageType(WebParkingPageType value) {
        this.pageType = value;
    }

}
