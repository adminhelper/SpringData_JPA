package me.sungmun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {
    public static void main (String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/springdata";
        String username = "Sungmun";
        String password = "pass";

        try(Connection connection = DriverManager.getConnection(url, username ,password)) {
            System.out.println("Connection Created : "+ connection);
            String sql = "INSERT INTO ACCOUNT VALUES (1, 'sungmun', 'pass')";
            try(PreparedStatement statement = connection.prepareStatement(sql)){
                statement.execute();
            }
        }
    }
}
