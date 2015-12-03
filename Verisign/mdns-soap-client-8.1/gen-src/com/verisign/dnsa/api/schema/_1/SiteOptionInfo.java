
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteOptionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteOptionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountSiteOptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameServer" type="{urn:com:verisign:dnsa:api:schema:1}NameServerInfo" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteOptionInfo", propOrder = {
    "accountSiteOptionName",
    "nameServer"
})
public class SiteOptionInfo {

    @XmlElement(required = true)
    protected String accountSiteOptionName;
    @XmlElement(required = true)
    protected List<NameServerInfo> nameServer;

    /**
     * Gets the value of the accountSiteOptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSiteOptionName() {
        return accountSiteOptionName;
    }

    /**
     * Sets the value of the accountSiteOptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSiteOptionName(String value) {
        this.accountSiteOptionName = value;
    }

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
     * {@link NameServerInfo }
     * 
     * 
     */
    public List<NameServerInfo> getNameServer() {
        if (nameServer == null) {
            nameServer = new ArrayList<NameServerInfo>();
        }
        return this.nameServer;
    }

}
