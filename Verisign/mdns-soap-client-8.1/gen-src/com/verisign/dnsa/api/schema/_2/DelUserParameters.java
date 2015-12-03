
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelUserParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelUserParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="zoneParameter" type="{urn:com:verisign:dnsa:api:schema:2}DelZoneParameters" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountParameter" type="{urn:com:verisign:dnsa:api:schema:2}DelAccountParameters" minOccurs="0"/>
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
@XmlType(name = "DelUserParameters", propOrder = {
    "zoneParameter",
    "accountParameter"
})
public class DelUserParameters
    extends BaseExtensibleType
{

    protected List<DelZoneParameters> zoneParameter;
    protected DelAccountParameters accountParameter;

    /**
     * Gets the value of the zoneParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelZoneParameters }
     * 
     * 
     */
    public List<DelZoneParameters> getZoneParameter() {
        if (zoneParameter == null) {
            zoneParameter = new ArrayList<DelZoneParameters>();
        }
        return this.zoneParameter;
    }

    /**
     * Gets the value of the accountParameter property.
     * 
     * @return
     *     possible object is
     *     {@link DelAccountParameters }
     *     
     */
    public DelAccountParameters getAccountParameter() {
        return accountParameter;
    }

    /**
     * Sets the value of the accountParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelAccountParameters }
     *     
     */
    public void setAccountParameter(DelAccountParameters value) {
        this.accountParameter = value;
    }

}
