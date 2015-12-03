
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.TSIGAlgorithm;


/**
 * <p>Java class for TSIGInfoType_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSIGInfoType_V2">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="TSIGKeyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TSIGKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TSIGAlgorithm" type="{urn:com:verisign:dnsa:api:schema:1}TSIGAlgorithm"/>
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
@XmlType(name = "TSIGInfoType_V2", propOrder = {
    "tsigKeyName",
    "tsigKey",
    "tsigAlgorithm"
})
public class TSIGInfoTypeV2
    extends BaseExtensibleType
{

    @XmlElement(name = "TSIGKeyName", required = true)
    protected String tsigKeyName;
    @XmlElement(name = "TSIGKey", required = true)
    protected String tsigKey;
    @XmlElement(name = "TSIGAlgorithm", required = true)
    protected TSIGAlgorithm tsigAlgorithm;

    /**
     * Gets the value of the tsigKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSIGKeyName() {
        return tsigKeyName;
    }

    /**
     * Sets the value of the tsigKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSIGKeyName(String value) {
        this.tsigKeyName = value;
    }

    /**
     * Gets the value of the tsigKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSIGKey() {
        return tsigKey;
    }

    /**
     * Sets the value of the tsigKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSIGKey(String value) {
        this.tsigKey = value;
    }

    /**
     * Gets the value of the tsigAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link TSIGAlgorithm }
     *     
     */
    public TSIGAlgorithm getTSIGAlgorithm() {
        return tsigAlgorithm;
    }

    /**
     * Sets the value of the tsigAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSIGAlgorithm }
     *     
     */
    public void setTSIGAlgorithm(TSIGAlgorithm value) {
        this.tsigAlgorithm = value;
    }

}
