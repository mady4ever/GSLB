
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebParkingPageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebParkingPageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDER_CONSTRUCTION_PAGE"/>
 *     &lt;enumeration value="FOR_SALE_PAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebParkingPageType")
@XmlEnum
public enum WebParkingPageType {

    UNDER_CONSTRUCTION_PAGE,
    FOR_SALE_PAGE;

    public String value() {
        return name();
    }

    public static WebParkingPageType fromValue(String v) {
        return valueOf(v);
    }

}
