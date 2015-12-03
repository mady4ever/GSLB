
package com.verisign.dnsa.api.schema._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGeoLocationViewSetsResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGeoLocationViewSetsResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:verisign:dnsa:api:schema:2}BaseDnsaResType">
 *       &lt;sequence>
 *         &lt;element name="geoLocationViewSet" type="{urn:com:verisign:dnsa:api:schema:2}GeoLocationViewSet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGeoLocationViewSetsResType", propOrder = {
    "geoLocationViewSet"
})
public class GetGeoLocationViewSetsResType
    extends BaseDnsaResType
{

    protected List<GeoLocationViewSet> geoLocationViewSet;

    /**
     * Gets the value of the geoLocationViewSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoLocationViewSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoLocationViewSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoLocationViewSet }
     * 
     * 
     */
    public List<GeoLocationViewSet> getGeoLocationViewSet() {
        if (geoLocationViewSet == null) {
            geoLocationViewSet = new ArrayList<GeoLocationViewSet>();
        }
        return this.geoLocationViewSet;
    }

}
