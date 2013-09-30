
package adscliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceServiceADS", targetNamespace = "http://ads.com/", wsdlLocation = "http://localhost:8080/ServiceADS/ServiceServiceADS?wsdl")
public class ServiceServiceADS_Service
    extends Service
{

    private final static URL SERVICESERVICEADS_WSDL_LOCATION;
    private final static WebServiceException SERVICESERVICEADS_EXCEPTION;
    private final static QName SERVICESERVICEADS_QNAME = new QName("http://ads.com/", "ServiceServiceADS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServiceADS/ServiceServiceADS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICESERVICEADS_WSDL_LOCATION = url;
        SERVICESERVICEADS_EXCEPTION = e;
    }

    public ServiceServiceADS_Service() {
        super(__getWsdlLocation(), SERVICESERVICEADS_QNAME);
    }

    public ServiceServiceADS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICESERVICEADS_QNAME, features);
    }

    public ServiceServiceADS_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICESERVICEADS_QNAME);
    }

    public ServiceServiceADS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICESERVICEADS_QNAME, features);
    }

    public ServiceServiceADS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceServiceADS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceServiceADS
     */
    @WebEndpoint(name = "ServiceServiceADSPort")
    public ServiceServiceADS getServiceServiceADSPort() {
        return super.getPort(new QName("http://ads.com/", "ServiceServiceADSPort"), ServiceServiceADS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceServiceADS
     */
    @WebEndpoint(name = "ServiceServiceADSPort")
    public ServiceServiceADS getServiceServiceADSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ads.com/", "ServiceServiceADSPort"), ServiceServiceADS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICESERVICEADS_EXCEPTION!= null) {
            throw SERVICESERVICEADS_EXCEPTION;
        }
        return SERVICESERVICEADS_WSDL_LOCATION;
    }

}