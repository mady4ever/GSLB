
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEnabledGeoLocationViewsResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEnabledGeoLocationViewsResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="viewName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="viewSetName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEnabledGeoLocationViewsResType", propOrder = {
    "viewName"
})
public class GetEnabledGeoLocationViewsResType
    extends BaseDnsaResType
{

    protected List<String> viewName;
    @XmlAttribute(name = "viewSetName")
    protected String viewSetName;

    /**
     * Gets the value of the viewName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getViewName() {
        if (viewName == null) {
            viewName = new ArrayList<String>();
        }
        return this.viewName;
    }

    /**
     * Gets the value of the viewSetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewSetName() {
        return viewSetName;
    }

    /**
     * Sets the value of the viewSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewSetName(String value) {
        this.viewSetName = value;
    }

}
