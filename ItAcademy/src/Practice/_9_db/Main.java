package Practice._9_db;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql:library", "postgres", "postgres")){

            String selectTableSQL = "SELECT name, year" +
                    "FROM books";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectTableSQL);


            while (resultSet.next()){
                String name = resultSet.getString("name");
                Integer year = resultSet.getInt("year");

                System.out.println(name + " - " + year);
            }
        }
        
    }
}
