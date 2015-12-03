
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceRecordFailoverServiceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceRecordFailoverServiceInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publishedIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unpublishedPrimaryIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="failoverIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="10"/>
 *         &lt;element name="autoRestore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protocol" type="{urn:com:verisign:dnsa:api:schema:1}FailoverProtocolType"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="testUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ResourceRecordFailoverServiceInfo", propOrder = {
    "domainName",
    "owner",
    "publishedIPAddress",
    "unpublishedPrimaryIPAddress",
    "failoverIPAddress",
    "autoRestore",
    "protocol",
    "port",
    "testUrl",
    "testString"
})
public class ResourceRecordFailoverServiceInfo
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected String owner;
    protected List<String> publishedIPAddress;
    protected List<String> unpublishedPrimaryIPAddress;
    @XmlElement(required = true)
    protected List<String> failoverIPAddress;
    protected boolean autoRestore;
    @XmlElement(required = true)
    protected FailoverProtocolType protocol;
    protected Integer port;
    protected String testUrl;
    protected String testString;

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
     * Gets the value of the publishedIPAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishedIPAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedIPAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPublishedIPAddress() {
        if (publishedIPAddress == null) {
            publishedIPAddress = new ArrayList<String>();
        }
        return this.publishedIPAddress;
    }

    /**
     * Gets the value of the unpublishedPrimaryIPAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unpublishedPrimaryIPAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnpublishedPrimaryIPAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnpublishedPrimaryIPAddress() {
        if (unpublishedPrimaryIPAddress == null) {
            unpublishedPrimaryIPAddress = new ArrayList<String>();
        }
        return this.unpublishedPrimaryIPAddress;
    }

    /**
     * Gets the value of the failoverIPAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failoverIPAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailoverIPAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFailoverIPAddress() {
        if (failoverIPAddress == null) {
            failoverIPAddress = new ArrayList<String>();
        }
        return this.failoverIPAddress;
    }

    /**
     * Gets the value of the autoRestore property.
     * 
     */
    public boolean isAutoRestore() {
        return autoRestore;
    }

    /**
     * Sets the value of the autoRestore property.
     * 
     */
    public void setAutoRestore(boolean value) {
        this.autoRestore = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link FailoverProtocolType }
     *     
     */
    public FailoverProtocolType getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailoverProtocolType }
     *     
     */
    public void setProtocol(FailoverProtocolType value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the testUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestUrl() {
        return testUrl;
    }

    /**
     * Sets the value of the testUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestUrl(String value) {
        this.testUrl = value;
    }

    /**
     * Gets the value of the testString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestString() {
        return testString;
    }

    /**
     * Sets the value of the testString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestString(String value) {
        this.testString = value;
    }

}
