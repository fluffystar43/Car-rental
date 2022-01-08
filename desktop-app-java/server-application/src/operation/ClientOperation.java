package operation;

import java.util.List;
import types.Client;

public interface ClientOperation {
    List<Client> getListOfClients();
    Long findClientByNumberPhone(String numberPhone);
    void updateClient(Client client);
    void blockClient(Long id);
}
