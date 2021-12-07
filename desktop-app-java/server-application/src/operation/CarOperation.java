package operation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import types.Car;

public interface CarOperation extends Remote {
    List<Car> getListOfCars() throws RemoteException;
    void addNewCar(Car car) throws RemoteException;    
}