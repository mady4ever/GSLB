
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadBalanceTypeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadBalanceTypeBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="zoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resourceRecordType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sticky" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "LoadBalanceTypeBase", propOrder = {
    "zoneName",
    "viewName",
    "owner",
    "ttl",
    "resourceRecordType",
    "sticky"
})
@XmlSeeAlso({
    LoadBalanceType.class,
    LoadBalanceResType.class
})
public class LoadBalanceTypeBase
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String zoneName;
    protected String viewName;
    @XmlElement(required = true)
    protected String owner;
    @XmlElement(defaultValue = "600")
    protected long ttl;
    @XmlElement(required = true)
    protected String resourceRecordType;
    @XmlElement(defaultValue = "false")
    protected boolean sticky;

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
     * Gets the value of the viewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * Sets the value of the viewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewName(String value) {
        this.viewName = value;
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
     * Gets the value of the ttl property.
     * 
     */
    public long getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     */
    public void setTtl(long value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the resourceRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceRecordType() {
        return resourceRecordType;
    }

    /**
     * Sets the value of the resourceRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceRecordType(String value) {
        this.resourceRecordType = value;
    }

    /**
     * Gets the value of the sticky property.
     * 
     */
    public boolean isSticky() {
        return sticky;
    }

    /**
     * Sets the value of the sticky property.
     * 
     */
    public void setSticky(boolean value) {
        this.sticky = value;
    }

}
