
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerWithServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerWithServicesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:1}CustomerInfo">
 *       &lt;sequence>
 *         &lt;element name="pkgInfo" type="{urn:com:verisign:dnsa:api:schema:1}CustomerPackage"/>
 *         &lt;element name="geoService" type="{urn:com:verisign:dnsa:api:schema:1}GeoLocationServiceType" minOccurs="0"/>
 *         &lt;element name="usageReportService" type="{urn:com:verisign:dnsa:api:schema:1}UsageReportServiceType" minOccurs="0"/>
 *         &lt;element name="signingService" type="{urn:com:verisign:dnsa:api:schema:1}SigningServiceType" minOccurs="0"/>
 *         &lt;element name="failOverService" type="{urn:com:verisign:dnsa:api:schema:1}FailoverServiceType" minOccurs="0"/>
 *         &lt;element name="zoneBackupService" type="{urn:com:verisign:dnsa:api:schema:1}ZoneBackupServiceType" minOccurs="0"/>
 *         &lt;element name="trafficManagementService" type="{urn:com:verisign:dnsa:api:schema:1}TrafficManagementServiceType" minOccurs="0"/>
 *         &lt;element name="loadBalanceService" type="{urn:com:verisign:dnsa:api:schema:1}LoadBalanceServiceType" minOccurs="0"/>
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
@XmlType(name = "CustomerWithServicesType", propOrder = {
    "pkgInfo",
    "geoService",
    "usageReportService",
    "signingService",
    "failOverService",
    "zoneBackupService",
    "trafficManagementService",
    "loadBalanceService"
})
public class CustomerWithServicesType
    extends CustomerInfo
{

    @XmlElement(required = true)
    protected CustomerPackage pkgInfo;
    protected GeoLocationServiceType geoService;
    protected UsageReportServiceType usageReportService;
    protected SigningServiceType signingService;
    protected FailoverServiceType failOverService;
    protected ZoneBackupServiceType zoneBackupService;
    protected TrafficManagementServiceType trafficManagementService;
    protected LoadBalanceServiceType loadBalanceService;

    /**
     * Gets the value of the pkgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPackage }
     *     
     */
    public CustomerPackage getPkgInfo() {
        return pkgInfo;
    }

    /**
     * Sets the value of the pkgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPackage }
     *     
     */
    public void setPkgInfo(CustomerPackage value) {
        this.pkgInfo = value;
    }

    /**
     * Gets the value of the geoService property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationServiceType }
     *     
     */
    public GeoLocationServiceType getGeoService() {
        return geoService;
    }

    /**
     * Sets the value of the geoService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationServiceType }
     *     
     */
    public void setGeoService(GeoLocationServiceType value) {
        this.geoService = value;
    }

    /**
     * Gets the value of the usageReportService property.
     * 
     * @return
     *     possible object is
     *     {@link UsageReportServiceType }
     *     
     */
    public UsageReportServiceType getUsageReportService() {
        return usageReportService;
    }

    /**
     * Sets the value of the usageReportService property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageReportServiceType }
     *     
     */
    public void setUsageReportService(UsageReportServiceType value) {
        this.usageReportService = value;
    }

    /**
     * Gets the value of the signingService property.
     * 
     * @return
     *     possible object is
     *     {@link SigningServiceType }
     *     
     */
    public SigningServiceType getSigningService() {
        return signingService;
    }

    /**
     * Sets the value of the signingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningServiceType }
     *     
     */
    public void setSigningService(SigningServiceType value) {
        this.signingService = value;
    }

    /**
     * Gets the value of the failOverService property.
     * 
     * @return
     *     possible object is
     *     {@link FailoverServiceType }
     *     
     */
    public FailoverServiceType getFailOverService() {
        return failOverService;
    }

    /**
     * Sets the value of the failOverService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailoverServiceType }
     *     
     */
    public void setFailOverService(FailoverServiceType value) {
        this.failOverService = value;
    }

    /**
     * Gets the value of the zoneBackupService property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneBackupServiceType }
     *     
     */
    public ZoneBackupServiceType getZoneBackupService() {
        return zoneBackupService;
    }

    /**
     * Sets the value of the zoneBackupService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneBackupServiceType }
     *     
     */
    public void setZoneBackupService(ZoneBackupServiceType value) {
        this.zoneBackupService = value;
    }

    /**
     * Gets the value of the trafficManagementService property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficManagementServiceType }
     *     
     */
    public TrafficManagementServiceType getTrafficManagementService() {
        return trafficManagementService;
    }

    /**
     * Sets the value of the trafficManagementService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficManagementServiceType }
     *     
     */
    public void setTrafficManagementService(TrafficManagementServiceType value) {
        this.trafficManagementService = value;
    }

    /**
     * Gets the value of the loadBalanceService property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBalanceServiceType }
     *     
     */
    public LoadBalanceServiceType getLoadBalanceService() {
        return loadBalanceService;
    }

    /**
     * Sets the value of the loadBalanceService property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBalanceServiceType }
     *     
     */
    public void setLoadBalanceService(LoadBalanceServiceType value) {
        this.loadBalanceService = value;
    }

}
