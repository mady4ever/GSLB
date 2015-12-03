
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for probeStatusOverrideType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="probeStatusOverrideType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default Probe"/>
 *     &lt;enumeration value="Force Pass"/>
 *     &lt;enumeration value="Force Fail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "probeStatusOverrideType")
@XmlEnum
public enum ProbeStatusOverrideType {

    @XmlEnumValue("Default Probe")
    DEFAULT_PROBE("Default Probe"),
    @XmlEnumValue("Force Pass")
    FORCE_PASS("Force Pass"),
    @XmlEnumValue("Force Fail")
    FORCE_FAIL("Force Fail");
    private final String value;

    ProbeStatusOverrideType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProbeStatusOverrideType fromValue(String v) {
        for (ProbeStatusOverrideType c: ProbeStatusOverrideType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
