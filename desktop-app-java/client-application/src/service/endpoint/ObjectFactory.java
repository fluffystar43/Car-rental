
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

    private final static QName _GetListOfClientsResponse_QNAME = new QName("http://endpoint.service/", "getListOfClientsResponse");
    private final static QName _UpdateClient_QNAME = new QName("http://endpoint.service/", "updateClient");
    private final static QName _UpdateClientResponse_QNAME = new QName("http://endpoint.service/", "updateClientResponse");
    private final static QName _GetListOfClients_QNAME = new QName("http://endpoint.service/", "getListOfClients");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListOfClientsResponse }
     * 
     */
    public GetListOfClientsResponse createGetListOfClientsResponse() {
        return new GetListOfClientsResponse();
    }

    /**
     * Create an instance of {@link UpdateClientResponse }
     * 
     */
    public UpdateClientResponse createUpdateClientResponse() {
        return new UpdateClientResponse();
    }

    /**
     * Create an instance of {@link UpdateClient }
     * 
     */
    public UpdateClient createUpdateClient() {
        return new UpdateClient();
    }

    /**
     * Create an instance of {@link GetListOfClients }
     * 
     */
    public GetListOfClients createGetListOfClients() {
        return new GetListOfClients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfClientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListOfClientsResponse")
    public JAXBElement<GetListOfClientsResponse> createGetListOfClientsResponse(GetListOfClientsResponse value) {
        return new JAXBElement<GetListOfClientsResponse>(_GetListOfClientsResponse_QNAME, GetListOfClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "updateClient")
    public JAXBElement<UpdateClient> createUpdateClient(UpdateClient value) {
        return new JAXBElement<UpdateClient>(_UpdateClient_QNAME, UpdateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "updateClientResponse")
    public JAXBElement<UpdateClientResponse> createUpdateClientResponse(UpdateClientResponse value) {
        return new JAXBElement<UpdateClientResponse>(_UpdateClientResponse_QNAME, UpdateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfClients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getListOfClients")
    public JAXBElement<GetListOfClients> createGetListOfClients(GetListOfClients value) {
        return new JAXBElement<GetListOfClients>(_GetListOfClients_QNAME, GetListOfClients.class, null, value);
    }

}
