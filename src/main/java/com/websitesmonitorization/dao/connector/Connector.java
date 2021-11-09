package com.websitesmonitorization.dao.connector;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.stereotype.Component;
import java.sql.Connection;



@Component
public class Connector {
    public static final String DB_URL = "jdbc:mysql://ec2-54-163-134-67.compute-1.amazonaws.com:3306/?user=root?currentSchema=profundiacion";

    public Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, "root", "OyPwiuv6%h");
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }

        return conn;
    }

    public static void main(String[]args){
        Connector c = new Connector();
        Connection conn = c.getConnection();
        System.out.println(conn);

    }
}
