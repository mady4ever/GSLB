
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMultiZoneAllowTransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMultiZoneAllowTransferType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="oldAllowTransferRecord" type="{urn:com:verisign:dnsa:api:schema:1}PerZoneAllowTransferRecord"/>
 *         &lt;element name="newAllowTransferRecord" type="{urn:com:verisign:dnsa:api:schema:1}PerZoneAllowTransferRecord"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "UpdateMultiZoneAllowTransferType", propOrder = {
    "domainName",
    "oldAllowTransferRecord",
    "newAllowTransferRecord",
    "comments"
})
public class UpdateMultiZoneAllowTransferType
    extends BaseExtensibleType
{

    protected List<String> domainName;
    @XmlElement(required = true)
    protected PerZoneAllowTransferRecord oldAllowTransferRecord;
    @XmlElement(required = true)
    protected PerZoneAllowTransferRecord newAllowTransferRecord;
    protected String comments;

    /**
     * Gets the value of the domainName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDomainName() {
        if (domainName == null) {
            domainName = new ArrayList<String>();
        }
        return this.domainName;
    }

    /**
     * Gets the value of the oldAllowTransferRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PerZoneAllowTransferRecord }
     *     
     */
    public PerZoneAllowTransferRecord getOldAllowTransferRecord() {
        return oldAllowTransferRecord;
    }

    /**
     * Sets the value of the oldAllowTransferRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerZoneAllowTransferRecord }
     *     
     */
    public void setOldAllowTransferRecord(PerZoneAllowTransferRecord value) {
        this.oldAllowTransferRecord = value;
    }

    /**
     * Gets the value of the newAllowTransferRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PerZoneAllowTransferRecord }
     *     
     */
    public PerZoneAllowTransferRecord getNewAllowTransferRecord() {
        return newAllowTransferRecord;
    }

    /**
     * Sets the value of the newAllowTransferRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerZoneAllowTransferRecord }
     *     
     */
    public void setNewAllowTransferRecord(PerZoneAllowTransferRecord value) {
        this.newAllowTransferRecord = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
