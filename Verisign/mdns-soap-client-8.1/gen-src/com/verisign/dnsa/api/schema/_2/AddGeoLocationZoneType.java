
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGeoLocationZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGeoLocationZoneType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="copyDefaultView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="copyFromViewName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
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
@XmlType(name = "AddGeoLocationZoneType", propOrder = {
    "domainName",
    "viewName",
    "copyDefaultView",
    "copyFromViewName"
})
public class AddGeoLocationZoneType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected String viewName;
    protected Boolean copyDefaultView;
    protected String copyFromViewName;

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
     * Gets the value of the viewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * Sets the value of the viewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewName(String value) {
        this.viewName = value;
    }

    /**
     * Gets the value of the copyDefaultView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyDefaultView() {
        return copyDefaultView;
    }

    /**
     * Sets the value of the copyDefaultView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyDefaultView(Boolean value) {
        this.copyDefaultView = value;
    }

    /**
     * Gets the value of the copyFromViewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyFromViewName() {
        return copyFromViewName;
    }

    /**
     * Sets the value of the copyFromViewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyFromViewName(String value) {
        this.copyFromViewName = value;
    }

}
