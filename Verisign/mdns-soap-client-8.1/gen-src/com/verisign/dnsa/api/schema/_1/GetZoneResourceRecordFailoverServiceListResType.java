
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetZoneResourceRecordFailoverServiceListResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetZoneResourceRecordFailoverServiceListResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resourceRecordFailoverServiceInfo" type="{urn:com:verisign:dnsa:api:schema:1}ResourceRecordFailoverServiceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetZoneResourceRecordFailoverServiceListResType", propOrder = {
    "totalCount",
    "resourceRecordFailoverServiceInfo"
})
public class GetZoneResourceRecordFailoverServiceListResType
    extends BaseDnsaResType
{

    protected int totalCount;
    protected List<ResourceRecordFailoverServiceInfo> resourceRecordFailoverServiceInfo;

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the resourceRecordFailoverServiceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceRecordFailoverServiceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceRecordFailoverServiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceRecordFailoverServiceInfo }
     * 
     * 
     */
    public List<ResourceRecordFailoverServiceInfo> getResourceRecordFailoverServiceInfo() {
        if (resourceRecordFailoverServiceInfo == null) {
            resourceRecordFailoverServiceInfo = new ArrayList<ResourceRecordFailoverServiceInfo>();
        }
        return this.resourceRecordFailoverServiceInfo;
    }

}
