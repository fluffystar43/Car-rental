package service.endpoint;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import operation.ClientOperation;
import types.Client;

@WebService
public class ClientService implements ClientOperation {

    private static Connection connection;

    public ClientService(Connection connection) {
        this.connection = connection;
    }

    @WebMethod()
    @Override
    public List<Client> getListOfClients() {
        List listClients = new ArrayList<Client>();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT "
                    + "id, "
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
                    + "is_blocked FROM client WHERE is_blocked = false");
            while (result.next()) {
                listClients.add(new Client(
                        result.getLong("id"),
                        result.getString("login"),
                        result.getString("hash_password"),
                        result.getString("second_name"),
                        result.getString("first_name"),
                        result.getString("middle_name"),
                        result.getDate("date_birthday"),
                        result.getString("phone_number"),
                        result.getString("passport_data"),
                        result.getString("drivers_license"),
                        result.getString("email"),
                        result.getBoolean("is_blocked")
                ));
            }
            System.out.println("Получен список клиентов");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return listClients;
    }

}
