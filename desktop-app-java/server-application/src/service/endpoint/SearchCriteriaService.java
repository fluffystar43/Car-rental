package service.endpoint;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebService;
import operation.SeachCriteriaOperation;
import types.Car;
import types.Client;
import types.Order;

@WebService
public class SearchCriteriaService implements SeachCriteriaOperation {

    private static Connection connection;

    public SearchCriteriaService(Connection connection) {
        this.connection = connection;
    }

    @WebMethod()
    @Override
    public List getListSecondCriteria(String criteria) throws RemoteException {

        CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> ListCriteriaAsync(criteria));

        try {
            List result = (List) completableFuture.get();
            return result;
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(ClientService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private List ListCriteriaAsync(String criteria) {

        List listCriteria = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = null;
            switch (criteria) {
                case ("Бренд"):
                    sql = "SELECT id, name from brand";
                    break;
                case ("Марка"):
                    sql = "SELECT id, name from model";
                    break;
                case ("Коробка передач"):
                    sql = "SELECT id, name from gear_box";
                    break;
                case ("Привод"):
                    sql = "SELECT id, name from drive";
                    break;
                case ("Цвет"):
                    sql = "SELECT id, name from color";
                    break;
                case ("Цена, руб/сут."):
                    sql = "SELECT id, rental_price from car";
                    break;
                case ("Номер"):
                    sql = "SELECT id, registration_number from car";
                    break;
            }
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                listCriteria.add(result.getInt("id"));
                listCriteria.add(result.getObject(2));
            }
            System.out.println("Получен список клиентов");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return listCriteria;
    }

    @Override
    public List<Car> getListCars(String criteria) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Client> getListClients(String criteria) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Order> getListOrders(String criteria) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
