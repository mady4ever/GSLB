
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailoverServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailoverServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}BaseExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="purchaseSource" type="{urn:com:verisign:dnsa:api:schema:1}PurchaseSource" minOccurs="0"/>
 *         &lt;element name="rrSetLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notificationEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="backupNotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "FailoverServiceType", propOrder = {
    "purchaseSource",
    "rrSetLimit",
    "notificationEmail",
    "backupNotificationEmail"
})
public class FailoverServiceType
    extends BaseExtensibleType
{

    protected PurchaseSource purchaseSource;
    protected int rrSetLimit;
    @XmlElement(required = true)
    protected String notificationEmail;
    protected String backupNotificationEmail;

    /**
     * Gets the value of the purchaseSource property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseSource }
     *     
     */
    public PurchaseSource getPurchaseSource() {
        return purchaseSource;
    }

    /**
     * Sets the value of the purchaseSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseSource }
     *     
     */
    public void setPurchaseSource(PurchaseSource value) {
        this.purchaseSource = value;
    }

    /**
     * Gets the value of the rrSetLimit property.
     * 
     */
    public int getRrSetLimit() {
        return rrSetLimit;
    }

    /**
     * Sets the value of the rrSetLimit property.
     * 
     */
    public void setRrSetLimit(int value) {
        this.rrSetLimit = value;
    }

    /**
     * Gets the value of the notificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    /**
     * Sets the value of the notificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmail(String value) {
        this.notificationEmail = value;
    }

    /**
     * Gets the value of the backupNotificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupNotificationEmail() {
        return backupNotificationEmail;
    }

    /**
     * Sets the value of the backupNotificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupNotificationEmail(String value) {
        this.backupNotificationEmail = value;
    }

}
