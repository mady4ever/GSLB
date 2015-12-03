
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteCustomerNameServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCustomerNameServerType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="nameServerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "DeleteCustomerNameServerType", propOrder = {
    "nameServerId"
})
public class DeleteCustomerNameServerType
    extends BaseExtensibleType
{

    protected long nameServerId;

    /**
     * Gets the value of the nameServerId property.
     * 
     */
    public long getNameServerId() {
        return nameServerId;
    }

    /**
     * Sets the value of the nameServerId property.
     * 
     */
    public void setNameServerId(long value) {
        this.nameServerId = value;
    }

}
