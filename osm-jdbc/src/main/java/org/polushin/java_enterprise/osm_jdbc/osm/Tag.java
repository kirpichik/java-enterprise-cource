//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.04 at 04:38:46 PM NOVT 
//


package org.polushin.java_enterprise.osm_jdbc.osm;


import javax.xml.bind.annotation.*;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="k" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "tag")
public class Tag {

    @XmlAttribute(name = "k")
    protected String k;
    @XmlAttribute(name = "v")
    protected String v;

    /**
     * Gets the value of the k property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setK(final String value) {
        this.k = value;
    }

    /**
     * Gets the value of the v property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getV() {
        return v;
    }

    /**
     * Sets the value of the v property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setV(final String value) {
        this.v = value;
    }

}
