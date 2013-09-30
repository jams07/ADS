/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ads;

import com.ads.convert.AreaUnit;
import com.ads.convert.AreaUnitSoap;
import com.ads.convert.Areas;

/**
 *
 * @author JESUSALBERTO
 */
public class ADSws {
  
      public static double ChangeArea (Double value, String from, String to){ 
        
        try{
            //Servicio
            AreaUnit serviceArea = new AreaUnit();
            //Port a partir del service
         AreaUnitSoap portSoap = serviceArea.getAreaUnitSoap();
            //Metodo del servicio
            return portSoap.changeAreaUnit(value, Areas.fromValue(from), Areas.fromValue(to));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
}
