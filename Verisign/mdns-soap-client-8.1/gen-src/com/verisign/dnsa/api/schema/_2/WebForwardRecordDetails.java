
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebForwardRecordDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebForwardRecordDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webForwardRecord_V2" type="{urn:com:verisign:dnsa:api:schema:2}WebForwardRecord_V2" maxOccurs="unbounded"/>
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
@XmlType(name = "WebForwardRecordDetails", propOrder = {
    "owner",
    "webForwardRecordV2"
})
public class WebForwardRecordDetails
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String owner;
    @XmlElement(name = "webForwardRecord_V2", required = true)
    protected List<WebForwardRecordV2> webForwardRecordV2;

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the webForwardRecordV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webForwardRecordV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebForwardRecordV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebForwardRecordV2 }
     * 
     * 
     */
    public List<WebForwardRecordV2> getWebForwardRecordV2() {
        if (webForwardRecordV2 == null) {
            webForwardRecordV2 = new ArrayList<WebForwardRecordV2>();
        }
        return this.webForwardRecordV2;
    }

}
