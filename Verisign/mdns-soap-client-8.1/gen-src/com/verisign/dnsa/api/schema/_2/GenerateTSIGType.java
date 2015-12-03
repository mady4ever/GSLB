
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.verisign.dnsa.api.schema._1.TSIGAlgorithm;


/**
 * <p>Java class for GenerateTSIGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateTSIGType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="TSIGAlgorithm" type="{urn:com:verisign:dnsa:api:schema:1}TSIGAlgorithm"/>
 *         &lt;element name="keySize" type="{urn:com:verisign:dnsa:api:schema:1}TSIGKeySize"/>
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
@XmlType(name = "GenerateTSIGType", propOrder = {
    "tsigAlgorithm",
    "keySize"
})
public class GenerateTSIGType
    extends BaseExtensibleType
{

    @XmlElement(name = "TSIGAlgorithm", required = true)
    protected TSIGAlgorithm tsigAlgorithm;
    protected int keySize;

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

    /**
     * Gets the value of the keySize property.
     * 
     */
    public int getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     */
    public void setKeySize(int value) {
        this.keySize = value;
    }

}
