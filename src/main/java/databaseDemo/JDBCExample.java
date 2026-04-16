package main.java.databaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {

    public static void main(String[] args) {

        try {
            // ✅ DB URL
            String url = "jdbc:mysql://localhost:3306/testdb";

            // ✅ Username & Password
            String user = "root";
            String password = "root"; // use your password

            // ✅ Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to database");

            // ✅ Create statement
            Statement stmt = con.createStatement();

            // ✅ Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // ✅ Read data
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
            }

            // ✅ Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}