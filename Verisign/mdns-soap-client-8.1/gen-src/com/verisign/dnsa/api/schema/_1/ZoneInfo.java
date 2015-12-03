
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.verisign.dnsa.api.schema._2.PrimaryZoneInfoV2;


/**
 * <p>Java class for ZoneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{urn:com:verisign:dnsa:api:schema:1}ZoneType" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com:verisign:dnsa:api:schema:1}ZoneStatus"/>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updateTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dnssecInfo" type="{urn:com:verisign:dnsa:api:schema:1}DnssecInfo" minOccurs="0"/>
 *         &lt;element name="geoLocationEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneInfo", propOrder = {
    "domainName",
    "type",
    "status",
    "createTimestamp",
    "updateTimestamp",
    "dnssecInfo",
    "geoLocationEnabled"
})
@XmlSeeAlso({
    PrimaryZoneInfoV2 .class,
    PrimaryZoneInfo.class,
    SecondaryZoneInfo.class
})
public class ZoneInfo {

    @XmlElement(required = true)
    protected String domainName;
    protected ZoneType type;
    @XmlElement(required = true)
    protected ZoneStatus status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTimestamp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTimestamp;
    protected DnssecInfo dnssecInfo;
    protected String geoLocationEnabled;

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
     * Gets the value of the createTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * Sets the value of the createTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTimestamp(XMLGregorianCalendar value) {
        this.createTimestamp = value;
    }

    /**
     * Gets the value of the updateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * Sets the value of the updateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTimestamp(XMLGregorianCalendar value) {
        this.updateTimestamp = value;
    }

    /**
     * Gets the value of the dnssecInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DnssecInfo }
     *     
     */
    public DnssecInfo getDnssecInfo() {
        return dnssecInfo;
    }

    /**
     * Sets the value of the dnssecInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DnssecInfo }
     *     
     */
    public void setDnssecInfo(DnssecInfo value) {
        this.dnssecInfo = value;
    }

    /**
     * Gets the value of the geoLocationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoLocationEnabled() {
        return geoLocationEnabled;
    }

    /**
     * Sets the value of the geoLocationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoLocationEnabled(String value) {
        this.geoLocationEnabled = value;
    }

}
