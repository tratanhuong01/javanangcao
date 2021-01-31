package controller;

import java.sql.*;
import model.*;

public class InsertMessage {

    public int insert() {
        int count = 0;
        try (Connection conn = new ConnectDAO().getConection()) {
            String query = "";
            PreparedStatement ps = conn.prepareStatement(query);
            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
