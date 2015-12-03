
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociateCustomerNameServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociateCustomerNameServerType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primaryNameServerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="secondaryNameServerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "AssociateCustomerNameServerType", propOrder = {
    "domainName",
    "primaryNameServerId",
    "secondaryNameServerId"
})
public class AssociateCustomerNameServerType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String domainName;
    protected long primaryNameServerId;
    protected Long secondaryNameServerId;

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
     * Gets the value of the primaryNameServerId property.
     * 
     */
    public long getPrimaryNameServerId() {
        return primaryNameServerId;
    }

    /**
     * Sets the value of the primaryNameServerId property.
     * 
     */
    public void setPrimaryNameServerId(long value) {
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

}
