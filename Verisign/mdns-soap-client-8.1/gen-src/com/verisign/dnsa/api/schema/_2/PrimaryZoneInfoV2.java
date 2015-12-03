
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.NameServerInfo;
import com.verisign.dnsa.api.schema._1.PerZoneAllowTransferRecord;
import com.verisign.dnsa.api.schema._1.ResourceRecord;
import com.verisign.dnsa.api.schema._1.SOARecord;
import com.verisign.dnsa.api.schema._1.WebParkingInfo;
import com.verisign.dnsa.api.schema._1.ZoneInfo;
import com.verisign.dnsa.api.schema._1.ZoneServiceLevel;


/**
 * <p>Java class for PrimaryZoneInfo_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimaryZoneInfo_V2">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}ZoneInfo">
 *       &lt;sequence>
 *         &lt;element name="zoneSOAInfo" type="{urn:com:verisign:dnsa:api:schema:1}SOARecord"/>
 *         &lt;element name="serviceLevel" type="{urn:com:verisign:dnsa:api:schema:1}ZoneServiceLevel"/>
 *         &lt;element name="webForwardRecordDetails" type="{urn:com:verisign:dnsa:api:schema:2}WebForwardRecordDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="webParking" type="{urn:com:verisign:dnsa:api:schema:1}WebParkingInfo"/>
 *         &lt;element name="verisignNSInfo" type="{urn:com:verisign:dnsa:api:schema:1}NameServerInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="perZoneAllowTransferRecord" type="{urn:com:verisign:dnsa:api:schema:1}PerZoneAllowTransferRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resourceRecord" type="{urn:com:verisign:dnsa:api:schema:1}ResourceRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryZoneInfo_V2", propOrder = {
    "zoneSOAInfo",
    "serviceLevel",
    "webForwardRecordDetails",
    "webParking",
    "verisignNSInfo",
    "perZoneAllowTransferRecord",
    "resourceRecord"
})
public class PrimaryZoneInfoV2
    extends ZoneInfo
{

    @XmlElement(required = true)
    protected SOARecord zoneSOAInfo;
    @XmlElement(required = true)
    protected ZoneServiceLevel serviceLevel;
    protected List<WebForwardRecordDetails> webForwardRecordDetails;
    @XmlElement(required = true)
    protected WebParkingInfo webParking;
    protected List<NameServerInfo> verisignNSInfo;
    protected List<PerZoneAllowTransferRecord> perZoneAllowTransferRecord;
    protected List<ResourceRecord> resourceRecord;

    /**
     * Gets the value of the zoneSOAInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SOARecord }
     *     
     */
    public SOARecord getZoneSOAInfo() {
        return zoneSOAInfo;
    }

    /**
     * Sets the value of the zoneSOAInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOARecord }
     *     
     */
    public void setZoneSOAInfo(SOARecord value) {
        this.zoneSOAInfo = value;
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
     * Gets the value of the webForwardRecordDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webForwardRecordDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebForwardRecordDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebForwardRecordDetails }
     * 
     * 
     */
    public List<WebForwardRecordDetails> getWebForwardRecordDetails() {
        if (webForwardRecordDetails == null) {
            webForwardRecordDetails = new ArrayList<WebForwardRecordDetails>();
        }
        return this.webForwardRecordDetails;
    }

    /**
     * Gets the value of the webParking property.
     * 
     * @return
     *     possible object is
     *     {@link WebParkingInfo }
     *     
     */
    public WebParkingInfo getWebParking() {
        return webParking;
    }

    /**
     * Sets the value of the webParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebParkingInfo }
     *     
     */
    public void setWebParking(WebParkingInfo value) {
        this.webParking = value;
    }

    /**
     * Gets the value of the verisignNSInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verisignNSInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerisignNSInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameServerInfo }
     * 
     * 
     */
    public List<NameServerInfo> getVerisignNSInfo() {
        if (verisignNSInfo == null) {
            verisignNSInfo = new ArrayList<NameServerInfo>();
        }
        return this.verisignNSInfo;
    }

    /**
     * Gets the value of the perZoneAllowTransferRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perZoneAllowTransferRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerZoneAllowTransferRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerZoneAllowTransferRecord }
     * 
     * 
     */
    public List<PerZoneAllowTransferRecord> getPerZoneAllowTransferRecord() {
        if (perZoneAllowTransferRecord == null) {
            perZoneAllowTransferRecord = new ArrayList<PerZoneAllowTransferRecord>();
        }
        return this.perZoneAllowTransferRecord;
    }

    /**
     * Gets the value of the resourceRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceRecord }
     * 
     * 
     */
    public List<ResourceRecord> getResourceRecord() {
        if (resourceRecord == null) {
            resourceRecord = new ArrayList<ResourceRecord>();
        }
        return this.resourceRecord;
    }

}
