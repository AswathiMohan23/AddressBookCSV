package com.java;

import java.sql.*;
import java.util.Enumeration;

public class JdbcConnection {
    public static boolean jdbcConnection(String query) throws SQLException {
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/addressbooksystem"; // give database name
            String USER = "root";
            String PASS = "aswathi123";
            Connection con = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
                System.out.println("Driver loaded");
            } catch (ClassNotFoundException e) {
                throw new AddressBookException();
            }
            listDrivers();
            try {
                System.out.println("connecting to database : " + DB_URL);
                con = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Connection is successful " + con);
            } catch (Exception e) {
                e.printStackTrace();
            }

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query); // Execute query
            while (rs.next()) {
                System.out.println("id:" + rs.getInt("id"));
                System.out.println("firstName:" + rs.getString("firstName"));
                System.out.println("lastName:" + rs.getString("lastName"));
                System.out.println("city:" + rs.getString("city"));
                System.out.println("state:" + rs.getString("state"));
                System.out.println("zip:" + rs.getString("zip"));
                System.out.println("phn:" + rs.getString("phn"));
                System.out.println("type:" + rs.getString("type"));
                System.out.println("\n");
            }
            st.close();
            con.close();
            return true;
        } catch (AddressBookException e) {
        }
        return false;
    }


    private static void listDrivers() {
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while
        (driverList.hasMoreElements()) {
            Driver driverClass = (Driver) driverList.nextElement();
            System.out.println(" " + driverClass.getClass().getName());
        }
    }
}

