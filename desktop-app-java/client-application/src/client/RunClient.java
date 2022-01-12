package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import operation.CarOperation;
import types.Car;

public class RunClient {

    public static void main(String[] args) {
        try {
            /**
             * вызывается метод lookup класса Naming для получения удаленной
             * ссылки на удаленный объект Car с заданным URL.
             */
            CarOperation car = (CarOperation) Naming.lookup("//localhost:1199/сarRMI");
            doVivod(car.getListOfCars());

            System.out.println("Завершено");
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.out.println("Message Client exception: " + e.getMessage());
        }
    }

    public static void doVivod(List<Car> listCars) {
        int i = 0;
        System.out.println("#\tБренд\tМодель\tКласс\tУдален");
        for (Car car : listCars) {
            System.out.println(++i + "\t" + car.getBrandId() + "  \t"
                    + car.getModelId() + "\t"
                    + car.getCarClassId() + " \t"
                    + car.getIsDeleted());
        }
        System.out.println();
        System.out.println();
    }

}
