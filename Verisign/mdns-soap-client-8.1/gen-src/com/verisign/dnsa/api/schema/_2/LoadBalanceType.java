
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadBalanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadBalanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}LoadBalanceTypeBase">
 *       &lt;sequence>
 *         &lt;element name="failoverConfigInfo" type="{urn:com:verisign:dnsa:api:schema:2}LBFailOverInfoType" minOccurs="0"/>
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
@XmlType(name = "LoadBalanceType", propOrder = {
    "failoverConfigInfo"
})
@XmlSeeAlso({
    CreateLoadBalanceType.class,
    UpdateLoadBalanceType.class
})
public class LoadBalanceType
    extends LoadBalanceTypeBase
{

    protected LBFailOverInfoType failoverConfigInfo;

    /**
     * Gets the value of the failoverConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LBFailOverInfoType }
     *     
     */
    public LBFailOverInfoType getFailoverConfigInfo() {
        return failoverConfigInfo;
    }

    /**
     * Sets the value of the failoverConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LBFailOverInfoType }
     *     
     */
    public void setFailoverConfigInfo(LBFailOverInfoType value) {
        this.failoverConfigInfo = value;
    }

}
