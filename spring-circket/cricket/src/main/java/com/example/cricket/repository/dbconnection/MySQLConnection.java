package com.example.cricket.repository.dbconnection;

import com.example.cricket.repository.interfaces.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySQLConnection implements DBConnection {
    private static java.sql.Connection connection;

    public static java.sql.Connection getConnection(){
        return connection;
    }
    public static void connectDB(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc", "root", "Xbox@720");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Connection Established...");
    }
    public static int executeUpdateQuery(String query){
        try{
            PreparedStatement stmt=connection.prepareStatement(query);
            return stmt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }
    public static ResultSet executeSelectQuery(String query){
        try{
            PreparedStatement stmt=connection.prepareStatement(query);
            return stmt.executeQuery();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
