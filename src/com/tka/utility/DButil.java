package com.tka.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/ipl";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    // Static block to load the driver once
    static {
        try {
            Class.forName(DRIVER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to get a DB connection
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
