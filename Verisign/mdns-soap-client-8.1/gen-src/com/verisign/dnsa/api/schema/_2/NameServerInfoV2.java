
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameServerInfo_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameServerInfo_V2">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="generateTsig" type="{urn:com:verisign:dnsa:api:schema:2}GenerateTSIGType"/>
 *           &lt;element name="tsigInfo" type="{urn:com:verisign:dnsa:api:schema:2}TSIGInfoType_V2"/>
 *         &lt;/choice>
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
@XmlType(name = "NameServerInfo_V2", propOrder = {
    "name",
    "ipAddress",
    "generateTsig",
    "tsigInfo"
})
public class NameServerInfoV2
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String ipAddress;
    protected GenerateTSIGType generateTsig;
    protected TSIGInfoTypeV2 tsigInfo;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the generateTsig property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateTSIGType }
     *     
     */
    public GenerateTSIGType getGenerateTsig() {
        return generateTsig;
    }

    /**
     * Sets the value of the generateTsig property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateTSIGType }
     *     
     */
    public void setGenerateTsig(GenerateTSIGType value) {
        this.generateTsig = value;
    }

    /**
     * Gets the value of the tsigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TSIGInfoTypeV2 }
     *     
     */
    public TSIGInfoTypeV2 getTsigInfo() {
        return tsigInfo;
    }

    /**
     * Sets the value of the tsigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSIGInfoTypeV2 }
     *     
     */
    public void setTsigInfo(TSIGInfoTypeV2 value) {
        this.tsigInfo = value;
    }

}
