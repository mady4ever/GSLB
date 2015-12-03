
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFailOverInfoResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFailOverInfoResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="failOverInfo" type="{urn:com:verisign:dnsa:api:schema:2}FailOverInfoElementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFailOverInfoResType", propOrder = {
    "failOverInfo"
})
public class GetFailOverInfoResType
    extends BaseDnsaResType
{

    protected FailOverInfoElementType failOverInfo;

    /**
     * Gets the value of the failOverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FailOverInfoElementType }
     *     
     */
    public FailOverInfoElementType getFailOverInfo() {
        return failOverInfo;
    }

    /**
     * Sets the value of the failOverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailOverInfoElementType }
     *     
     */
    public void setFailOverInfo(FailOverInfoElementType value) {
        this.failOverInfo = value;
    }

}
