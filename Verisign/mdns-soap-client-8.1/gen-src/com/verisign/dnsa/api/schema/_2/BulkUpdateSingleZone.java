
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bulkUpdateSingleZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bulkUpdateSingleZone">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideWFWP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="soaSerial" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createResourceRecords" type="{urn:com:verisign:dnsa:api:schema:2}ResourceRecordsType" minOccurs="0"/>
 *         &lt;element name="updateResourceRecords" type="{urn:com:verisign:dnsa:api:schema:2}UpdateResourceRecordsType" minOccurs="0"/>
 *         &lt;element name="deleteResourceRecords" type="{urn:com:verisign:dnsa:api:schema:2}UniqueResourceRecordsType" minOccurs="0"/>
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
@XmlType(name = "bulkUpdateSingleZone", propOrder = {
    "domainName",
    "viewName",
    "overrideWFWP",
    "soaSerial",
    "createResourceRecords",
    "updateResourceRecords",
    "deleteResourceRecords",
    "comments"
})
public class BulkUpdateSingleZone
    extends BaseExtensibleType
{

    @XmlElement(required = true)
    protected String domainName;
    protected String viewName;
    @XmlElement(defaultValue = "false")
    protected Boolean overrideWFWP;
    protected Long soaSerial;
    protected ResourceRecordsType createResourceRecords;
    protected UpdateResourceRecordsType updateResourceRecords;
    protected UniqueResourceRecordsType deleteResourceRecords;
    protected String comments;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the viewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * Sets the value of the viewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewName(String value) {
        this.viewName = value;
    }

    /**
     * Gets the value of the overrideWFWP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideWFWP() {
        return overrideWFWP;
    }

    /**
     * Sets the value of the overrideWFWP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideWFWP(Boolean value) {
        this.overrideWFWP = value;
    }

    /**
     * Gets the value of the soaSerial property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSoaSerial() {
        return soaSerial;
    }

    /**
     * Sets the value of the soaSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSoaSerial(Long value) {
        this.soaSerial = value;
    }

    /**
     * Gets the value of the createResourceRecords property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceRecordsType }
     *     
     */
    public ResourceRecordsType getCreateResourceRecords() {
        return createResourceRecords;
    }

    /**
     * Sets the value of the createResourceRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceRecordsType }
     *     
     */
    public void setCreateResourceRecords(ResourceRecordsType value) {
        this.createResourceRecords = value;
    }

    /**
     * Gets the value of the updateResourceRecords property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateResourceRecordsType }
     *     
     */
    public UpdateResourceRecordsType getUpdateResourceRecords() {
        return updateResourceRecords;
    }

    /**
     * Sets the value of the updateResourceRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateResourceRecordsType }
     *     
     */
    public void setUpdateResourceRecords(UpdateResourceRecordsType value) {
        this.updateResourceRecords = value;
    }

    /**
     * Gets the value of the deleteResourceRecords property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueResourceRecordsType }
     *     
     */
    public UniqueResourceRecordsType getDeleteResourceRecords() {
        return deleteResourceRecords;
    }

    /**
     * Sets the value of the deleteResourceRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueResourceRecordsType }
     *     
     */
    public void setDeleteResourceRecords(UniqueResourceRecordsType value) {
        this.deleteResourceRecords = value;
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
