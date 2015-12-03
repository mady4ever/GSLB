
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerNameServerByIpResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerNameServerByIpResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="nameServer" type="{urn:com:verisign:dnsa:api:schema:1}CustomerNameServer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerNameServerByIpResType", propOrder = {
    "nameServer"
})
public class GetCustomerNameServerByIpResType
    extends BaseDnsaResType
{

    protected List<CustomerNameServer> nameServer;

    /**
     * Gets the value of the nameServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerNameServer }
     * 
     * 
     */
    public List<CustomerNameServer> getNameServer() {
        if (nameServer == null) {
            nameServer = new ArrayList<CustomerNameServer>();
        }
        return this.nameServer;
    }

}
