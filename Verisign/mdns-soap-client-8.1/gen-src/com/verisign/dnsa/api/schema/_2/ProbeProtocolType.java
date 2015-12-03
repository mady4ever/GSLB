
package com.verisign.dnsa.api.schema._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for probeProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="probeProtocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HTTP"/>
 *     &lt;enumeration value="HTTPS"/>
 *     &lt;enumeration value="SMTP"/>
 *     &lt;enumeration value="DNS"/>
 *     &lt;enumeration value="PING"/>
 *     &lt;enumeration value="TCP"/>
 *     &lt;enumeration value="TCPHALFOPEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "probeProtocolType")
@XmlEnum
public enum ProbeProtocolType {

    HTTP,
    HTTPS,
    SMTP,
    DNS,
    PING,
    TCP,
    TCPHALFOPEN;

    public String value() {
        return name();
    }

    public static ProbeProtocolType fromValue(String v) {
        return valueOf(v);
    }

}
