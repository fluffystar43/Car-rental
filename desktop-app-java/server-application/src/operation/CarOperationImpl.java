package operation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import types.Car;

public class CarOperationImpl extends UnicastRemoteObject implements CarOperation {

    private static Connection connection;

    public CarOperationImpl(Connection connection) throws RemoteException {
        this.connection = connection;
    }

    @Override
    public List<Car> getListOfCars() throws RemoteException {
        List listCars = new ArrayList<Car>();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * from сar");
            while (result.next()) {
                //listCars.add(new Car(result.getLong(1), result.getString(2), result.getInt(3), result.getInt(4)));
                //result.get
            }
            System.out.println("Получен список автомобилей");
        } catch (SQLException e) {
            e.getMessage();
        }

        return listCars;
    }

    @Override
    public void addNewCar(Car car) throws RemoteException {
        try {
            Statement statement = connection.createStatement();
            //Integer row = statement.executeUpdate("INSERT INTO tovar(name, kol, price) VALUES ('" + car.getName() + "', " + tovar.getKol() + ", " + tovar.getPrice() + ")");
            System.out.println("Добавлен товар: " + car.getBrandId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
