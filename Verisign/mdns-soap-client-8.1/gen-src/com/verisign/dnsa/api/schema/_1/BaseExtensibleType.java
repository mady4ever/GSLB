
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.verisign.dnsa.api.schema._2.CreateCustomerNameServerTypeV2;
import com.verisign.dnsa.api.schema._2.DeleteCustomerNameServerTypeV2;
import com.verisign.dnsa.api.schema._2.DeleteWebForwardTypeV2;
import com.verisign.dnsa.api.schema._2.GetCustomerNameServerByIpTypeV2;
import com.verisign.dnsa.api.schema._2.GetCustomerNameServerListTypeV2;
import com.verisign.dnsa.api.schema._2.GetZoneInfoTypeV2;
import com.verisign.dnsa.api.schema._2.UpdateCustomerNameServerTypeV2;
import org.w3c.dom.Element;


/**
 * base Type that  can be used for extensibility. Extensibility is only allowed in NameSpace ##other ensures that any extensibility in targetNameSpace goes thru normal EPC Global Vetting Process 
 * 
 * <p>Java class for BaseExtensibleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseExtensibleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseExtensibleType", propOrder = {
    "any"
})
@XmlSeeAlso({
    UpdateCustomerNameServerTypeV2 .class,
    CreateCustomerNameServerTypeV2 .class,
    DeleteWebForwardTypeV2 .class,
    GetZoneInfoTypeV2 .class,
    GetCustomerNameServerByIpTypeV2 .class,
    DeleteCustomerNameServerTypeV2 .class,
    GetCustomerNameServerListTypeV2 .class,
    com.verisign.dnsa.api.schema._2.LoadBalanceServiceType.class,
    com.verisign.dnsa.api.schema._2.TrafficManagementServiceType.class,
    GetUserListType.class,
    ResourceRecordFailoverServiceInfo.class,
    TransferZoneType.class,
    UpdateCustomerNameServerType.class,
    UpdateMultiZoneAllowTransferType.class,
    GetCustomerListType.class,
    DeleteWebForwardType.class,
    GetResourceRecordListType.class,
    GetZoneResourceRecordFailoverServiceListType.class,
    CreateCustomerWithServicesType.class,
    UpdateResourceRecordType.class,
    GetResourceRecordType.class,
    GetCustomerSiteOptionListType.class,
    GetZoneListType.class,
    UpdateZoneType.class,
    UpdateWebForwardType.class,
    UpdateWebParkingType.class,
    UserInfo.class,
    CreateCustomerNameServerType.class,
    GetTaskInfoType.class,
    GetUserType.class,
    CloneZoneType.class,
    DeleteCustomerType.class,
    CreatePerZoneAllowTransferType.class,
    CreateMultiZoneAllowTransferType.class,
    GetResourceRecordListGenericType.class,
    CreateZoneType.class,
    DeleteResourceRecordsType.class,
    DeleteResourceRecordFailoverServiceType.class,
    DeletePerZoneAllowTransferType.class,
    UpdateSOAType.class,
    GetZoneHistoryType.class,
    UpdateMultiZoneResourceRecordsType.class,
    GetCustomerNameServerListType.class,
    UpdateCustomerWithServicesType.class,
    UpdateMultiZoneSiteOptionType.class,
    GetTaskListType.class,
    UpdateMultiZoneSOAType.class,
    CreateCustomerSiteOptionType.class,
    DeleteCustomerNameServerType.class,
    GetCustomerType.class,
    CreateWebForwardType.class,
    DeleteCustomerSiteOptionType.class,
    DeleteZoneType.class,
    GetZoneInfoType.class,
    CreateResourceRecordsType.class,
    GetCustomerNameServerByIpType.class,
    GeoLocationServiceType.class,
    UpgradeZoneType.class,
    ZoneBackupServiceType.class,
    UpdateCustomerType.class,
    UsageReportServiceType.class,
    UpdateCustomerPackageInfoType.class,
    SigningServiceType.class,
    com.verisign.dnsa.api.schema._1.LoadBalanceServiceType.class,
    GetAccountZoneStatsType.class,
    AssociateCustomerNameServerType.class,
    com.verisign.dnsa.api.schema._1.TrafficManagementServiceType.class,
    CustomerPackage.class,
    CreateCustomerFailoverServiceType.class,
    BaseServiceType.class,
    CustomerNameServer.class,
    CreateCustomerType.class,
    Address.class,
    ZoneEvent.class,
    FailoverServiceType.class,
    DnssecInfo.class,
    DnssecConfigType.class,
    TSIGInfoType.class,
    ContactInfo.class,
    DnsKey.class,
    CustomerInfo.class,
    CustomerPackageInfo.class,
    UpdateCustomerFailoverServiceType.class,
    CustomerFailoverServiceInfo.class,
    DeleteCustomerFailoverServiceType.class,
    ResourceRecord.class
})
public class BaseExtensibleType {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
