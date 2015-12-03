
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceRecordFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceRecordFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OWNER"/>
 *     &lt;enumeration value="RDATA"/>
 *     &lt;enumeration value="TTL"/>
 *     &lt;enumeration value="ZONENAME"/>
 *     &lt;enumeration value="VIEWNAME"/>
 *     &lt;enumeration value="RTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceRecordFieldType")
@XmlEnum
public enum ResourceRecordFieldType {

    OWNER,
    RDATA,
    TTL,
    ZONENAME,
    VIEWNAME,
    RTYPE;

    public String value() {
        return name();
    }

    public static ResourceRecordFieldType fromValue(String v) {
        return valueOf(v);
    }

}
