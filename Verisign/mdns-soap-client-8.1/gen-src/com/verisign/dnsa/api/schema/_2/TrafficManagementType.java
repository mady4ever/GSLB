
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficManagementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficManagementType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="zoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resourceRecordType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="probeConfigInfo" type="{urn:com:verisign:dnsa:api:schema:2}TMProbeInfoType" minOccurs="0"/>
 *         &lt;element name="tmScriptDirective" type="{urn:com:verisign:dnsa:api:schema:2}TMScriptDirective" minOccurs="0"/>
 *         &lt;element name="tmRRVariantDirective" type="{urn:com:verisign:dnsa:api:schema:2}TMRRVariantDirective" maxOccurs="unbounded"/>
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
@XmlType(name = "TrafficManagementType", propOrder = {
    "zoneName",
    "owner",
    "ttl",
    "resourceRecordType",
    "probeConfigInfo",
    "tmScriptDirective",
    "tmRRVariantDirective"
})
public class TrafficManagementType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String zoneName;
    @XmlElement(required = true)
    protected String owner;
    @XmlElement(defaultValue = "86400")
    protected long ttl;
    @XmlElement(required = true)
    protected String resourceRecordType;
    protected TMProbeInfoType probeConfigInfo;
    protected TMScriptDirective tmScriptDirective;
    @XmlElement(required = true)
    protected List<TMRRVariantDirective> tmRRVariantDirective;

    /**
     * Gets the value of the zoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets the value of the zoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneName(String value) {
        this.zoneName = value;
    }

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
     * Gets the value of the ttl property.
     * 
     */
    public long getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     */
    public void setTtl(long value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the resourceRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceRecordType() {
        return resourceRecordType;
    }

    /**
     * Sets the value of the resourceRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceRecordType(String value) {
        this.resourceRecordType = value;
    }

    /**
     * Gets the value of the probeConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TMProbeInfoType }
     *     
     */
    public TMProbeInfoType getProbeConfigInfo() {
        return probeConfigInfo;
    }

    /**
     * Sets the value of the probeConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMProbeInfoType }
     *     
     */
    public void setProbeConfigInfo(TMProbeInfoType value) {
        this.probeConfigInfo = value;
    }

    /**
     * Gets the value of the tmScriptDirective property.
     * 
     * @return
     *     possible object is
     *     {@link TMScriptDirective }
     *     
     */
    public TMScriptDirective getTmScriptDirective() {
        return tmScriptDirective;
    }

    /**
     * Sets the value of the tmScriptDirective property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMScriptDirective }
     *     
     */
    public void setTmScriptDirective(TMScriptDirective value) {
        this.tmScriptDirective = value;
    }

    /**
     * Gets the value of the tmRRVariantDirective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmRRVariantDirective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmRRVariantDirective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMRRVariantDirective }
     * 
     * 
     */
    public List<TMRRVariantDirective> getTmRRVariantDirective() {
        if (tmRRVariantDirective == null) {
            tmRRVariantDirective = new ArrayList<TMRRVariantDirective>();
        }
        return this.tmRRVariantDirective;
    }

}
