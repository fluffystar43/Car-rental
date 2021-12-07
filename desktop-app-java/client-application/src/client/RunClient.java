package client;

import java.rmi.Naming;
import types.Car;

public class RunClient {

    public static void main(String[] args) {
        try {
            /**
             * вызывается метод lookup класса Naming для получения удаленной ссылки 
             * на удаленный объект Car с заданным URL.  
            */
            Car car = (Car) Naming.lookup("//localhost:5555/Car");

            System.out.println("Поместить метод сервера");
        } catch (Exception e) {
            System.out.println("Message Client exception: " + e);
        }
    }
}
