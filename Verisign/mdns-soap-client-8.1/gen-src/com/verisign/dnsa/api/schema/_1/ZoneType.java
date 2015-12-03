
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DNS Hosting"/>
 *     &lt;enumeration value="Backup DNS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZoneType")
@XmlEnum
public enum ZoneType {

    @XmlEnumValue("DNS Hosting")
    DNS_HOSTING("DNS Hosting"),
    @XmlEnumValue("Backup DNS")
    BACKUP_DNS("Backup DNS");
    private final String value;

    ZoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZoneType fromValue(String v) {
        for (ZoneType c: ZoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
