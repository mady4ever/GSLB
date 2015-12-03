
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMultiZoneResourceRecordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMultiZoneResourceRecordsType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="resourceRecordType" type="{urn:com:verisign:dnsa:api:schema:1}ResourceRecordType"/>
 *         &lt;element name="updateRData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="oldRData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="newRData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="updateTtl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="allowanyIP" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMultiZoneResourceRecordsType", propOrder = {
    "domainName",
    "resourceRecordType",
    "updateRData",
    "updateTtl",
    "comments"
})
public class UpdateMultiZoneResourceRecordsType
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected List<String> domainName;
    @XmlElement(required = true)
    protected ResourceRecordType resourceRecordType;
    protected UpdateMultiZoneResourceRecordsType.UpdateRData updateRData;
    protected Long updateTtl;
    protected String comments;
    @XmlAttribute(name = "allowanyIP")
    protected Boolean allowanyIP;

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
     * Gets the value of the resourceRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceRecordType }
     *     
     */
    public ResourceRecordType getResourceRecordType() {
        return resourceRecordType;
    }

    /**
     * Sets the value of the resourceRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceRecordType }
     *     
     */
    public void setResourceRecordType(ResourceRecordType value) {
        this.resourceRecordType = value;
    }

    /**
     * Gets the value of the updateRData property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMultiZoneResourceRecordsType.UpdateRData }
     *     
     */
    public UpdateMultiZoneResourceRecordsType.UpdateRData getUpdateRData() {
        return updateRData;
    }

    /**
     * Sets the value of the updateRData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMultiZoneResourceRecordsType.UpdateRData }
     *     
     */
    public void setUpdateRData(UpdateMultiZoneResourceRecordsType.UpdateRData value) {
        this.updateRData = value;
    }

    /**
     * Gets the value of the updateTtl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdateTtl() {
        return updateTtl;
    }

    /**
     * Sets the value of the updateTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdateTtl(Long value) {
        this.updateTtl = value;
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

    /**
     * Gets the value of the allowanyIP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowanyIP() {
        if (allowanyIP == null) {
            return false;
        } else {
            return allowanyIP;
        }
    }

    /**
     * Sets the value of the allowanyIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowanyIP(Boolean value) {
        this.allowanyIP = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="oldRData" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="newRData" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oldRData",
        "newRData"
    })
    public static class UpdateRData {

        @XmlElement(required = true)
        protected String oldRData;
        @XmlElement(required = true)
        protected String newRData;

        /**
         * Gets the value of the oldRData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldRData() {
            return oldRData;
        }

        /**
         * Sets the value of the oldRData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldRData(String value) {
            this.oldRData = value;
        }

        /**
         * Gets the value of the newRData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewRData() {
            return newRData;
        }

        /**
         * Sets the value of the newRData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewRData(String value) {
            this.newRData = value;
        }

    }

}
