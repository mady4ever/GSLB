
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloneZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloneZoneType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainNameToClone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "CloneZoneType", propOrder = {
    "domainNameToClone",
    "domainName",
    "comments"
})
public class CloneZoneType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String domainNameToClone;
    @XmlElement(required = true)
    protected String domainName;
    protected String comments;

    /**
     * Gets the value of the domainNameToClone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainNameToClone() {
        return domainNameToClone;
    }

    /**
     * Sets the value of the domainNameToClone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainNameToClone(String value) {
        this.domainNameToClone = value;
    }

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
