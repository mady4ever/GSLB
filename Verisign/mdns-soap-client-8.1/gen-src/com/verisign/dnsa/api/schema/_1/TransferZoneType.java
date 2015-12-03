
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.auth.schema._1.CustomerContextType;


/**
 * <p>Java class for TransferZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferZoneType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="toCustomer" type="{urn:com:verisign:dnsa:auth:schema:1}CustomerContextType"/>
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
@XmlType(name = "TransferZoneType", propOrder = {
    "domainName",
    "toCustomer"
})
public class TransferZoneType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected List<String> domainName;
    @XmlElement(required = true)
    protected CustomerContextType toCustomer;

    /**
     * Gets the value of the domainName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDomainName() {
        if (domainName == null) {
            domainName = new ArrayList<String>();
        }
        return this.domainName;
    }

    /**
     * Gets the value of the toCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerContextType }
     *     
     */
    public CustomerContextType getToCustomer() {
        return toCustomer;
    }

    /**
     * Sets the value of the toCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerContextType }
     *     
     */
    public void setToCustomer(CustomerContextType value) {
        this.toCustomer = value;
    }

}
