
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createRemoveUserZoneAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createRemoveUserZoneAssociationsType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="logOnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="removeDomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="associateDomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "createRemoveUserZoneAssociationsType", propOrder = {
    "logOnName",
    "removeDomain",
    "associateDomain"
})
public class CreateRemoveUserZoneAssociationsType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String logOnName;
    protected List<String> removeDomain;
    protected List<String> associateDomain;

    /**
     * Gets the value of the logOnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogOnName() {
        return logOnName;
    }

    /**
     * Sets the value of the logOnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogOnName(String value) {
        this.logOnName = value;
    }

    /**
     * Gets the value of the removeDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removeDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoveDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemoveDomain() {
        if (removeDomain == null) {
            removeDomain = new ArrayList<String>();
        }
        return this.removeDomain;
    }

    /**
     * Gets the value of the associateDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associateDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociateDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssociateDomain() {
        if (associateDomain == null) {
            associateDomain = new ArrayList<String>();
        }
        return this.associateDomain;
    }

}
