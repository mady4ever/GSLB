
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseFailOverInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFailOverInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="zoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocol" type="{urn:com:verisign:dnsa:api:schema:2}probeProtocolType"/>
 *         &lt;element name="probeConnectTimeoutInMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="probeReadTimeoutInSec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="httpRequestInfo" type="{urn:com:verisign:dnsa:api:schema:2}httpRequestInfoType"/>
 *           &lt;element name="dnsRequestInfo" type="{urn:com:verisign:dnsa:api:schema:2}dnsRequestInfoType"/>
 *           &lt;element name="smtpRequestInfo" type="{urn:com:verisign:dnsa:api:schema:2}smtpRequestInfoType"/>
 *           &lt;element name="pingRequestInfo" type="{urn:com:verisign:dnsa:api:schema:2}pingRequestInfoType"/>
 *           &lt;element name="tcpRequestInfo" type="{urn:com:verisign:dnsa:api:schema:2}tcpRequestInfoType"/>
 *           &lt;element name="halfTcpRequestInfo" type="{urn:com:verisign:dnsa:api:schema:2}halfTcpRequestInfoType"/>
 *         &lt;/choice>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="probeFrequencyInMinutes" type="{urn:com:verisign:dnsa:api:schema:2}probeFrequencyType"/>
 *         &lt;element name="probeFrequencyInSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resourceRecordType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expectedResponseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expectedResponseString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoFailOver" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoFailBack" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="viewName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeToLive" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="noOfRRToPublish" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "BaseFailOverInfoType", propOrder = {
    "zoneName",
    "protocol",
    "probeConnectTimeoutInMillis",
    "probeReadTimeoutInSec",
    "httpRequestInfo",
    "dnsRequestInfo",
    "smtpRequestInfo",
    "pingRequestInfo",
    "tcpRequestInfo",
    "halfTcpRequestInfo",
    "owner",
    "probeFrequencyInMinutes",
    "probeFrequencyInSeconds",
    "resourceRecordType",
    "expectedResponseCode",
    "expectedResponseString",
    "autoFailOver",
    "autoFailBack",
    "viewName",
    "timeToLive",
    "noOfRRToPublish"
})
@XmlSeeAlso({
    FailOverInfoType.class,
    FailOverInfoElementType.class
})
public class BaseFailOverInfoType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String zoneName;
    @XmlElement(required = true)
    protected ProbeProtocolType protocol;
    @XmlElement(defaultValue = "15000")
    protected Long probeConnectTimeoutInMillis;
    @XmlElement(defaultValue = "30")
    protected Integer probeReadTimeoutInSec;
    protected HttpRequestInfoType httpRequestInfo;
    protected DnsRequestInfoType dnsRequestInfo;
    protected SmtpRequestInfoType smtpRequestInfo;
    protected PingRequestInfoType pingRequestInfo;
    protected TcpRequestInfoType tcpRequestInfo;
    protected HalfTcpRequestInfoType halfTcpRequestInfo;
    @XmlElement(required = true)
    protected String owner;
    @XmlElement(required = true)
    protected ProbeFrequencyType probeFrequencyInMinutes;
    protected Long probeFrequencyInSeconds;
    @XmlElement(required = true)
    protected String resourceRecordType;
    @XmlElement(required = true, nillable = true)
    protected String expectedResponseCode;
    @XmlElement(required = true, nillable = true)
    protected String expectedResponseString;
    @XmlElement(defaultValue = "true")
    protected boolean autoFailOver;
    @XmlElement(defaultValue = "true")
    protected boolean autoFailBack;
    protected String viewName;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long timeToLive;
    @XmlElement(defaultValue = "1")
    protected Integer noOfRRToPublish;

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
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link ProbeProtocolType }
     *     
     */
    public ProbeProtocolType getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbeProtocolType }
     *     
     */
    public void setProtocol(ProbeProtocolType value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the probeConnectTimeoutInMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProbeConnectTimeoutInMillis() {
        return probeConnectTimeoutInMillis;
    }

    /**
     * Sets the value of the probeConnectTimeoutInMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProbeConnectTimeoutInMillis(Long value) {
        this.probeConnectTimeoutInMillis = value;
    }

    /**
     * Gets the value of the probeReadTimeoutInSec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProbeReadTimeoutInSec() {
        return probeReadTimeoutInSec;
    }

    /**
     * Sets the value of the probeReadTimeoutInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProbeReadTimeoutInSec(Integer value) {
        this.probeReadTimeoutInSec = value;
    }

    /**
     * Gets the value of the httpRequestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HttpRequestInfoType }
     *     
     */
    public HttpRequestInfoType getHttpRequestInfo() {
        return httpRequestInfo;
    }

    /**
     * Sets the value of the httpRequestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpRequestInfoType }
     *     
     */
    public void setHttpRequestInfo(HttpRequestInfoType value) {
        this.httpRequestInfo = value;
    }

    /**
     * Gets the value of the dnsRequestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DnsRequestInfoType }
     *     
     */
    public DnsRequestInfoType getDnsRequestInfo() {
        return dnsRequestInfo;
    }

    /**
     * Sets the value of the dnsRequestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DnsRequestInfoType }
     *     
     */
    public void setDnsRequestInfo(DnsRequestInfoType value) {
        this.dnsRequestInfo = value;
    }

    /**
     * Gets the value of the smtpRequestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SmtpRequestInfoType }
     *     
     */
    public SmtpRequestInfoType getSmtpRequestInfo() {
        return smtpRequestInfo;
    }

    /**
     * Sets the value of the smtpRequestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmtpRequestInfoType }
     *     
     */
    public void setSmtpRequestInfo(SmtpRequestInfoType value) {
        this.smtpRequestInfo = value;
    }

    /**
     * Gets the value of the pingRequestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PingRequestInfoType }
     *     
     */
    public PingRequestInfoType getPingRequestInfo() {
        return pingRequestInfo;
    }

    /**
     * Sets the value of the pingRequestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PingRequestInfoType }
     *     
     */
    public void setPingRequestInfo(PingRequestInfoType value) {
        this.pingRequestInfo = value;
    }

    /**
     * Gets the value of the tcpRequestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TcpRequestInfoType }
     *     
     */
    public TcpRequestInfoType getTcpRequestInfo() {
        return tcpRequestInfo;
    }

    /**
     * Sets the value of the tcpRequestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcpRequestInfoType }
     *     
     */
    public void setTcpRequestInfo(TcpRequestInfoType value) {
        this.tcpRequestInfo = value;
    }

    /**
     * Gets the value of the halfTcpRequestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HalfTcpRequestInfoType }
     *     
     */
    public HalfTcpRequestInfoType getHalfTcpRequestInfo() {
        return halfTcpRequestInfo;
    }

    /**
     * Sets the value of the halfTcpRequestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfTcpRequestInfoType }
     *     
     */
    public void setHalfTcpRequestInfo(HalfTcpRequestInfoType value) {
        this.halfTcpRequestInfo = value;
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
     * Gets the value of the probeFrequencyInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link ProbeFrequencyType }
     *     
     */
    public ProbeFrequencyType getProbeFrequencyInMinutes() {
        return probeFrequencyInMinutes;
    }

    /**
     * Sets the value of the probeFrequencyInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbeFrequencyType }
     *     
     */
    public void setProbeFrequencyInMinutes(ProbeFrequencyType value) {
        this.probeFrequencyInMinutes = value;
    }

    /**
     * Gets the value of the probeFrequencyInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProbeFrequencyInSeconds() {
        return probeFrequencyInSeconds;
    }

    /**
     * Sets the value of the probeFrequencyInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProbeFrequencyInSeconds(Long value) {
        this.probeFrequencyInSeconds = value;
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
     * Gets the value of the expectedResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedResponseCode() {
        return expectedResponseCode;
    }

    /**
     * Sets the value of the expectedResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedResponseCode(String value) {
        this.expectedResponseCode = value;
    }

    /**
     * Gets the value of the expectedResponseString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedResponseString() {
        return expectedResponseString;
    }

    /**
     * Sets the value of the expectedResponseString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedResponseString(String value) {
        this.expectedResponseString = value;
    }

    /**
     * Gets the value of the autoFailOver property.
     * 
     */
    public boolean isAutoFailOver() {
        return autoFailOver;
    }

    /**
     * Sets the value of the autoFailOver property.
     * 
     */
    public void setAutoFailOver(boolean value) {
        this.autoFailOver = value;
    }

    /**
     * Gets the value of the autoFailBack property.
     * 
     */
    public boolean isAutoFailBack() {
        return autoFailBack;
    }

    /**
     * Sets the value of the autoFailBack property.
     * 
     */
    public void setAutoFailBack(boolean value) {
        this.autoFailBack = value;
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
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeToLive(Long value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the noOfRRToPublish property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfRRToPublish() {
        return noOfRRToPublish;
    }

    /**
     * Sets the value of the noOfRRToPublish property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfRRToPublish(Integer value) {
        this.noOfRRToPublish = value;
    }

}
