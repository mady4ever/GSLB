
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for failOverRRInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="failOverRRInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="failOverTarget" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="probeStatusOverrideType" type="{urn:com:verisign:dnsa:api:schema:2}probeStatusOverrideType" minOccurs="0"/>
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
@XmlType(name = "failOverRRInfoType", propOrder = {
    "failOverTarget",
    "priority",
    "probeStatusOverrideType"
})
public class FailOverRRInfoType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String failOverTarget;
    protected int priority;
    protected ProbeStatusOverrideType probeStatusOverrideType;

    /**
     * Gets the value of the failOverTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailOverTarget() {
        return failOverTarget;
    }

    /**
     * Sets the value of the failOverTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailOverTarget(String value) {
        this.failOverTarget = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
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

}
