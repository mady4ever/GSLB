
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLoadBalanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLoadBalanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}LoadBalanceType">
 *       &lt;sequence>
 *         &lt;element name="lBRRDirective" type="{urn:com:verisign:dnsa:api:schema:2}LBRRDirective" maxOccurs="unbounded"/>
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
@XmlType(name = "UpdateLoadBalanceType", propOrder = {
    "lbrrDirective"
})
public class UpdateLoadBalanceType
    extends LoadBalanceType
{

    @XmlElement(name = "lBRRDirective", required = true)
    protected List<LBRRDirective> lbrrDirective;

    /**
     * Gets the value of the lbrrDirective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lbrrDirective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLBRRDirective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LBRRDirective }
     * 
     * 
     */
    public List<LBRRDirective> getLBRRDirective() {
        if (lbrrDirective == null) {
            lbrrDirective = new ArrayList<LBRRDirective>();
        }
        return this.lbrrDirective;
    }

}
