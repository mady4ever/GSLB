
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountZoneStatsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountZoneStatsType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="dateRange">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="listPagingInfo" type="{urn:com:verisign:dnsa:api:schema:1}ListPagingInfo" minOccurs="0"/>
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
@XmlType(name = "GetAccountZoneStatsType", propOrder = {
    "month",
    "dateRange",
    "listPagingInfo"
})
public class GetAccountZoneStatsType
    extends BaseExtensibleType
{

    protected String month;
    protected GetAccountZoneStatsType.DateRange dateRange;
    protected ListPagingInfo listPagingInfo;

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountZoneStatsType.DateRange }
     *     
     */
    public GetAccountZoneStatsType.DateRange getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountZoneStatsType.DateRange }
     *     
     */
    public void setDateRange(GetAccountZoneStatsType.DateRange value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the listPagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ListPagingInfo }
     *     
     */
    public ListPagingInfo getListPagingInfo() {
        return listPagingInfo;
    }

    /**
     * Sets the value of the listPagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPagingInfo }
     *     
     */
    public void setListPagingInfo(ListPagingInfo value) {
        this.listPagingInfo = value;
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
     *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "fromDate",
        "toDate"
    })
    public static class DateRange {

        @XmlElement(required = true)
        protected String fromDate;
        @XmlElement(required = true)
        protected String toDate;

        /**
         * Gets the value of the fromDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromDate() {
            return fromDate;
        }

        /**
         * Sets the value of the fromDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromDate(String value) {
            this.fromDate = value;
        }

        /**
         * Gets the value of the toDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToDate() {
            return toDate;
        }

        /**
         * Sets the value of the toDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToDate(String value) {
            this.toDate = value;
        }

    }

}
