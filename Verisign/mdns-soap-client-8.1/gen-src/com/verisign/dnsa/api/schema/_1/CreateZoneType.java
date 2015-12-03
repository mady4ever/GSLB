
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateZoneType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{urn:com:verisign:dnsa:api:schema:1}ZoneType"/>
 *         &lt;element name="serviceLevel" type="{urn:com:verisign:dnsa:api:schema:1}ZoneServiceLevel" minOccurs="0"/>
 *         &lt;element name="accountSiteOptionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{urn:com:verisign:dnsa:api:schema:1}SecondaryZoneCustomerNameServerInfo" minOccurs="0"/>
 *         &lt;element name="dnssecConfig" type="{urn:com:verisign:dnsa:api:schema:1}DnssecConfigType" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CreateZoneType", propOrder = {
    "domainName",
    "type",
    "serviceLevel",
    "accountSiteOptionName",
    "primaryNameServerId",
    "secondaryNameServerId",
    "dnssecConfig",
    "comments"
})
public class CreateZoneType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected ZoneType type;
    protected ZoneServiceLevel serviceLevel;
    protected String accountSiteOptionName;
    protected Long primaryNameServerId;
    protected Long secondaryNameServerId;
    protected DnssecConfigType dnssecConfig;
    protected String comments;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneType }
     *     
     */
    public ZoneType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneType }
     *     
     */
    public void setType(ZoneType value) {
        this.type = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneServiceLevel }
     *     
     */
    public ZoneServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneServiceLevel }
     *     
     */
    public void setServiceLevel(ZoneServiceLevel value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the accountSiteOptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSiteOptionName() {
        return accountSiteOptionName;
    }

    /**
     * Sets the value of the accountSiteOptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSiteOptionName(String value) {
        this.accountSiteOptionName = value;
    }

    /**
     * Gets the value of the primaryNameServerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryNameServerId() {
        return primaryNameServerId;
    }

    /**
     * Sets the value of the primaryNameServerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryNameServerId(Long value) {
        this.primaryNameServerId = value;
    }

    /**
     * Gets the value of the secondaryNameServerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecondaryNameServerId() {
        return secondaryNameServerId;
    }

    /**
     * Sets the value of the secondaryNameServerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecondaryNameServerId(Long value) {
        this.secondaryNameServerId = value;
    }

    /**
     * Gets the value of the dnssecConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DnssecConfigType }
     *     
     */
    public DnssecConfigType getDnssecConfig() {
        return dnssecConfig;
    }

    /**
     * Sets the value of the dnssecConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DnssecConfigType }
     *     
     */
    public void setDnssecConfig(DnssecConfigType value) {
        this.dnssecConfig = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
