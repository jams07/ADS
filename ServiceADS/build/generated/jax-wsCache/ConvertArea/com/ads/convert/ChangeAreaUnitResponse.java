
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
 *         &lt;element name="ChangeAreaUnitResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "changeAreaUnitResult"
})
@XmlRootElement(name = "ChangeAreaUnitResponse")
public class ChangeAreaUnitResponse {

    @XmlElement(name = "ChangeAreaUnitResult")
    protected double changeAreaUnitResult;

    /**
     * Obtiene el valor de la propiedad changeAreaUnitResult.
     * 
     */
    public double getChangeAreaUnitResult() {
        return changeAreaUnitResult;
    }

    /**
     * Define el valor de la propiedad changeAreaUnitResult.
     * 
     */
    public void setChangeAreaUnitResult(double value) {
        this.changeAreaUnitResult = value;
    }

}
