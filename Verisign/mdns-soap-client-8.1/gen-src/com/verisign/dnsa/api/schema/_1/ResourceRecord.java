
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="resourceRecordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{urn:com:verisign:dnsa:api:schema:1}ResourceRecordType"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="allowanyIP" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceRecord", propOrder = {
    "resourceRecordId",
    "owner",
    "type",
    "ttl",
    "rData"
})
@XmlSeeAlso({
    ResourceRecordGeneric.class
})
public class ResourceRecord
    extends BaseExtensibleType
{

    protected Long resourceRecordId;
    @XmlElement(required = true)
    protected String owner;
    @XmlElement(required = true)
    protected ResourceRecordType type;
    protected Long ttl;
    @XmlElement(required = true)
    protected String rData;
    @XmlAttribute(name = "allowanyIP")
    protected Boolean allowanyIP;

    /**
     * Gets the value of the resourceRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceRecordId() {
        return resourceRecordId;
    }

    /**
     * Sets the value of the resourceRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceRecordId(Long value) {
        this.resourceRecordId = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceRecordType }
     *     
     */
    public ResourceRecordType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceRecordType }
     *     
     */
    public void setType(ResourceRecordType value) {
        this.type = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTtl(Long value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the rData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRData() {
        return rData;
    }

    /**
     * Sets the value of the rData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRData(String value) {
        this.rData = value;
    }

    /**
     * Gets the value of the allowanyIP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowanyIP() {
        if (allowanyIP == null) {
            return false;
        } else {
            return allowanyIP;
        }
    }

    /**
     * Sets the value of the allowanyIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowanyIP(Boolean value) {
        this.allowanyIP = value;
    }

}
