
package service.endpoint;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SearchCriteriaServiceService", targetNamespace = "http://endpoint.service/", wsdlLocation = "http://localhost:8080/ws01/SearchCriteriaService?wsdl")
public class SearchCriteriaServiceService
    extends Service
{

    private final static URL SEARCHCRITERIASERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException SEARCHCRITERIASERVICESERVICE_EXCEPTION;
    private final static QName SEARCHCRITERIASERVICESERVICE_QNAME = new QName("http://endpoint.service/", "SearchCriteriaServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws01/SearchCriteriaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SEARCHCRITERIASERVICESERVICE_WSDL_LOCATION = url;
        SEARCHCRITERIASERVICESERVICE_EXCEPTION = e;
    }

    public SearchCriteriaServiceService() {
        super(__getWsdlLocation(), SEARCHCRITERIASERVICESERVICE_QNAME);
    }

    public SearchCriteriaServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SEARCHCRITERIASERVICESERVICE_QNAME, features);
    }

    public SearchCriteriaServiceService(URL wsdlLocation) {
        super(wsdlLocation, SEARCHCRITERIASERVICESERVICE_QNAME);
    }

    public SearchCriteriaServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SEARCHCRITERIASERVICESERVICE_QNAME, features);
    }

    public SearchCriteriaServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SearchCriteriaServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SearchCriteriaService
     */
    @WebEndpoint(name = "SearchCriteriaServicePort")
    public SearchCriteriaService getSearchCriteriaServicePort() {
        return super.getPort(new QName("http://endpoint.service/", "SearchCriteriaServicePort"), SearchCriteriaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SearchCriteriaService
     */
    @WebEndpoint(name = "SearchCriteriaServicePort")
    public SearchCriteriaService getSearchCriteriaServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint.service/", "SearchCriteriaServicePort"), SearchCriteriaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SEARCHCRITERIASERVICESERVICE_EXCEPTION!= null) {
            throw SEARCHCRITERIASERVICESERVICE_EXCEPTION;
        }
        return SEARCHCRITERIASERVICESERVICE_WSDL_LOCATION;
    }

}
