
package com.verisign.dnsa.api.schema._2;

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
import org.w3c.dom.Element;


/**
 * base Type that can be used for extensibility. Extensibility is only allowed
 *                 in NameSpace ##other ensures that any extensibility in targetNameSpace goes thru normal EPC Global
 *                 Vetting Process
 *             
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
    GetLoadBalanceType.class,
    UpdateTrafficManagementType.class,
    GetFailOverInfoListType.class,
    GetFailOverInfoType.class,
    TrafficManagementType.class,
    ConvertPrimary2SecondaryType.class,
    RegeneratePasswordType.class,
    GetUserZoneAssociationsType.class,
    GetUserParameters.class,
    GetEnabledGeoLocationViewsType.class,
    UserParameters.class,
    DeleteFailOverInfoType.class,
    RemoveGeoLocationType.class,
    DelUserParameters.class,
    BulkUpdateSingleZone.class,
    EnableGeoLocationType.class,
    AddGeoLocationZoneType.class,
    GetResourceRecordsWithServiceListType.class,
    DeleteLoadBalanceType.class,
    CreateRemoveUserZoneAssociationsType.class,
    GetGeoLocationViewSetsType.class,
    DeleteTrafficManagementType.class,
    RemoveGeoLocationZoneType.class,
    ConvertSecondary2PrimaryType.class,
    GetTrafficManagementType.class,
    GeoLocationViewSet.class,
    DelAccountParameters.class,
    PingRequestInfoType.class,
    DelZoneParameters.class,
    UpdateResourceRecordsType.class,
    FailOverInfoListType.class,
    SmtpRequestInfoType.class,
    ResourceRecordWithService.class,
    ResourceRecordsType.class,
    TSIGInfoTypeV2 .class,
    NameValue.class,
    FailOverInfoListResType.class,
    NameServerInfoV2 .class,
    LBRRDirectiveResType.class,
    TMScriptDirective.class,
    LoadBalanceTypeBase.class,
    FailOverRRInfoResType.class,
    HttpRequestInfoType.class,
    AccountParameters.class,
    DnsRequestInfoType.class,
    TcpRequestInfoType.class,
    GenerateTSIGType.class,
    UniqueResourceRecordsType.class,
    HalfTcpRequestInfoType.class,
    WebForwardingUpdateTypeBase.class,
    ZoneParameters.class,
    LBRRDirective.class,
    WebForwardingTypeBase.class,
    FailOverRRInfoType.class,
    TMProbeInfoType.class,
    UniqueResourceRecordDataType.class,
    UpdateResourceRecordType.class,
    TMDirectiveBase.class,
    BaseFailOverInfoType.class,
    WebForwardRecordDetails.class
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
