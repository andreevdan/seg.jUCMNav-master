//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.19 at 07:21:12 PM EDT 
//


package seg.jUCMNav.importexport.z151.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualitativeLabel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualitativeLabel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Denied"/>
 *     &lt;enumeration value="WeaklyDenied"/>
 *     &lt;enumeration value="WeaklySatisfied"/>
 *     &lt;enumeration value="Satisfied"/>
 *     &lt;enumeration value="Conflict"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QualitativeLabel")
@XmlEnum
public enum QualitativeLabel {

    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("WeaklyDenied")
    WEAKLY_DENIED("WeaklyDenied"),
    @XmlEnumValue("WeaklySatisfied")
    WEAKLY_SATISFIED("WeaklySatisfied"),
    @XmlEnumValue("Satisfied")
    SATISFIED("Satisfied"),
    @XmlEnumValue("Conflict")
    CONFLICT("Conflict"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    QualitativeLabel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualitativeLabel fromValue(String v) {
        for (QualitativeLabel c: QualitativeLabel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
