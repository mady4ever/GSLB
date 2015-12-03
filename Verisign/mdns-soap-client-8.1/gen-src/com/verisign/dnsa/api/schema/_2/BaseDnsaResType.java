
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.ReasonType;


/**
 * base DNSA API Response
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
    GetTrafficManagementResType.class,
    GetEnabledGeoLocationViewsResType.class,
    GetGeoLocationViewSetsResType.class,
    GetLoadBalanceResType.class,
    AddGeoLocationZoneResType.class,
    GetFailOverInfoListResType.class,
    GetFailOverInfoResType.class,
    GetUserParametersResType.class,
    CustomerWithServicesResType.class,
    EnableGeoLocationResType.class
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
