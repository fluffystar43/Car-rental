package registration;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Connection;
import service.endpoint.CarOperationImpl;
import operation.JDBCConnection;
import javax.xml.ws.Endpoint;
import service.endpoint.OrderOperationImpl;
import service.endpoint.ClientService;
import service.endpoint.SearchCriteriaService;

public class RunServer {

    public static void main(String[] args) {
        try {
            
            // Подключение к СУБД PostgreSQL и базе данных
            JDBCConnection conn = new JDBCConnection();
            Connection connection = conn.connect();
            
            // Создание экземпляров классов для регистрации
            CarOperationImpl car = new CarOperationImpl(connection);
            OrderOperationImpl order = new OrderOperationImpl(connection);
            
            // Создаем реестр
            Registry registry = LocateRegistry.createRegistry(1199);
            
            // Регистрация классов
            registry.bind("сarRMI", car);
            registry.bind("orderRMI", order);
            
            // SOAP API
            Endpoint.publish("http://localhost:8080/ws01/ClientService", 
                    new ClientService(connection));
            Endpoint.publish("http://localhost:8080/ws01/SearchCriteriaService", 
                    new SearchCriteriaService(connection));
            
            System.out.println("Сервер запущен.");
        } catch (AlreadyBoundException | RemoteException e) {
            System.out.println("Ошибка запуска сервера: " + e);
        }
    }
}
