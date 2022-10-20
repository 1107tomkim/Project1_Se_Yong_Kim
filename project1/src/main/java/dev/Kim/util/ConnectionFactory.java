package dev.Kim.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver"); // forName is a Builtin method ( Function in Python and other language )
        }
        catch (ClassNotFoundException e) {
            System.out.println("CLASS WAS NOT FOUND!!");
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=project1";
        String username = "postgres";
        String password = "password";

        return DriverManager.getConnection(url, username, password);
    }
}
