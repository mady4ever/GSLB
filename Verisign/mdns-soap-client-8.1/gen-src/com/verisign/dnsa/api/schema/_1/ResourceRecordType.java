
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceRecordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceRecordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="PTR"/>
 *     &lt;enumeration value="AAAA"/>
 *     &lt;enumeration value="TXT"/>
 *     &lt;enumeration value="CNAME"/>
 *     &lt;enumeration value="NS"/>
 *     &lt;enumeration value="NAPTR"/>
 *     &lt;enumeration value="SRV"/>
 *     &lt;enumeration value="NSEC"/>
 *     &lt;enumeration value="NSEC3"/>
 *     &lt;enumeration value="NSEC3PARAM"/>
 *     &lt;enumeration value="DS"/>
 *     &lt;enumeration value="RRSIG"/>
 *     &lt;enumeration value="DNSKEY"/>
 *     &lt;enumeration value="TLSA"/>
 *     &lt;enumeration value="SMIMEA"/>
 *     &lt;enumeration value="CAA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceRecordType")
@XmlEnum
public enum ResourceRecordType {

    A("A"),
    MX("MX"),
    PTR("PTR"),
    AAAA("AAAA"),
    TXT("TXT"),
    CNAME("CNAME"),
    NS("NS"),
    NAPTR("NAPTR"),
    SRV("SRV"),
    NSEC("NSEC"),
    @XmlEnumValue("NSEC3")
    NSEC_3("NSEC3"),
    @XmlEnumValue("NSEC3PARAM")
    NSEC_3_PARAM("NSEC3PARAM"),
    DS("DS"),
    RRSIG("RRSIG"),
    DNSKEY("DNSKEY"),
    TLSA("TLSA"),
    SMIMEA("SMIMEA"),
    CAA("CAA");
    private final String value;

    ResourceRecordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceRecordType fromValue(String v) {
        for (ResourceRecordType c: ResourceRecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
