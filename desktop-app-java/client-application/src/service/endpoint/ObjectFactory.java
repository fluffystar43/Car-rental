
package service.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetListCars_QNAME = new QName("http://endpoint.service/", "getListCars");
    private final static QName _GetListOrders_QNAME = new QName("http://endpoint.service/", "getListOrders");
    private final static QName _GetListSecondCriteriaResponse_QNAME = new QName("http://endpoint.service/", "getListSecondCriteriaResponse");
    private final static QName _GetListOrdersResponse_QNAME = new QName("http://endpoint.service/", "getListOrdersResponse");
    private final static QName _GetListCarsResponse_QNAME = new QName("http://endpoint.service/", "getListCarsResponse");
    private final static QName _GetListClientsResponse_QNAME = new QName("http://endpoint.service/", "getListClientsResponse");
    private final static QName _GetListClients_QNAME = new QName("http://endpoint.service/", "getListClients");
    private final static QName _GetListSecondCriteria_QNAME = new QName("http://endpoint.service/", "getListSecondCriteria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListCars }
     * 
     */
    public GetListCars createGetListCars() {
        return new GetListCars();
    }

    /**
     * Create an instance of {@link GetListOrders }
     * 
     */
    public GetListOrders createGetListOrders() {
        return new GetListOrders();
    }

    /**
     * Create an instance of {@link GetListOrdersResponse }
     * 
     */
    public GetListOrdersResponse createGetListOrdersResponse() {
        return new GetListOrdersResponse();
    }

    /**
     * Create an instance of {@link GetListSecondCriteriaResponse }
     * 
     */
    public GetListSecondCriteriaResponse createGetListSecondCriteriaResponse() {
        return new GetListSecondCriteriaResponse();
    }

    /**
     * Create an instance of {@link GetListSecondCriteria }
     * 
     */
    public GetListSecondCriteria createGetListSecondCriteria() {
        return new GetListSecondCriteria();
    }

    /**
     * Create an instance of {@link GetListCarsResponse }
     * 
     */
    public GetListCarsResponse createGetListCarsResponse() {
        return new GetListCarsResponse();
    }

    /**
     * Create an instance of {@link GetListClientsResponse }
     * 
     */
    public GetListClientsResponse createGetListClientsResponse() {
        return new GetListClientsResponse();
    }

    /**
     * Create an instance of {@link GetListClients }
     * 
     */
    public GetListClients createGetListClients() {
        return new GetListClients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCars }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListCars")
    public JAXBElement<GetListCars> createGetListCars(GetListCars value) {
        return new JAXBElement<GetListCars>(_GetListCars_QNAME, GetListCars.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListOrders")
    public JAXBElement<GetListOrders> createGetListOrders(GetListOrders value) {
        return new JAXBElement<GetListOrders>(_GetListOrders_QNAME, GetListOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListSecondCriteriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListSecondCriteriaResponse")
    public JAXBElement<GetListSecondCriteriaResponse> createGetListSecondCriteriaResponse(GetListSecondCriteriaResponse value) {
        return new JAXBElement<GetListSecondCriteriaResponse>(_GetListSecondCriteriaResponse_QNAME, GetListSecondCriteriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListOrdersResponse")
    public JAXBElement<GetListOrdersResponse> createGetListOrdersResponse(GetListOrdersResponse value) {
        return new JAXBElement<GetListOrdersResponse>(_GetListOrdersResponse_QNAME, GetListOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCarsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListCarsResponse")
    public JAXBElement<GetListCarsResponse> createGetListCarsResponse(GetListCarsResponse value) {
        return new JAXBElement<GetListCarsResponse>(_GetListCarsResponse_QNAME, GetListCarsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListClientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListClientsResponse")
    public JAXBElement<GetListClientsResponse> createGetListClientsResponse(GetListClientsResponse value) {
        return new JAXBElement<GetListClientsResponse>(_GetListClientsResponse_QNAME, GetListClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListClients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListClients")
    public JAXBElement<GetListClients> createGetListClients(GetListClients value) {
        return new JAXBElement<GetListClients>(_GetListClients_QNAME, GetListClients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListSecondCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListSecondCriteria")
    public JAXBElement<GetListSecondCriteria> createGetListSecondCriteria(GetListSecondCriteria value) {
        return new JAXBElement<GetListSecondCriteria>(_GetListSecondCriteria_QNAME, GetListSecondCriteria.class, null, value);
    }

}
