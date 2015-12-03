
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResourceRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResourceRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="resourceRecordId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "GetResourceRecordType", propOrder = {
    "resourceRecordId"
})
public class GetResourceRecordType
    extends BaseExtensibleType
{

    protected long resourceRecordId;

    /**
     * Gets the value of the resourceRecordId property.
     * 
     */
    public long getResourceRecordId() {
        return resourceRecordId;
    }

    /**
     * Sets the value of the resourceRecordId property.
     * 
     */
    public void setResourceRecordId(long value) {
        this.resourceRecordId = value;
    }

}
