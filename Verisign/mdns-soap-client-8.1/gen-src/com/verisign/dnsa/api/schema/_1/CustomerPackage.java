
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPackage">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="packageType" type="{urn:com:verisign:dnsa:api:schema:1}CustomerPackageType" minOccurs="0"/>
 *         &lt;element name="domainLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="domainCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rrLimit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="queryLimit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="siteOption" type="{urn:com:verisign:dnsa:api:schema:1}CustomerPackageSiteOption" minOccurs="0"/>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pkgComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CustomerPackage", propOrder = {
    "packageType",
    "domainLimit",
    "domainCount",
    "rrLimit",
    "queryLimit",
    "siteOption",
    "beginDate",
    "expirationDate",
    "pkgComment"
})
public class CustomerPackage
    extends BaseExtensibleType
{

    protected CustomerPackageType packageType;
    protected int domainLimit;
    protected Integer domainCount;
    protected long rrLimit;
    protected long queryLimit;
    protected CustomerPackageSiteOption siteOption;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected String pkgComment;

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPackageType }
     *     
     */
    public CustomerPackageType getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPackageType }
     *     
     */
    public void setPackageType(CustomerPackageType value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the domainLimit property.
     * 
     */
    public int getDomainLimit() {
        return domainLimit;
    }

    /**
     * Sets the value of the domainLimit property.
     * 
     */
    public void setDomainLimit(int value) {
        this.domainLimit = value;
    }

    /**
     * Gets the value of the domainCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDomainCount() {
        return domainCount;
    }

    /**
     * Sets the value of the domainCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDomainCount(Integer value) {
        this.domainCount = value;
    }

    /**
     * Gets the value of the rrLimit property.
     * 
     */
    public long getRrLimit() {
        return rrLimit;
    }

    /**
     * Sets the value of the rrLimit property.
     * 
     */
    public void setRrLimit(long value) {
        this.rrLimit = value;
    }

    /**
     * Gets the value of the queryLimit property.
     * 
     */
    public long getQueryLimit() {
        return queryLimit;
    }

    /**
     * Sets the value of the queryLimit property.
     * 
     */
    public void setQueryLimit(long value) {
        this.queryLimit = value;
    }

    /**
     * Gets the value of the siteOption property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPackageSiteOption }
     *     
     */
    public CustomerPackageSiteOption getSiteOption() {
        return siteOption;
    }

    /**
     * Sets the value of the siteOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPackageSiteOption }
     *     
     */
    public void setSiteOption(CustomerPackageSiteOption value) {
        this.siteOption = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the pkgComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgComment() {
        return pkgComment;
    }

    /**
     * Sets the value of the pkgComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgComment(String value) {
        this.pkgComment = value;
    }

}
