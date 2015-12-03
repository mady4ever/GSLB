
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebForwardRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebForwardRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cloakingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="permanentForward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="relative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="originatingDomainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "WebForwardRecord", propOrder = {
    "cloakingEnabled",
    "permanentForward",
    "relative",
    "originatingDomainName",
    "forwardingURL"
})
public class WebForwardRecord {

    protected boolean cloakingEnabled;
    protected boolean permanentForward;
    protected boolean relative;
    @XmlElement(required = true)
    protected String originatingDomainName;
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
     * Gets the value of the originatingDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingDomainName() {
        return originatingDomainName;
    }

    /**
     * Sets the value of the originatingDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingDomainName(String value) {
        this.originatingDomainName = value;
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
