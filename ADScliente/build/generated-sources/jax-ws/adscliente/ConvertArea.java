
package adscliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConvertArea complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConvertArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fromArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertArea", propOrder = {
    "areaValue",
    "fromArea",
    "toArea"
})
public class ConvertArea {

    protected Double areaValue;
    protected String fromArea;
    protected String toArea;

    /**
     * Obtiene el valor de la propiedad areaValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAreaValue() {
        return areaValue;
    }

    /**
     * Define el valor de la propiedad areaValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAreaValue(Double value) {
        this.areaValue = value;
    }

    /**
     * Obtiene el valor de la propiedad fromArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromArea() {
        return fromArea;
    }

    /**
     * Define el valor de la propiedad fromArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromArea(String value) {
        this.fromArea = value;
    }

    /**
     * Obtiene el valor de la propiedad toArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToArea() {
        return toArea;
    }

    /**
     * Define el valor de la propiedad toArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToArea(String value) {
        this.toArea = value;
    }

}
