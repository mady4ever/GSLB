
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WF"/>
 *     &lt;enumeration value="WP"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="LBFO"/>
 *     &lt;enumeration value="Scripting"/>
 *     &lt;enumeration value="ScriptingProbe"/>
 *     &lt;enumeration value="FO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceType")
@XmlEnum
public enum ServiceType {

    WF("WF"),
    WP("WP"),
    LB("LB"),
    LBFO("LBFO"),
    @XmlEnumValue("Scripting")
    SCRIPTING("Scripting"),
    @XmlEnumValue("ScriptingProbe")
    SCRIPTING_PROBE("ScriptingProbe"),
    FO("FO");
    private final String value;

    ServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceType fromValue(String v) {
        for (ServiceType c: ServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
