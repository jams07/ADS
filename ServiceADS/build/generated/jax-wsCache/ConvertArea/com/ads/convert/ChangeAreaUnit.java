
package com.ads.convert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromAreaUnit" type="{http://www.webserviceX.NET/}Areas"/>
 *         &lt;element name="toAreaUnit" type="{http://www.webserviceX.NET/}Areas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "areaValue",
    "fromAreaUnit",
    "toAreaUnit"
})
@XmlRootElement(name = "ChangeAreaUnit")
public class ChangeAreaUnit {

    @XmlElement(name = "AreaValue")
    protected double areaValue;
    @XmlElement(required = true)
    protected Areas fromAreaUnit;
    @XmlElement(required = true)
    protected Areas toAreaUnit;

    /**
     * Obtiene el valor de la propiedad areaValue.
     * 
     */
    public double getAreaValue() {
        return areaValue;
    }

    /**
     * Define el valor de la propiedad areaValue.
     * 
     */
    public void setAreaValue(double value) {
        this.areaValue = value;
    }

    /**
     * Obtiene el valor de la propiedad fromAreaUnit.
     * 
     * @return
     *     possible object is
     *     {@link Areas }
     *     
     */
    public Areas getFromAreaUnit() {
        return fromAreaUnit;
    }

    /**
     * Define el valor de la propiedad fromAreaUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Areas }
     *     
     */
    public void setFromAreaUnit(Areas value) {
        this.fromAreaUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad toAreaUnit.
     * 
     * @return
     *     possible object is
     *     {@link Areas }
     *     
     */
    public Areas getToAreaUnit() {
        return toAreaUnit;
    }

    /**
     * Define el valor de la propiedad toAreaUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Areas }
     *     
     */
    public void setToAreaUnit(Areas value) {
        this.toAreaUnit = value;
    }

}
