
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DnssecInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DnssecInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="dnssecConfig" type="{urn:com:verisign:dnsa:api:schema:1}DnssecConfigType"/>
 *         &lt;element name="activeKSK" type="{urn:com:verisign:dnsa:api:schema:1}DnsKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prePublishedKSK" type="{urn:com:verisign:dnsa:api:schema:1}DnsKey" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DnssecInfo", propOrder = {
    "dnssecConfig",
    "activeKSK",
    "prePublishedKSK"
})
public class DnssecInfo
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected DnssecConfigType dnssecConfig;
    protected List<DnsKey> activeKSK;
    protected List<DnsKey> prePublishedKSK;

    /**
     * Gets the value of the dnssecConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DnssecConfigType }
     *     
     */
    public DnssecConfigType getDnssecConfig() {
        return dnssecConfig;
    }

    /**
     * Sets the value of the dnssecConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DnssecConfigType }
     *     
     */
    public void setDnssecConfig(DnssecConfigType value) {
        this.dnssecConfig = value;
    }

    /**
     * Gets the value of the activeKSK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeKSK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveKSK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DnsKey }
     * 
     * 
     */
    public List<DnsKey> getActiveKSK() {
        if (activeKSK == null) {
            activeKSK = new ArrayList<DnsKey>();
        }
        return this.activeKSK;
    }

    /**
     * Gets the value of the prePublishedKSK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prePublishedKSK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrePublishedKSK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DnsKey }
     * 
     * 
     */
    public List<DnsKey> getPrePublishedKSK() {
        if (prePublishedKSK == null) {
            prePublishedKSK = new ArrayList<DnsKey>();
        }
        return this.prePublishedKSK;
    }

}
