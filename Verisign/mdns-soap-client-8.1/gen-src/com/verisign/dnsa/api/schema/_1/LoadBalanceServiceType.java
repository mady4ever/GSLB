
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadBalanceServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadBalanceServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="rrLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "LoadBalanceServiceType", propOrder = {
    "rrLimit"
})
public class LoadBalanceServiceType
    extends BaseExtensibleType
{

    protected int rrLimit;

    /**
     * Gets the value of the rrLimit property.
     * 
     */
    public int getRrLimit() {
        return rrLimit;
    }

    /**
     * Sets the value of the rrLimit property.
     * 
     */
    public void setRrLimit(int value) {
        this.rrLimit = value;
    }

}
