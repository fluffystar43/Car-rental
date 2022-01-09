package operation;

import java.rmi.RemoteException;
import java.util.List;
import types.Car;
import types.Client;
import types.Order;

public interface SeachCriteriaOperation {
    // Получение списка второго критерия выбора
    List getListSecondCriteria(String criteria) throws RemoteException;
    
    // Списки данных по определенному критерию
    List getListAvailableCars(String criteriaFirst, String criteriaSecond, Boolean isDependsRental) throws RemoteException;
    List getListRentedCars(String criteriaFirst, String criteriaSecond) throws RemoteException;
    
    List<Client> getListClients(String criteria) throws RemoteException;
    List<Order> getListOrders(String criteria) throws RemoteException;  
    
    List getListCarsByRegistrationNumber(String registrationNumber) throws RemoteException;
    void AddOrder(List infoAboutOrder, Client client, Boolean isNewClient);
}
