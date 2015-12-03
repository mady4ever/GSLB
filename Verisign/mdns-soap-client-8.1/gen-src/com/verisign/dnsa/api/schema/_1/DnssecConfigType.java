
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DnssecConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DnssecConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="nsecOption" type="{urn:com:verisign:dnsa:api:schema:1}NsecType"/>
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
@XmlType(name = "DnssecConfigType", propOrder = {
    "nsecOption"
})
public class DnssecConfigType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected NsecType nsecOption;

    /**
     * Gets the value of the nsecOption property.
     * 
     * @return
     *     possible object is
     *     {@link NsecType }
     *     
     */
    public NsecType getNsecOption() {
        return nsecOption;
    }

    /**
     * Sets the value of the nsecOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsecType }
     *     
     */
    public void setNsecOption(NsecType value) {
        this.nsecOption = value;
    }

}
