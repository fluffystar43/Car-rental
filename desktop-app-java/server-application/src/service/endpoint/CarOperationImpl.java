package service.endpoint;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import operation.CarOperation;
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
            ResultSet result = statement.executeQuery("SELECT * FROM car");
            while (result.next()) {
                listCars.add(new Car(
                        result.getLong("id"),
                        result.getShort("brand_id"),
                        result.getInt("model_id"),
                        result.getShort("car_class_id"),
                        result.getShort("power_streering_id"),
                        result.getShort("engine_power"),
                        result.getShort("fuel_id"),
                        result.getInt("rental_price"),
                        result.getShort("drive_id"),
                        result.getShort("body_id"),
                        result.getShort("year_manufacture"),
                        result.getString("registration_number"),
                        result.getBoolean("is_rented"),
                        result.getBoolean("is_deleted"),
                        result.getString("vin")
                        
                ));
               
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
            Integer row = statement.executeUpdate(
                    "INSERT INTO tovar(brand_id, "
                    + "model_id, "
                    + "car_class_id, "
                    + "power_streering_id, "
                    + "engine_power, "
                    + "fuel_id, rental_price, "
                    + "drive_id, body_id, "
                    + "year_manufacture) "
                    + "VALUES ("
                    + car.getBrandId() + ", "
                    + car.getModelId() + ", "
                    + car.getCarClassId() + ", "
                    + car.getPowerStreeringId() + ", "
                    + car.getEnginePower() + ", "
                    + car.getFuelId() + ", "
                    + car.getRentalPrice() + ", "
                    + car.getDriveId() + ", "
                    + car.getYearManufacture()
                    + ")");
            System.out.println(row);
            System.out.println("Добавлен автомобиль: " + car.getBrandId());
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
