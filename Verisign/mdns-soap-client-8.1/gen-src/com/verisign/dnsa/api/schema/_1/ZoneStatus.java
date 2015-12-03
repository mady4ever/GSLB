
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZoneStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INCOMPLETE"/>
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="TERMINATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZoneStatus")
@XmlEnum
public enum ZoneStatus {

    ACTIVE,
    INCOMPLETE,
    HOLD,
    TERMINATED;

    public String value() {
        return name();
    }

    public static ZoneStatus fromValue(String v) {
        return valueOf(v);
    }

}
