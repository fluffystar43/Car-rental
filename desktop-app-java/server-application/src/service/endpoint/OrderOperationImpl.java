package service.endpoint;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import operation.OrderOperation;

public class OrderOperationImpl extends UnicastRemoteObject implements OrderOperation {

    private static Connection connection;

    public OrderOperationImpl(Connection connection) throws RemoteException {
        this.connection = connection;
    }

    @Override
    public List getListOrders() throws RemoteException {
        List listCars = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT client.second_name, "
                    + "client.first_name, "
                    + "client.middle_name, "
                    + "car.registration_number, ordertable.start_date, "
                    + "ordertable.end_date, "
                    + "ordertable.total_cost "
                    + "FROM client, \"order\" as ordertable, car "
                    + "WHERE ordertable.client_id = client.id "
                    + "AND ordertable.car_id = car.id "
                    + "AND car.is_rented = true "
                    + "AND car.is_deleted = false "
                    + "AND is_closed = false";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                listCars.add(result.getObject(1));
                listCars.add(result.getObject(2));
                listCars.add(result.getObject(3));
                listCars.add(result.getObject(4));
                listCars.add(result.getObject(5));
                listCars.add(result.getObject(6));
                listCars.add(result.getObject(7));
            }
            System.out.println("Получен список заказов");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return listCars;
    }

    @Override
    public void closeOrder(String fullName, String registrationNumber) throws RemoteException {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE car SET is_rented = false WHERE registration_number = ?");
            statement.setString(1, registrationNumber);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Автомобиль возвращен!");
            }
            String SQL = "UPDATE \"order\" "
                    + "SET is_closed = ? "
                    + "WHERE client_id IN "
                    + "(SELECT client.id from client "
                    + "WHERE client.second_name || ' ' || client.first_name || ' ' || client.middle_name = '" + fullName + "')";
            statement = connection.prepareStatement(SQL);
            statement.setBoolean(1, true);

            rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Заказ завершен!");
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
    }

}
