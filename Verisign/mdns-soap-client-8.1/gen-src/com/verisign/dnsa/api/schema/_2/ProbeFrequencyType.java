
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for probeFrequencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="probeFrequencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *     &lt;enumeration value="6"/>
 *     &lt;enumeration value="7"/>
 *     &lt;enumeration value="8"/>
 *     &lt;enumeration value="9"/>
 *     &lt;enumeration value="10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "probeFrequencyType")
@XmlEnum(Long.class)
public enum ProbeFrequencyType {

    @XmlEnumValue("0")
    ZERO(0L),
    @XmlEnumValue("1")
    ONE(1L),
    @XmlEnumValue("2")
    TWO(2L),
    @XmlEnumValue("3")
    THREE(3L),
    @XmlEnumValue("4")
    FOUR(4L),
    @XmlEnumValue("5")
    FIVE(5L),
    @XmlEnumValue("6")
    SIX(6L),
    @XmlEnumValue("7")
    SEVEN(7L),
    @XmlEnumValue("8")
    EIGHT(8L),
    @XmlEnumValue("9")
    NINE(9L),
    @XmlEnumValue("10")
    TEN(10L);
    private final long value;

    ProbeFrequencyType(long v) {
        value = v;
    }

    public long value() {
        return value;
    }

    public static ProbeFrequencyType fromValue(long v) {
        for (ProbeFrequencyType c: ProbeFrequencyType.values()) {
            if (c.value == v) {
                return c;
            }
        }
        throw new IllegalArgumentException(String.valueOf(v));
    }

}
