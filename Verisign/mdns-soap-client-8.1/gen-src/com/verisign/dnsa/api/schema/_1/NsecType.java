
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NsecType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NsecType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NSEC"/>
 *     &lt;enumeration value="NSEC3_NO_OPT_OUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NsecType")
@XmlEnum
public enum NsecType {

    NSEC("NSEC"),
    @XmlEnumValue("NSEC3_NO_OPT_OUT")
    NSEC_3_NO_OPT_OUT("NSEC3_NO_OPT_OUT");
    private final String value;

    NsecType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NsecType fromValue(String v) {
        for (NsecType c: NsecType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
