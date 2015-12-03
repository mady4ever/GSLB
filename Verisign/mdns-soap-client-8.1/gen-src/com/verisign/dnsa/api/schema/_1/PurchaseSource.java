
package com.verisign.dnsa.api.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Contract/Invoice"/>
 *     &lt;enumeration value="Storefront/Credit Card"/>
 *     &lt;enumeration value="Storefront/Invoice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurchaseSource")
@XmlEnum
public enum PurchaseSource {

    @XmlEnumValue("Contract/Invoice")
    CONTRACT_INVOICE("Contract/Invoice"),
    @XmlEnumValue("Storefront/Credit Card")
    STOREFRONT_CREDIT_CARD("Storefront/Credit Card"),
    @XmlEnumValue("Storefront/Invoice")
    STOREFRONT_INVOICE("Storefront/Invoice");
    private final String value;

    PurchaseSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseSource fromValue(String v) {
        for (PurchaseSource c: PurchaseSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
