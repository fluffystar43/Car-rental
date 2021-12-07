package registration;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Connection;
import operation.CarOperationImpl;
import operation.JDBCConnection;

public class RunServer {

    public static void main(String[] args) {
        try {
            
            // Подключение к СУБД PostgreSQL и базе данных
            JDBCConnection conn = new JDBCConnection();
            Connection connection = conn.connect();
            
            // Создание экземпляров классов для регистрации
            CarOperationImpl car = new CarOperationImpl(connection);
            
            // Создаем реестр
            Registry registry = LocateRegistry.createRegistry(1198);
            
            // Регистрация классов
            registry.bind("сarImp", car);
            
            System.out.println("Сервер запущен.");
        } catch (AlreadyBoundException | RemoteException e) {
            System.out.println("Ошибка запуска сервера: " + e);
        }
    }
}
