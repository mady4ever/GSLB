
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebForwardRecord_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebForwardRecord_V2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cloakingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="permanentForward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="relative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="relativeType" type="{urn:com:verisign:dnsa:api:schema:2}webForwardRelativeType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forwardingURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebForwardRecord_V2", propOrder = {
    "cloakingEnabled",
    "permanentForward",
    "relative",
    "relativeType",
    "path",
    "forwardingURL"
})
public class WebForwardRecordV2 {

    protected boolean cloakingEnabled;
    protected boolean permanentForward;
    protected boolean relative;
    protected WebForwardRelativeType relativeType;
    @XmlElement(required = true)
    protected String path;
    @XmlElement(required = true)
    protected String forwardingURL;

    /**
     * Gets the value of the cloakingEnabled property.
     * 
     */
    public boolean isCloakingEnabled() {
        return cloakingEnabled;
    }

    /**
     * Sets the value of the cloakingEnabled property.
     * 
     */
    public void setCloakingEnabled(boolean value) {
        this.cloakingEnabled = value;
    }

    /**
     * Gets the value of the permanentForward property.
     * 
     */
    public boolean isPermanentForward() {
        return permanentForward;
    }

    /**
     * Sets the value of the permanentForward property.
     * 
     */
    public void setPermanentForward(boolean value) {
        this.permanentForward = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     */
    public boolean isRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     */
    public void setRelative(boolean value) {
        this.relative = value;
    }

    /**
     * Gets the value of the relativeType property.
     * 
     * @return
     *     possible object is
     *     {@link WebForwardRelativeType }
     *     
     */
    public WebForwardRelativeType getRelativeType() {
        return relativeType;
    }

    /**
     * Sets the value of the relativeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebForwardRelativeType }
     *     
     */
    public void setRelativeType(WebForwardRelativeType value) {
        this.relativeType = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the forwardingURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardingURL() {
        return forwardingURL;
    }

    /**
     * Sets the value of the forwardingURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardingURL(String value) {
        this.forwardingURL = value;
    }

}
