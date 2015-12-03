
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerListType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="listPagingInfo" type="{urn:com:verisign:dnsa:api:schema:1}ListPagingInfo" minOccurs="0"/>
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
@XmlType(name = "GetCustomerListType", propOrder = {
    "listPagingInfo"
})
public class GetCustomerListType
    extends BaseExtensibleType
{

    protected ListPagingInfo listPagingInfo;

    /**
     * Gets the value of the listPagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ListPagingInfo }
     *     
     */
    public ListPagingInfo getListPagingInfo() {
        return listPagingInfo;
    }

    /**
     * Sets the value of the listPagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPagingInfo }
     *     
     */
    public void setListPagingInfo(ListPagingInfo value) {
        this.listPagingInfo = value;
    }

}
