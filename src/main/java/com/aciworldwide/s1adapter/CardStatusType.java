
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatus_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardStatus_Type"&gt;
 *   &lt;restriction base="{http://aciworldwide.com/S1Adapter}ClosedEnum"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="Misuse"/&gt;
 *     &lt;enumeration value="Lost"/&gt;
 *     &lt;enumeration value="Stolen"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardStatus_Type")
@XmlEnum
public enum CardStatusType {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Misuse")
    MISUSE("Misuse"),
    @XmlEnumValue("Lost")
    LOST("Lost"),
    @XmlEnumValue("Stolen")
    STOLEN("Stolen");
    private final String value;

    CardStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardStatusType fromValue(String v) {
        for (CardStatusType c: CardStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
