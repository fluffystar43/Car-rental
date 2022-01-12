package operation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface OrderOperation extends Remote {

    List getListOrders() throws RemoteException;

    void closeOrder(String fullName, String carName) throws RemoteException;
}
