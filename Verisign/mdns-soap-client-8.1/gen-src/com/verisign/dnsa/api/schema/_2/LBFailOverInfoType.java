
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LBFailOverInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LBFailOverInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}TMProbeInfoType">
 *       &lt;sequence>
 *         &lt;element name="autoFailOver" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoFailBack" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxNoOfAnswersToPublish" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aggregated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "LBFailOverInfoType", propOrder = {
    "autoFailOver",
    "autoFailBack",
    "maxNoOfAnswersToPublish",
    "aggregated"
})
public class LBFailOverInfoType
    extends TMProbeInfoType
{

    @XmlElement(defaultValue = "true")
    protected boolean autoFailOver;
    @XmlElement(defaultValue = "true")
    protected boolean autoFailBack;
    protected int maxNoOfAnswersToPublish;
    @XmlElement(defaultValue = "true")
    protected Boolean aggregated;

    /**
     * Gets the value of the autoFailOver property.
     * 
     */
    public boolean isAutoFailOver() {
        return autoFailOver;
    }

    /**
     * Sets the value of the autoFailOver property.
     * 
     */
    public void setAutoFailOver(boolean value) {
        this.autoFailOver = value;
    }

    /**
     * Gets the value of the autoFailBack property.
     * 
     */
    public boolean isAutoFailBack() {
        return autoFailBack;
    }

    /**
     * Sets the value of the autoFailBack property.
     * 
     */
    public void setAutoFailBack(boolean value) {
        this.autoFailBack = value;
    }

    /**
     * Gets the value of the maxNoOfAnswersToPublish property.
     * 
     */
    public int getMaxNoOfAnswersToPublish() {
        return maxNoOfAnswersToPublish;
    }

    /**
     * Sets the value of the maxNoOfAnswersToPublish property.
     * 
     */
    public void setMaxNoOfAnswersToPublish(int value) {
        this.maxNoOfAnswersToPublish = value;
    }

    /**
     * Gets the value of the aggregated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAggregated() {
        return aggregated;
    }

    /**
     * Sets the value of the aggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAggregated(Boolean value) {
        this.aggregated = value;
    }

}
