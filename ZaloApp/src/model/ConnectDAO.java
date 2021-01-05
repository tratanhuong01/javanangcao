package model;

import java.sql.*;

public class ConnectDAO {

    public Connection getConection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/zaloapp", "root", "");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
