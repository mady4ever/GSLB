
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniqueResourceRecordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniqueResourceRecordsType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="resourceRecord" type="{urn:com:verisign:dnsa:api:schema:2}UniqueResourceRecordDataType" maxOccurs="unbounded"/>
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
@XmlType(name = "UniqueResourceRecordsType", propOrder = {
    "resourceRecord"
})
public class UniqueResourceRecordsType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected List<UniqueResourceRecordDataType> resourceRecord;

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
     * {@link UniqueResourceRecordDataType }
     * 
     * 
     */
    public List<UniqueResourceRecordDataType> getResourceRecord() {
        if (resourceRecord == null) {
            resourceRecord = new ArrayList<UniqueResourceRecordDataType>();
        }
        return this.resourceRecord;
    }

}
