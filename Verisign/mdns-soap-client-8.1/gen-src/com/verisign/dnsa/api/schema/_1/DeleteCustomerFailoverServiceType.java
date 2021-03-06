
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteCustomerFailoverServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCustomerFailoverServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="clientCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DeleteCustomerFailoverServiceType", propOrder = {
    "clientCustomerId"
})
public class DeleteCustomerFailoverServiceType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String clientCustomerId;

    /**
     * Gets the value of the clientCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCustomerId() {
        return clientCustomerId;
    }

    /**
     * Sets the value of the clientCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCustomerId(String value) {
        this.clientCustomerId = value;
    }

}
