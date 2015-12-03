
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetZoneResourceRecordFailoverServiceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetZoneResourceRecordFailoverServiceListType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GetZoneResourceRecordFailoverServiceListType", propOrder = {
    "domainName",
    "listPagingInfo"
})
public class GetZoneResourceRecordFailoverServiceListType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String domainName;
    protected ListPagingInfo listPagingInfo;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

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
