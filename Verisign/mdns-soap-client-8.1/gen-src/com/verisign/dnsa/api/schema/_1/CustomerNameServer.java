
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerNameServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerNameServer">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="nameServerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TSIGKeyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSIGKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSIGAlgorithm" type="{urn:com:verisign:dnsa:api:schema:1}TSIGAlgorithm" minOccurs="0"/>
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
@XmlType(name = "CustomerNameServer", propOrder = {
    "nameServerId",
    "name",
    "ipAddress",
    "tsigKeyName",
    "tsigKey",
    "tsigAlgorithm"
})
public class CustomerNameServer
    extends BaseExtensibleType
{

    protected Long nameServerId;
    protected String name;
    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(name = "TSIGKeyName")
    protected String tsigKeyName;
    @XmlElement(name = "TSIGKey")
    protected String tsigKey;
    @XmlElement(name = "TSIGAlgorithm")
    protected TSIGAlgorithm tsigAlgorithm;
    @XmlAttribute(name = "allowanyIP")
    protected Boolean allowanyIP;

    /**
     * Gets the value of the nameServerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNameServerId() {
        return nameServerId;
    }

    /**
     * Sets the value of the nameServerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNameServerId(Long value) {
        this.nameServerId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the tsigKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSIGKeyName() {
        return tsigKeyName;
    }

    /**
     * Sets the value of the tsigKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSIGKeyName(String value) {
        this.tsigKeyName = value;
    }

    /**
     * Gets the value of the tsigKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSIGKey() {
        return tsigKey;
    }

    /**
     * Sets the value of the tsigKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSIGKey(String value) {
        this.tsigKey = value;
    }

    /**
     * Gets the value of the tsigAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link TSIGAlgorithm }
     *     
     */
    public TSIGAlgorithm getTSIGAlgorithm() {
        return tsigAlgorithm;
    }

    /**
     * Sets the value of the tsigAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSIGAlgorithm }
     *     
     */
    public void setTSIGAlgorithm(TSIGAlgorithm value) {
        this.tsigAlgorithm = value;
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
