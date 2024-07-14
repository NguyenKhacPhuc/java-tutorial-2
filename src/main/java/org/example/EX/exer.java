package org.example.EX;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class exer {
    public static void main(String[] args){
        try{
            String DB_URL = "jdbc:mysql://localhost:3306/schema1";
            String PASSWORD = "07072003";
            String USER_NAME = "root";
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM cats");

            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getInt("age"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String dbURL, String userName, String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("Connected successfully!");
        } catch (Exception ex) {
            System.out.println("Connection failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
