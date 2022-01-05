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
                    sql = "SELECT name from brand";
                    break;
                case ("Модель"):
                    sql = "SELECT name from model";
                    break;
                case ("Коробка передач"):
                    sql = "SELECT name from gear_box";
                    break;
                case ("Привод"):
                    sql = "SELECT name from drive";
                    break;
                case ("Цвет"):
                    sql = "SELECT name from color";
                    break;
                case ("Цена, руб/сут."):
                    sql = "SELECT rental_price from car";
                    break;
                case ("Номер"):
                    sql = "SELECT registration_number from car";
                    break;
                case ("Клиент"):
                    sql = "SELECT DISTINCT second_name, first_name, middle_name from client";
                    break;
                case ("Дата аренды"):
                    sql = "SELECT start_date from \"order\"";
                    break;
                case ("Дата возврата"):
                    sql = "SELECT end_date from \"order\"";
                    break;
            }
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                if (!"Клиент".equals(criteria)) {
                    listCriteria.add(result.getObject(1));
                } else {
                    listCriteria.add(result.getObject(1) + " " + result.getObject(2) + " " + result.getObject(3));
                }
            }
            System.out.println("Получен список данных второго критерия");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return listCriteria;
    }

    @WebMethod()
    @Override
    public List getListAvailableCars(String criteriaFirst, String criteriaSecond) throws RemoteException {

        List listCars = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT brand.name, "
                    + "model.name, "
                    + "gear_box.name, drive.name, color.name, car.rental_price, car.registration_number "
                    + "FROM brand, model, gear_box, drive, color, car, car_exterior "
                    + "WHERE car.brand_id = brand.id AND car.model_id = model.id AND "
                    + "car.gear_box_id = gear_box.id AND "
                    + "car.drive_id = drive.id AND car_exterior.color_id = color.id";
            if (criteriaFirst != null) {

                switch (criteriaFirst) {
                    case ("Бренд"):
                        sql += " AND brand.name = '" + criteriaSecond + "'";
                        break;
                    case ("Модель"):
                        sql += " AND model.name = '" + criteriaSecond + "'";
                        break;
                    case ("Коробка передач"):
                        sql += " AND gear_box.name = '" + criteriaSecond + "'";
                        break;
                    case ("Привод"):
                        sql += " AND drive.name = '" + criteriaSecond + "'";
                        break;
                    case ("Цвет"):
                        sql += " AND color.name = '" + criteriaSecond + "'";
                        break;
                    case ("Цена, руб/сут."):
                        sql += " AND car.rental_price = '" + criteriaSecond + "'";
                        break;
                    case ("Номер"):
                        sql += " AND car.registration_number = '" + criteriaSecond + "'";
                        break;
                }
            }
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
            System.out.println("Получен список доступных автомобилей");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return listCars;
    }

    @WebMethod()
    @Override
    public List getListRentedCars(String criteriaFirst, String criteriaSecond) throws RemoteException {
        List listCars = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT brand.name, "
                    + "model.name, car.registration_number,  client.second_name || ' ' || client.first_name || ' ' || client.middle_name AS client_full_name, ordertable.start_date, ordertable.end_date "
                    + "FROM brand, model, car, client, \"order\" as ordertable "
                    + "WHERE car.brand_id = brand.id AND car.model_id = model.id AND car.id = ordertable.car_id AND client.id = ordertable.client_id AND car.is_rented = true";
            if (criteriaFirst != null) {

                switch (criteriaFirst) {
                    case ("Бренд"):
                        sql += " AND brand.name = '" + criteriaSecond + "'";
                        break;
                    case ("Модель"):
                        sql += " AND model.name = '" + criteriaSecond + "'";
                        break;
                    case ("Номер"):
                        sql += " AND registration_number = '" + criteriaSecond + "'";
                        break;
                    case ("Клиент"):
                        sql += " AND client.full_name = '" + criteriaSecond + "'";
                        break;
                    case ("Дата аренды"):
                        sql += " AND ordertable.start_date LIKE '" + criteriaSecond + "'";
                        break;
                    case ("Дата возврата"):
                        sql += " AND ordertable.end_date LIKE '" + criteriaSecond + "'";
                        break;
                }
            }
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                listCars.add(result.getObject(1));
                listCars.add(result.getObject(2));
                listCars.add(result.getObject(3));
                listCars.add(result.getObject(4));
                listCars.add(result.getObject(5));
                listCars.add(result.getObject(6));
            }
            System.out.println("Получен список арендованных автомобилей");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return listCars;
    }

    @WebMethod()
    @Override
    public List<Client> getListClients(String criteria) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @WebMethod()
    @Override
    public List<Order> getListOrders(String criteria) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
