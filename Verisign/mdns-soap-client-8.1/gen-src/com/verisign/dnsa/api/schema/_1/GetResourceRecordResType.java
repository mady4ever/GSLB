
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResourceRecordResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResourceRecordResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="resourceRecord" type="{urn:com:verisign:dnsa:api:schema:1}ResourceRecord"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResourceRecordResType", propOrder = {
    "resourceRecord"
})
public class GetResourceRecordResType
    extends BaseDnsaResType
{

    @XmlElement(required = true)
    protected ResourceRecord resourceRecord;

    /**
     * Gets the value of the resourceRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceRecord }
     *     
     */
    public ResourceRecord getResourceRecord() {
        return resourceRecord;
    }

    /**
     * Sets the value of the resourceRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceRecord }
     *     
     */
    public void setResourceRecord(ResourceRecord value) {
        this.resourceRecord = value;
    }

}
