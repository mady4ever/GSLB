
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateZoneType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{urn:com:verisign:dnsa:api:schema:1}ZoneStatus"/>
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
@XmlType(name = "UpdateZoneType", propOrder = {
    "domainName",
    "status",
    "accountSiteOptionName",
    "primaryNameServerId",
    "secondaryNameServerId",
    "dnssecConfig",
    "comments"
})
public class UpdateZoneType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected ZoneStatus status;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneStatus }
     *     
     */
    public ZoneStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneStatus }
     *     
     */
    public void setStatus(ZoneStatus value) {
        this.status = value;
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
