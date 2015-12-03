
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._2.CreateCustomerNameServerResTypeV2;
import com.verisign.dnsa.api.schema._2.GetCustomerNameServerByIpResTypeV2;
import com.verisign.dnsa.api.schema._2.GetCustomerNameServerListResTypeV2;
import com.verisign.dnsa.api.schema._2.GetResourceRecordsWithServiceListResType;
import com.verisign.dnsa.api.schema._2.GetUserZoneAssociationsResType;
import com.verisign.dnsa.api.schema._2.GetZoneInfoResTypeV2;
import com.verisign.dnsa.api.schema._2.UpdateCustomerNameServerResTypeV2;


/**
 *  base DNSA API Response 
 * 
 * <p>Java class for BaseDnsaResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseDnsaResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reason" type="{urn:com:verisign:dnsa:api:schema:1}reasonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDnsaResType", propOrder = {
    "callSuccess",
    "reason"
})
@XmlSeeAlso({
    CreateCustomerNameServerResTypeV2 .class,
    GetUserZoneAssociationsResType.class,
    GetCustomerNameServerListResTypeV2 .class,
    UpdateCustomerNameServerResTypeV2 .class,
    GetCustomerNameServerByIpResTypeV2 .class,
    GetResourceRecordsWithServiceListResType.class,
    GetZoneInfoResTypeV2 .class,
    GetUserListResType.class,
    GetZoneHistoryResType.class,
    GetResourceRecordResType.class,
    GetTaskInfoResType.class,
    UpdateZoneResType.class,
    UpdateResourceRecordResType.class,
    UpdateCustomerNameServerResType.class,
    GetZoneListResType.class,
    GetZoneResourceRecordFailoverServiceListResType.class,
    GetCustomerSiteOptionListResType.class,
    GetUserResType.class,
    GetResourceRecordListResType.class,
    CustomerListResType.class,
    CloneZoneResType.class,
    CreateZoneResType.class,
    GetResourceRecordListGenericResType.class,
    GetCustomerNameServerListResType.class,
    CreateCustomerNameServerResType.class,
    TaskedResType.class,
    GetTaskListResType.class,
    GetZoneInfoResType.class,
    CustomerWithServicesResType.class,
    GetCustomerNameServerByIpResType.class,
    GetAccountZoneStatsResType.class,
    CustomerInfoResType.class
})
public class BaseDnsaResType {

    protected boolean callSuccess;
    protected List<ReasonType> reason;

    /**
     * Gets the value of the callSuccess property.
     * 
     */
    public boolean isCallSuccess() {
        return callSuccess;
    }

    /**
     * Sets the value of the callSuccess property.
     * 
     */
    public void setCallSuccess(boolean value) {
        this.callSuccess = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonType }
     * 
     * 
     */
    public List<ReasonType> getReason() {
        if (reason == null) {
            reason = new ArrayList<ReasonType>();
        }
        return this.reason;
    }

}
