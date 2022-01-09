
package service.endpoint;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import types.Client;
import types.Order;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchCriteriaService", targetNamespace = "http://endpoint.service/")
@XmlSeeAlso({
    service.endpoint.ObjectFactory.class,
    types.ObjectFactory.class
})
public interface SearchCriteriaService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListSecondCriteria", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListSecondCriteria")
    @ResponseWrapper(localName = "getListSecondCriteriaResponse", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListSecondCriteriaResponse")
    @Action(input = "http://endpoint.service/SearchCriteriaService/getListSecondCriteriaRequest", output = "http://endpoint.service/SearchCriteriaService/getListSecondCriteriaResponse")
    public List<Object> getListSecondCriteria(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListAvailableCars", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListAvailableCars")
    @ResponseWrapper(localName = "getListAvailableCarsResponse", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListAvailableCarsResponse")
    @Action(input = "http://endpoint.service/SearchCriteriaService/getListAvailableCarsRequest", output = "http://endpoint.service/SearchCriteriaService/getListAvailableCarsResponse")
    public List<Object> getListAvailableCars(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Boolean arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListRentedCars", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListRentedCars")
    @ResponseWrapper(localName = "getListRentedCarsResponse", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListRentedCarsResponse")
    @Action(input = "http://endpoint.service/SearchCriteriaService/getListRentedCarsRequest", output = "http://endpoint.service/SearchCriteriaService/getListRentedCarsResponse")
    public List<Object> getListRentedCars(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<types.Client>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListClients", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListClients")
    @ResponseWrapper(localName = "getListClientsResponse", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListClientsResponse")
    @Action(input = "http://endpoint.service/SearchCriteriaService/getListClientsRequest", output = "http://endpoint.service/SearchCriteriaService/getListClientsResponse")
    public List<Client> getListClients(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<types.Order>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListOrders", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListOrders")
    @ResponseWrapper(localName = "getListOrdersResponse", targetNamespace = "http://endpoint.service/", className = "service.endpoint.GetListOrdersResponse")
    @Action(input = "http://endpoint.service/SearchCriteriaService/getListOrdersRequest", output = "http://endpoint.service/SearchCriteriaService/getListOrdersResponse")
    public List<Order> getListOrders(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
