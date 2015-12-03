
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.BaseDnsaResType;


/**
 * <p>Java class for GetCustomerNameServerListResType_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerNameServerListResType_V2">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="nameServerInfo" type="{urn:com:verisign:dnsa:api:schema:2}NameServerInfo_V2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerNameServerListResType_V2", propOrder = {
    "nameServerInfo"
})
public class GetCustomerNameServerListResTypeV2
    extends BaseDnsaResType
{

    protected List<NameServerInfoV2> nameServerInfo;

    /**
     * Gets the value of the nameServerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameServerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameServerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameServerInfoV2 }
     * 
     * 
     */
    public List<NameServerInfoV2> getNameServerInfo() {
        if (nameServerInfo == null) {
            nameServerInfo = new ArrayList<NameServerInfoV2>();
        }
        return this.nameServerInfo;
    }

}
