
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUserParametersResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserParametersResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="getUserParameters" type="{urn:com:verisign:dnsa:api:schema:2}UserParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserParametersResType", propOrder = {
    "getUserParameters"
})
public class GetUserParametersResType
    extends BaseDnsaResType
{

    protected UserParameters getUserParameters;

    /**
     * Gets the value of the getUserParameters property.
     * 
     * @return
     *     possible object is
     *     {@link UserParameters }
     *     
     */
    public UserParameters getGetUserParameters() {
        return getUserParameters;
    }

    /**
     * Sets the value of the getUserParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserParameters }
     *     
     */
    public void setGetUserParameters(UserParameters value) {
        this.getUserParameters = value;
    }

}
