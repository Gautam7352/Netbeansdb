package dbtest;

import java.sql.*;

class Dbtest {

    public static void main(String args[]) throws ClassNotFoundException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-M90AMME:1521:XE", "m1", "m1")) {
                System.out.println("Database connected sucessfully");
            }
        } catch (SQLException e) {
            System.out.println("SQL error");
        }
    }
}
