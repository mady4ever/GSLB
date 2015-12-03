
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPackageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerPackageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DNS Assurance"/>
 *     &lt;enumeration value="DNS Assurance Plus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerPackageType")
@XmlEnum
public enum CustomerPackageType {

    @XmlEnumValue("DNS Assurance")
    DNS_ASSURANCE("DNS Assurance"),
    @XmlEnumValue("DNS Assurance Plus")
    DNS_ASSURANCE_PLUS("DNS Assurance Plus");
    private final String value;

    CustomerPackageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerPackageType fromValue(String v) {
        for (CustomerPackageType c: CustomerPackageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
