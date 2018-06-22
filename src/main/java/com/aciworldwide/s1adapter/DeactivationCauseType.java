
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeactivationCause_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeactivationCause_Type"&gt;
 *   &lt;restriction base="{http://aciworldwide.com/S1Adapter}ClosedEnum"&gt;
 *     &lt;enumeration value="Renew"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Misuse"/&gt;
 *     &lt;enumeration value="Lost"/&gt;
 *     &lt;enumeration value="Stolen"/&gt;
 *     &lt;enumeration value="Purge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeactivationCause_Type")
@XmlEnum
public enum DeactivationCauseType {

    @XmlEnumValue("Renew")
    RENEW("Renew"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Misuse")
    MISUSE("Misuse"),
    @XmlEnumValue("Lost")
    LOST("Lost"),
    @XmlEnumValue("Stolen")
    STOLEN("Stolen"),
    @XmlEnumValue("Purge")
    PURGE("Purge");
    private final String value;

    DeactivationCauseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeactivationCauseType fromValue(String v) {
        for (DeactivationCauseType c: DeactivationCauseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
