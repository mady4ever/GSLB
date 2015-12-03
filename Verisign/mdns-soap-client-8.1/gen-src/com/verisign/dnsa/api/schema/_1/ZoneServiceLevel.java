
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneServiceLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZoneServiceLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPLETE"/>
 *     &lt;enumeration value="LIMITED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZoneServiceLevel")
@XmlEnum
public enum ZoneServiceLevel {

    COMPLETE,
    LIMITED;

    public String value() {
        return name();
    }

    public static ZoneServiceLevel fromValue(String v) {
        return valueOf(v);
    }

}
