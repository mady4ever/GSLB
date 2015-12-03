
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPackageSiteOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerPackageSiteOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="OldExpanded"/>
 *     &lt;enumeration value="Expanded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerPackageSiteOption")
@XmlEnum
public enum CustomerPackageSiteOption {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("OldExpanded")
    OLD_EXPANDED("OldExpanded"),
    @XmlEnumValue("Expanded")
    EXPANDED("Expanded");
    private final String value;

    CustomerPackageSiteOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerPackageSiteOption fromValue(String v) {
        for (CustomerPackageSiteOption c: CustomerPackageSiteOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
