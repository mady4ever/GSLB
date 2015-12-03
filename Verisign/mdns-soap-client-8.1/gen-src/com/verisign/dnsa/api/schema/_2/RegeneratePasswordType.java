
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegeneratePasswordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegeneratePasswordType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="logonname" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "RegeneratePasswordType", propOrder = {
    "logonname"
})
public class RegeneratePasswordType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String logonname;

    /**
     * Gets the value of the logonname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogonname() {
        return logonname;
    }

    /**
     * Sets the value of the logonname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogonname(String value) {
        this.logonname = value;
    }

}
