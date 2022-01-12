package service.endpoint;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
        SearchCriteriaService.connection = connection;
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
    public List getListAvailableCars(String criteriaFirst, String criteriaSecond, Boolean isDependsRental) throws RemoteException {

        List listCars = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT brand.name, "
                    + "model.name, "
                    + "gear_box.name, drive.name, color.name, car.rental_price, car.registration_number "
                    + "FROM brand, model, gear_box, drive, color, car, car_exterior "
                    + "WHERE car.brand_id = brand.id AND car.model_id = model.id AND "
                    + "car.gear_box_id = gear_box.id AND "
                    + "car.drive_id = drive.id AND car_exterior.color_id = color.id AND car.is_deleted = false ";

            if (isDependsRental == true) {
                sql += "AND car.is_rented = false ";
            }
            if (criteriaFirst != null) {

                switch (criteriaFirst) {
                    case ("Бренд"):
                        sql += "AND brand.name = '" + criteriaSecond + "'";
                        break;
                    case ("Модель"):
                        sql += "AND model.name = '" + criteriaSecond + "'";
                        break;
                    case ("Коробка передач"):
                        sql += "AND gear_box.name = '" + criteriaSecond + "'";
                        break;
                    case ("Привод"):
                        sql += "AND drive.name = '" + criteriaSecond + "'";
                        break;
                    case ("Цвет"):
                        sql += "AND color.name = '" + criteriaSecond + "'";
                        break;
                    case ("Цена, руб/сут."):
                        sql += "AND car.rental_price = '" + criteriaSecond + "'";
                        break;
                    case ("Номер"):
                        sql += "AND car.registration_number = '" + criteriaSecond + "'";
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
            if (isDependsRental == true) {
                System.out.println("Получен список доступных автомобилей");
            } else {
                System.out.println("Получен список автомобилей");
            }
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
                    + "model.name, car.registration_number,  client.second_name || ' ' || client.first_name || ' ' || client.middle_name, ordertable.start_date, ordertable.end_date "
                    + "FROM brand, model, car, client, \"order\" as ordertable "
                    + "WHERE car.brand_id = brand.id AND car.model_id = model.id AND car.id = ordertable.car_id AND client.id = ordertable.client_id AND car.is_rented = true AND ordertable.is_closed = false";
            if (criteriaFirst != null) {

                switch (criteriaFirst) {
                    case ("Бренд"):
                        sql += "AND brand.name = '" + criteriaSecond + "'";
                        break;
                    case ("Модель"):
                        sql += "AND model.name = '" + criteriaSecond + "'";
                        break;
                    case ("Номер"):
                        sql += "AND registration_number = '" + criteriaSecond + "'";
                        break;
                    case ("Клиент"):
                        sql += "AND client.second_name || ' ' || client.first_name || ' ' || client.middle_name = '" + criteriaSecond + "'";
                        break;
                    case ("Дата аренды"):
                        sql += "AND ordertable.start_date = '" + criteriaSecond + "'";
                        break;
                    case ("Дата возврата"):
                        sql += "AND ordertable.end_date = '" + criteriaSecond + "'";
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
    public List getListCarsByRegistrationNumber(String registrationNumber) throws RemoteException {
        List listCars = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT brand.name, "
                    + "model.name, "
                    + "car.registration_number "
                    + "FROM brand, model, car "
                    + "WHERE car.brand_id = brand.id AND car.model_id = model.id AND "
                    + "car.registration_number = '" + registrationNumber + "' AND "
                    + "car.is_deleted = false AND car.is_rented = false";

            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                listCars.add(result.getObject(1));
                listCars.add(result.getObject(2));
                listCars.add(result.getObject(3));
            }
            System.out.println("Получен список автомобилей при оформлении заказа");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return listCars;
    }

    @WebMethod()
    @Override
    public void AddOrder(List infoAboutOrder, Client client, Boolean isNewClient, List fullNameAndPhone) {
        List listID = new ArrayList<>();

        if (isNewClient == true) {
            //  Добавление клиента
            try {
                PreparedStatement statement = connection.prepareStatement("INSERT INTO client ("
                        + "login, "
                        + "hash_password, "
                        + "second_name, "
                        + "first_name, "
                        + "middle_name, "
                        + "date_birthday, "
                        + "phone_number, "
                        + "passport_data, "
                        + "drivers_license, "
                        + "email, "
                        + "is_blocked) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, false)"
                );
                statement.setString(1, "login");
                statement.setString(2, "password");
                statement.setString(3, client.getSecondName());
                statement.setString(4, client.getFirstName());
                statement.setString(5, client.getMiddleName());
                statement.setDate(6, new java.sql.Date(client.getDateBirthday().getTime()));
                statement.setString(7, client.getPhoneNumber());
                statement.setString(8, client.getPassportData());
                statement.setString(9, client.getPassportData());
                statement.setString(10, client.getEmail());

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Клиент добавлен!");
                }

            } catch (SQLException ex) {
                Logger.getLogger(SearchCriteriaService.class.getName()).log(Level.SEVERE, null, ex);
            }

            //  Добавление заказа
            //  Поиск id клиента и автомобиля
            try {
                Statement statement = connection.createStatement();
                String sql = "SELECT "
                        + "client.id, "
                        + "car.id "
                        + "FROM client, car "
                        + "WHERE client.passport_data = '"
                        + client.getPassportData()
                        + "' AND car.registration_number = '"
                        + infoAboutOrder.get(0).toString() + "'";
                ResultSet result = statement.executeQuery(sql);
                while (result.next()) {
                    listID.add(result.getObject(1));
                    listID.add(result.getObject(2));
                }
                System.out.println("Получен список ID");

            } catch (SQLException ex) {
                Logger.getLogger(SearchCriteriaService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //  Поиск id клиента и автомобиля
            try {
                Statement statement = connection.createStatement();
                String sql = "SELECT "
                        + "client.id, "
                        + "car.id "
                        + "FROM client, car "
                        + "WHERE client.phone_number = '"
                        + fullNameAndPhone.get(1)
                        + "' AND client.second_name || ' ' || client.first_name || ' ' || client.middle_name = '" + fullNameAndPhone.get(0)
                        + "' AND car.registration_number = '"
                        + infoAboutOrder.get(0).toString() + "'";
                ResultSet result = statement.executeQuery(sql);
                while (result.next()) {
                    listID.add(result.getObject(1));
                    listID.add(result.getObject(2));
                }
                System.out.println("Получен список ID");

            } catch (SQLException ex) {
                Logger.getLogger(SearchCriteriaService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //  Добавление заказа в базу данных
        try {
            String sql = String.format("INSERT INTO \"order\" (client_id, car_id, start_date, end_date, total_cost, is_closed) "
                    + "VALUES (%d, %d, '%s', '%s', %d, %b)",
                    (Long) listID.get(0),
                    (Long) listID.get(1),
                    infoAboutOrder.get(1),
                    infoAboutOrder.get(2),
                    infoAboutOrder.get(3),
                    false
            );
            
            PreparedStatement statement = connection.prepareStatement(sql);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Заказ добавлен!");
            }

            statement = connection.prepareStatement("UPDATE car SET is_rented = true "
                    + "WHERE id = ?");
            statement.setLong(1, (Long) listID.get(1));

            rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Автомобиль арендован!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(SearchCriteriaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Client> getListClients(String criteria) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Order> getListOrders(String criteria) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
