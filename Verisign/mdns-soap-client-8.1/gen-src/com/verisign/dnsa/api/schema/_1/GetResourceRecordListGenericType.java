
package com.verisign.dnsa.api.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResourceRecordListGenericType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResourceRecordListGenericType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="viewName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resourceRecordType" type="{urn:com:verisign:dnsa:api:schema:1}ResourceRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ttlFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ttlTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultAnswersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="listPagingInfo2" type="{urn:com:verisign:dnsa:api:schema:1}ListPagingInfo2" minOccurs="0"/>
 *         &lt;element name="orderBy" type="{urn:com:verisign:dnsa:api:schema:1}ResourceRecordFieldType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GetResourceRecordListGenericType", propOrder = {
    "domainName",
    "viewName",
    "resourceRecordType",
    "ttlFrom",
    "ttlTo",
    "owner",
    "rdata",
    "defaultAnswersOnly",
    "listPagingInfo2",
    "orderBy"
})
public class GetResourceRecordListGenericType
    extends BaseExtensibleType
{

    protected List<String> domainName;
    protected List<String> viewName;
    protected List<ResourceRecordType> resourceRecordType;
    protected Integer ttlFrom;
    protected Integer ttlTo;
    protected String owner;
    protected String rdata;
    protected Boolean defaultAnswersOnly;
    protected ListPagingInfo2 listPagingInfo2;
    protected List<ResourceRecordFieldType> orderBy;

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
     * Gets the value of the viewName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getViewName() {
        if (viewName == null) {
            viewName = new ArrayList<String>();
        }
        return this.viewName;
    }

    /**
     * Gets the value of the resourceRecordType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceRecordType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceRecordType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceRecordType }
     * 
     * 
     */
    public List<ResourceRecordType> getResourceRecordType() {
        if (resourceRecordType == null) {
            resourceRecordType = new ArrayList<ResourceRecordType>();
        }
        return this.resourceRecordType;
    }

    /**
     * Gets the value of the ttlFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTtlFrom() {
        return ttlFrom;
    }

    /**
     * Sets the value of the ttlFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTtlFrom(Integer value) {
        this.ttlFrom = value;
    }

    /**
     * Gets the value of the ttlTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTtlTo() {
        return ttlTo;
    }

    /**
     * Sets the value of the ttlTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTtlTo(Integer value) {
        this.ttlTo = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the rdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRdata() {
        return rdata;
    }

    /**
     * Sets the value of the rdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRdata(String value) {
        this.rdata = value;
    }

    /**
     * Gets the value of the defaultAnswersOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultAnswersOnly() {
        return defaultAnswersOnly;
    }

    /**
     * Sets the value of the defaultAnswersOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultAnswersOnly(Boolean value) {
        this.defaultAnswersOnly = value;
    }

    /**
     * Gets the value of the listPagingInfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link ListPagingInfo2 }
     *     
     */
    public ListPagingInfo2 getListPagingInfo2() {
        return listPagingInfo2;
    }

    /**
     * Sets the value of the listPagingInfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPagingInfo2 }
     *     
     */
    public void setListPagingInfo2(ListPagingInfo2 value) {
        this.listPagingInfo2 = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceRecordFieldType }
     * 
     * 
     */
    public List<ResourceRecordFieldType> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<ResourceRecordFieldType>();
        }
        return this.orderBy;
    }

}
