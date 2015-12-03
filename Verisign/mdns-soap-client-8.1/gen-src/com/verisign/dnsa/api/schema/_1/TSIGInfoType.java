
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSIGInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSIGInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="enableTsig" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="generateKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="keySize" type="{urn:com:verisign:dnsa:api:schema:1}TSIGKeySize" minOccurs="0"/>
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
@XmlType(name = "TSIGInfoType", propOrder = {
    "enableTsig",
    "generateKey",
    "keySize"
})
public class TSIGInfoType
    extends BaseExtensibleType
{

    protected boolean enableTsig;
    protected Boolean generateKey;
    protected Integer keySize;

    /**
     * Gets the value of the enableTsig property.
     * 
     */
    public boolean isEnableTsig() {
        return enableTsig;
    }

    /**
     * Sets the value of the enableTsig property.
     * 
     */
    public void setEnableTsig(boolean value) {
        this.enableTsig = value;
    }

    /**
     * Gets the value of the generateKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateKey() {
        return generateKey;
    }

    /**
     * Sets the value of the generateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateKey(Boolean value) {
        this.generateKey = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeySize(Integer value) {
        this.keySize = value;
    }

}
