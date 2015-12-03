
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.BaseDnsaResType;


/**
 * <p>Java class for GetResourceRecordsWithServiceListResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResourceRecordsWithServiceListResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="ResourceRecordWithService" type="{urn:com:verisign:dnsa:api:schema:2}ResourceRecordWithService" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResourceRecordsWithServiceListResType", propOrder = {
    "resourceRecordWithService"
})
public class GetResourceRecordsWithServiceListResType
    extends BaseDnsaResType
{

    @XmlElement(name = "ResourceRecordWithService", required = true)
    protected List<ResourceRecordWithService> resourceRecordWithService;

    /**
     * Gets the value of the resourceRecordWithService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceRecordWithService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceRecordWithService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceRecordWithService }
     * 
     * 
     */
    public List<ResourceRecordWithService> getResourceRecordWithService() {
        if (resourceRecordWithService == null) {
            resourceRecordWithService = new ArrayList<ResourceRecordWithService>();
        }
        return this.resourceRecordWithService;
    }

}
