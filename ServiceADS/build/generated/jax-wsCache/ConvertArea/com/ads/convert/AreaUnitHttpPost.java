
package com.ads.convert;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AreaUnitHttpPost", targetNamespace = "http://www.webserviceX.NET/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AreaUnitHttpPost {


    /**
     * 
     * @param toAreaUnit
     * @param fromAreaUnit
     * @param areaValue
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ChangeAreaUnit")
    @WebResult(name = "double", targetNamespace = "http://www.webserviceX.NET/", partName = "Body")
    public double changeAreaUnit(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "AreaValue")
        String areaValue,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "fromAreaUnit")
        String fromAreaUnit,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "toAreaUnit")
        String toAreaUnit);

}
