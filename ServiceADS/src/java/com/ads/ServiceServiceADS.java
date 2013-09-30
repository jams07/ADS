/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ads;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author JESUSALBERTO
 */
@WebService(serviceName = "ServiceServiceADS")
public class ServiceServiceADS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ConvertArea")
    public Double ConvertArea(@WebParam(name = "areaValue") Double areaValue,
                              @WebParam(name = "fromArea") String fromArea,
                              @WebParam(name = "toArea") String toArea) {
        
        return ADSws.ChangeArea(areaValue, fromArea, toArea);
    }
}
