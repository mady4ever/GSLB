
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="READ-ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerStatusType")
@XmlEnum
public enum CustomerStatusType {

    ACTIVE("ACTIVE"),
    @XmlEnumValue("READ-ONLY")
    READ_ONLY("READ-ONLY");
    private final String value;

    CustomerStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerStatusType fromValue(String v) {
        for (CustomerStatusType c: CustomerStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
