
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailOverInfoElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailOverInfoElementType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseFailOverInfoType">
 *       &lt;sequence>
 *         &lt;element name="failOverRRInfoList" type="{urn:com:verisign:dnsa:api:schema:2}FailOverInfoListResType"/>
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
@XmlType(name = "FailOverInfoElementType", propOrder = {
    "failOverRRInfoList"
})
public class FailOverInfoElementType
    extends BaseFailOverInfoType
{

    @XmlElement(required = true)
    protected FailOverInfoListResType failOverRRInfoList;

    /**
     * Gets the value of the failOverRRInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link FailOverInfoListResType }
     *     
     */
    public FailOverInfoListResType getFailOverRRInfoList() {
        return failOverRRInfoList;
    }

    /**
     * Sets the value of the failOverRRInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailOverInfoListResType }
     *     
     */
    public void setFailOverRRInfoList(FailOverInfoListResType value) {
        this.failOverRRInfoList = value;
    }

}
