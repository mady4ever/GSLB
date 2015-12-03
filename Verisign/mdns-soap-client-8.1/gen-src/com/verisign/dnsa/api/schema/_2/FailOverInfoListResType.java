
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailOverInfoListResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailOverInfoListResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="failOverRRInfo" type="{urn:com:verisign:dnsa:api:schema:2}failOverRRInfoResType" maxOccurs="unbounded"/>
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
@XmlType(name = "FailOverInfoListResType", propOrder = {
    "failOverRRInfo"
})
public class FailOverInfoListResType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected List<FailOverRRInfoResType> failOverRRInfo;

    /**
     * Gets the value of the failOverRRInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failOverRRInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailOverRRInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailOverRRInfoResType }
     * 
     * 
     */
    public List<FailOverRRInfoResType> getFailOverRRInfo() {
        if (failOverRRInfo == null) {
            failOverRRInfo = new ArrayList<FailOverRRInfoResType>();
        }
        return this.failOverRRInfo;
    }

}
