
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

    private final static QName _GetListAvailableCarsResponse_QNAME = new QName("http://endpoint.service/", "getListAvailableCarsResponse");
    private final static QName _GetListRentedCars_QNAME = new QName("http://endpoint.service/", "getListRentedCars");
    private final static QName _GetListRentedCarsResponse_QNAME = new QName("http://endpoint.service/", "getListRentedCarsResponse");
    private final static QName _AddOrder_QNAME = new QName("http://endpoint.service/", "AddOrder");
    private final static QName _GetListAvailableCars_QNAME = new QName("http://endpoint.service/", "getListAvailableCars");
    private final static QName _GetListCarsByRegistrationNumberResponse_QNAME = new QName("http://endpoint.service/", "getListCarsByRegistrationNumberResponse");
    private final static QName _AddOrderResponse_QNAME = new QName("http://endpoint.service/", "AddOrderResponse");
    private final static QName _GetListOrdersResponse_QNAME = new QName("http://endpoint.service/", "getListOrdersResponse");
    private final static QName _GetListClientsResponse_QNAME = new QName("http://endpoint.service/", "getListClientsResponse");
    private final static QName _GetListClients_QNAME = new QName("http://endpoint.service/", "getListClients");
    private final static QName _GetListCarsByRegistrationNumber_QNAME = new QName("http://endpoint.service/", "getListCarsByRegistrationNumber");
    private final static QName _GetListOrders_QNAME = new QName("http://endpoint.service/", "getListOrders");
    private final static QName _GetListSecondCriteriaResponse_QNAME = new QName("http://endpoint.service/", "getListSecondCriteriaResponse");
    private final static QName _GetListSecondCriteria_QNAME = new QName("http://endpoint.service/", "getListSecondCriteria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListAvailableCarsResponse }
     * 
     */
    public GetListAvailableCarsResponse createGetListAvailableCarsResponse() {
        return new GetListAvailableCarsResponse();
    }

    /**
     * Create an instance of {@link GetListRentedCars }
     * 
     */
    public GetListRentedCars createGetListRentedCars() {
        return new GetListRentedCars();
    }

    /**
     * Create an instance of {@link GetListRentedCarsResponse }
     * 
     */
    public GetListRentedCarsResponse createGetListRentedCarsResponse() {
        return new GetListRentedCarsResponse();
    }

    /**
     * Create an instance of {@link AddOrder }
     * 
     */
    public AddOrder createAddOrder() {
        return new AddOrder();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     * 
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }

    /**
     * Create an instance of {@link GetListOrdersResponse }
     * 
     */
    public GetListOrdersResponse createGetListOrdersResponse() {
        return new GetListOrdersResponse();
    }

    /**
     * Create an instance of {@link GetListAvailableCars }
     * 
     */
    public GetListAvailableCars createGetListAvailableCars() {
        return new GetListAvailableCars();
    }

    /**
     * Create an instance of {@link GetListCarsByRegistrationNumberResponse }
     * 
     */
    public GetListCarsByRegistrationNumberResponse createGetListCarsByRegistrationNumberResponse() {
        return new GetListCarsByRegistrationNumberResponse();
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
     * Create an instance of {@link GetListCarsByRegistrationNumber }
     * 
     */
    public GetListCarsByRegistrationNumber createGetListCarsByRegistrationNumber() {
        return new GetListCarsByRegistrationNumber();
    }

    /**
     * Create an instance of {@link GetListOrders }
     * 
     */
    public GetListOrders createGetListOrders() {
        return new GetListOrders();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListAvailableCarsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListAvailableCarsResponse")
    public JAXBElement<GetListAvailableCarsResponse> createGetListAvailableCarsResponse(GetListAvailableCarsResponse value) {
        return new JAXBElement<GetListAvailableCarsResponse>(_GetListAvailableCarsResponse_QNAME, GetListAvailableCarsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListRentedCars }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListRentedCars")
    public JAXBElement<GetListRentedCars> createGetListRentedCars(GetListRentedCars value) {
        return new JAXBElement<GetListRentedCars>(_GetListRentedCars_QNAME, GetListRentedCars.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListRentedCarsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListRentedCarsResponse")
    public JAXBElement<GetListRentedCarsResponse> createGetListRentedCarsResponse(GetListRentedCarsResponse value) {
        return new JAXBElement<GetListRentedCarsResponse>(_GetListRentedCarsResponse_QNAME, GetListRentedCarsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "AddOrder")
    public JAXBElement<AddOrder> createAddOrder(AddOrder value) {
        return new JAXBElement<AddOrder>(_AddOrder_QNAME, AddOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListAvailableCars }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListAvailableCars")
    public JAXBElement<GetListAvailableCars> createGetListAvailableCars(GetListAvailableCars value) {
        return new JAXBElement<GetListAvailableCars>(_GetListAvailableCars_QNAME, GetListAvailableCars.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCarsByRegistrationNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListCarsByRegistrationNumberResponse")
    public JAXBElement<GetListCarsByRegistrationNumberResponse> createGetListCarsByRegistrationNumberResponse(GetListCarsByRegistrationNumberResponse value) {
        return new JAXBElement<GetListCarsByRegistrationNumberResponse>(_GetListCarsByRegistrationNumberResponse_QNAME, GetListCarsByRegistrationNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "AddOrderResponse")
    public JAXBElement<AddOrderResponse> createAddOrderResponse(AddOrderResponse value) {
        return new JAXBElement<AddOrderResponse>(_AddOrderResponse_QNAME, AddOrderResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCarsByRegistrationNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListCarsByRegistrationNumber")
    public JAXBElement<GetListCarsByRegistrationNumber> createGetListCarsByRegistrationNumber(GetListCarsByRegistrationNumber value) {
        return new JAXBElement<GetListCarsByRegistrationNumber>(_GetListCarsByRegistrationNumber_QNAME, GetListCarsByRegistrationNumber.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListSecondCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListSecondCriteria")
    public JAXBElement<GetListSecondCriteria> createGetListSecondCriteria(GetListSecondCriteria value) {
        return new JAXBElement<GetListSecondCriteria>(_GetListSecondCriteria_QNAME, GetListSecondCriteria.class, null, value);
    }

}
