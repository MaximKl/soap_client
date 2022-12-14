
package ua.myclient.taxi.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "TaxiService", targetNamespace = "http://service.taxi.myClient.ua/", wsdlLocation = "http://localhost:9090/OnLineTaxi?wsdl")
public class TaxiService
    extends Service
{

    private final static URL TAXISERVICE_WSDL_LOCATION;
    private final static WebServiceException TAXISERVICE_EXCEPTION;
    private final static QName TAXISERVICE_QNAME = new QName("http://service.taxi.myClient.ua/", "TaxiService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/OnLineTaxi?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TAXISERVICE_WSDL_LOCATION = url;
        TAXISERVICE_EXCEPTION = e;
    }

    public TaxiService() {
        super(__getWsdlLocation(), TAXISERVICE_QNAME);
    }

    public TaxiService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TAXISERVICE_QNAME, features);
    }

    public TaxiService(URL wsdlLocation) {
        super(wsdlLocation, TAXISERVICE_QNAME);
    }

    public TaxiService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TAXISERVICE_QNAME, features);
    }

    public TaxiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaxiService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Taxi
     */
    @WebEndpoint(name = "TaxiPort")
    public Taxi getTaxiPort() {
        return super.getPort(new QName("http://service.taxi.myClient.ua/", "TaxiPort"), Taxi.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Taxi
     */
    @WebEndpoint(name = "TaxiPort")
    public Taxi getTaxiPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.taxi.myClient.ua/", "TaxiPort"), Taxi.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TAXISERVICE_EXCEPTION!= null) {
            throw TAXISERVICE_EXCEPTION;
        }
        return TAXISERVICE_WSDL_LOCATION;
    }

}
