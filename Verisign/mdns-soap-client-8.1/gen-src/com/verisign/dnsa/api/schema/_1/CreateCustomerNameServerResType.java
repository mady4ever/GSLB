
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCustomerNameServerResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustomerNameServerResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="nameServer" type="{urn:com:verisign:dnsa:api:schema:1}CustomerNameServer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCustomerNameServerResType", propOrder = {
    "nameServer"
})
public class CreateCustomerNameServerResType
    extends BaseDnsaResType
{

    @XmlElement(required = true)
    protected CustomerNameServer nameServer;

    /**
     * Gets the value of the nameServer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameServer }
     *     
     */
    public CustomerNameServer getNameServer() {
        return nameServer;
    }

    /**
     * Sets the value of the nameServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameServer }
     *     
     */
    public void setNameServer(CustomerNameServer value) {
        this.nameServer = value;
    }

}
