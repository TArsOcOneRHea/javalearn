package Practice._9_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Book {
    Integer id;
    String tittle;

    static List<Book> getAllBooks(Connection connection, String prefixName) throws SQLException{
        PreparedStatement pS = connection.prepareStatement("SELECT * FROM books WHERE name ILIKE '?%'");
        pS.setString(1, prefixName);
        ResultSet resultSet = pS.executeQuery();

        while (resultSet.next()){
            String name = resultSet.getString("name");
            Integer year = resultSet.getInt("year");

            System.out.println(name + " - " + year);
        }
        return Collections.emptyList();
    }
}
