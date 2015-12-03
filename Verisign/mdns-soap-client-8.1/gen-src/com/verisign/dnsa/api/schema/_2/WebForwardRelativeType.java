
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webForwardRelativeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="webForwardRelativeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PATH"/>
 *     &lt;enumeration value="PARAMETER"/>
 *     &lt;enumeration value="PATH &amp; PARAMETER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "webForwardRelativeType")
@XmlEnum
public enum WebForwardRelativeType {

    PATH("PATH"),
    PARAMETER("PARAMETER"),
    @XmlEnumValue("PATH & PARAMETER")
    PATH_PARAMETER("PATH & PARAMETER");
    private final String value;

    WebForwardRelativeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebForwardRelativeType fromValue(String v) {
        for (WebForwardRelativeType c: WebForwardRelativeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
