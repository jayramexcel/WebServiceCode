package com.excelonline.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-23T14:12:35.229-05:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "OrderProcessImplService", 
                  wsdlLocation = "http://localhost:8080/WSSecureUsernamePassword_Web/OrderProcess?wsdl",
                  targetNamespace = "http://ws.excelonline.com/") 
public class OrderProcessImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.excelonline.com/", "OrderProcessImplService");
    public final static QName OrderProcessImplPort = new QName("http://ws.excelonline.com/", "OrderProcessImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/WSSecureUsernamePassword_Web/OrderProcess?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderProcessImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/WSSecureUsernamePassword_Web/OrderProcess?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrderProcessImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderProcessImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderProcessImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OrderProcessImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OrderProcessImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OrderProcessImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns OrderProcess
     */
    @WebEndpoint(name = "OrderProcessImplPort")
    public OrderProcess getOrderProcessImplPort() {
        return super.getPort(OrderProcessImplPort, OrderProcess.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderProcess
     */
    @WebEndpoint(name = "OrderProcessImplPort")
    public OrderProcess getOrderProcessImplPort(WebServiceFeature... features) {
        return super.getPort(OrderProcessImplPort, OrderProcess.class, features);
    }

}
