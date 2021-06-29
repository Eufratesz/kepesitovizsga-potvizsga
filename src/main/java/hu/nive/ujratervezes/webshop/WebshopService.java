package hu.nive.ujratervezes.webshop;

/*
Hozd létre a WebshopService osztályt, melyben egyetlen publikus metódus van, getValuableCustomers néven, ami térjen
vissza azoknak az ügyfelek a nevével (customer_name), akik több, 1000-ért rendeltek, ABC szerint növekvő sorrendben.

Ha az adatbázis üres, akkor a metódus térjen vissza üres listával.
 */

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


//insert into orders(total, order_date, customer_name) values (959.1, '2021-01-22 00:28:53', 'Olga Johns');

public class WebshopService {

    private DataSource dataSource;
    int total;

    public WebshopService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getValuableCustomers() {

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select customer_name from orders order by customer_name where total > 1000 ");
        ) {
            stmt.setInt(1, total);


            return findByName(stmt);

        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }

    private List<String> findByName(PreparedStatement stmt) {
        List<String> result = new ArrayList<>();
        try (
                ResultSet rs = stmt.executeQuery();
        ) {
            while (rs.next()) {
                String name = rs.getString("customer_name");

                result.add(name);

                return result;
            }
            throw new IllegalArgumentException("No result");
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }

}



