
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LBRRDirectiveResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LBRRDirectiveResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="rdata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="probeStatusOverrideType" type="{urn:com:verisign:dnsa:api:schema:2}probeStatusOverrideType" minOccurs="0"/>
 *         &lt;element name="hostStatus" type="{urn:com:verisign:dnsa:api:schema:2}hostStatusType" minOccurs="0"/>
 *         &lt;element name="isLive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="conversation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LBRRDirectiveResType", propOrder = {
    "rdata",
    "weight",
    "priority",
    "probeStatusOverrideType",
    "hostStatus",
    "isLive",
    "conversation"
})
public class LBRRDirectiveResType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String rdata;
    protected int weight;
    protected Integer priority;
    protected ProbeStatusOverrideType probeStatusOverrideType;
    protected HostStatusType hostStatus;
    protected Boolean isLive;
    protected String conversation;

    /**
     * Gets the value of the rdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRdata() {
        return rdata;
    }

    /**
     * Sets the value of the rdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRdata(String value) {
        this.rdata = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the probeStatusOverrideType property.
     * 
     * @return
     *     possible object is
     *     {@link ProbeStatusOverrideType }
     *     
     */
    public ProbeStatusOverrideType getProbeStatusOverrideType() {
        return probeStatusOverrideType;
    }

    /**
     * Sets the value of the probeStatusOverrideType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbeStatusOverrideType }
     *     
     */
    public void setProbeStatusOverrideType(ProbeStatusOverrideType value) {
        this.probeStatusOverrideType = value;
    }

    /**
     * Gets the value of the hostStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HostStatusType }
     *     
     */
    public HostStatusType getHostStatus() {
        return hostStatus;
    }

    /**
     * Sets the value of the hostStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostStatusType }
     *     
     */
    public void setHostStatus(HostStatusType value) {
        this.hostStatus = value;
    }

    /**
     * Gets the value of the isLive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLive() {
        return isLive;
    }

    /**
     * Sets the value of the isLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLive(Boolean value) {
        this.isLive = value;
    }

    /**
     * Gets the value of the conversation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversation() {
        return conversation;
    }

    /**
     * Sets the value of the conversation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversation(String value) {
        this.conversation = value;
    }

}
