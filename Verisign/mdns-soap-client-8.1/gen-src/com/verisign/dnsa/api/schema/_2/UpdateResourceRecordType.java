
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateResourceRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateResourceRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="oldResourceRecord" type="{urn:com:verisign:dnsa:api:schema:2}UniqueResourceRecordDataType"/>
 *         &lt;element name="newResourceRecord" type="{urn:com:verisign:dnsa:api:schema:2}ResourceRecordDataType"/>
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
@XmlType(name = "UpdateResourceRecordType", propOrder = {
    "oldResourceRecord",
    "newResourceRecord"
})
public class UpdateResourceRecordType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected UniqueResourceRecordDataType oldResourceRecord;
    @XmlElement(required = true)
    protected ResourceRecordDataType newResourceRecord;

    /**
     * Gets the value of the oldResourceRecord property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueResourceRecordDataType }
     *     
     */
    public UniqueResourceRecordDataType getOldResourceRecord() {
        return oldResourceRecord;
    }

    /**
     * Sets the value of the oldResourceRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueResourceRecordDataType }
     *     
     */
    public void setOldResourceRecord(UniqueResourceRecordDataType value) {
        this.oldResourceRecord = value;
    }

    /**
     * Gets the value of the newResourceRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceRecordDataType }
     *     
     */
    public ResourceRecordDataType getNewResourceRecord() {
        return newResourceRecord;
    }

    /**
     * Sets the value of the newResourceRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceRecordDataType }
     *     
     */
    public void setNewResourceRecord(ResourceRecordDataType value) {
        this.newResourceRecord = value;
    }

}
