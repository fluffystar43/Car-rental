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
            switch (criteria) {
                case ("Бренд"):
                    criteria = "brand";
                    break;
                case ("Марка"):
                    criteria = "model";
                    break;
                case ("Коробка передач"):
                    criteria = "gear_box";
                    break;
            }
            ResultSet result = statement.executeQuery("SELECT id, name from " + criteria);
            while (result.next()) {
                listCriteria.add(result.getInt("id"));
                listCriteria.add(result.getString("name"));
            }
            System.out.println("Получен список клиентов");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return listCriteria;
    }
}
