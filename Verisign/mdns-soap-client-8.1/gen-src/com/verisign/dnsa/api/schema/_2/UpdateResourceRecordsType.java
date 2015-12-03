
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateResourceRecordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateResourceRecordsType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="updateResourceRecord" type="{urn:com:verisign:dnsa:api:schema:2}UpdateResourceRecordType" maxOccurs="unbounded"/>
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
@XmlType(name = "UpdateResourceRecordsType", propOrder = {
    "updateResourceRecord"
})
public class UpdateResourceRecordsType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected List<UpdateResourceRecordType> updateResourceRecord;

    /**
     * Gets the value of the updateResourceRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateResourceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateResourceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateResourceRecordType }
     * 
     * 
     */
    public List<UpdateResourceRecordType> getUpdateResourceRecord() {
        if (updateResourceRecord == null) {
            updateResourceRecord = new ArrayList<UpdateResourceRecordType>();
        }
        return this.updateResourceRecord;
    }

}
