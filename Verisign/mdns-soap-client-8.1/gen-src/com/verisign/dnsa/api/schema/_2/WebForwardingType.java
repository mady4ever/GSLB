
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebForwardingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebForwardingType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}WebForwardingTypeBase">
 *       &lt;sequence>
 *         &lt;element name="webForwardRecord_V2" type="{urn:com:verisign:dnsa:api:schema:2}WebForwardRecord_V2" maxOccurs="unbounded"/>
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
@XmlType(name = "WebForwardingType", propOrder = {
    "webForwardRecordV2"
})
@XmlSeeAlso({
    CreateWebForwardTypeV2 .class
})
public class WebForwardingType
    extends WebForwardingTypeBase
{

    @XmlElement(name = "webForwardRecord_V2", required = true)
    protected List<WebForwardRecordV2> webForwardRecordV2;

    /**
     * Gets the value of the webForwardRecordV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webForwardRecordV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebForwardRecordV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebForwardRecordV2 }
     * 
     * 
     */
    public List<WebForwardRecordV2> getWebForwardRecordV2() {
        if (webForwardRecordV2 == null) {
            webForwardRecordV2 = new ArrayList<WebForwardRecordV2>();
        }
        return this.webForwardRecordV2;
    }

}
