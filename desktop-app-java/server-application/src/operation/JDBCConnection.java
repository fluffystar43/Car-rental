package operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    /**
     * БД: car_rental_db Пользователь: postgres Пароль: password
     */
    private final String url = "jdbc:postgresql://localhost/car_rental_db";
    private final String user = "postgres";
    private final String password = "password";

    public Connection connect() {
        try {
            // Подключение к СУБД PostreSQL и базе данныхcar_rental_db
            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("Подключение к СУБД PostgreSQL и базе данных выполнено успешно.");
            return conn;
        } catch (SQLException e) {
            System.out.println("Ошибка подключения к базе данных: " + e.getMessage());
            return null;
        }
    }
}
