
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCustomerSiteOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustomerSiteOptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:com:verisign:dnsa:api:schema:1}ZoneSiteOptionInfo"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CreateCustomerSiteOptionType", propOrder = {
    "accountSiteOptionName",
    "virtualNameServerId",
    "comments"
})
public class CreateCustomerSiteOptionType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String accountSiteOptionName;
    @XmlElement(type = Long.class)
    protected List<Long> virtualNameServerId;
    protected String comments;

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
     * Gets the value of the virtualNameServerId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualNameServerId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualNameServerId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getVirtualNameServerId() {
        if (virtualNameServerId == null) {
            virtualNameServerId = new ArrayList<Long>();
        }
        return this.virtualNameServerId;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
