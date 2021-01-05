package controller;

import java.sql.*;
import model.ConnectDAO;

public class InsertMessage {

    public int insert(String guests,String servers,String messGuest,String messServer) {
        int count = 0;
        try (Connection conn = new ConnectDAO().getConection()) {
            String query = "INSERT INTO `message`(Guests`, `Servers`, `MessagesGuest`, "
                    + "`MessagesServer`) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, guests);
            ps.setString(2, servers);
            ps.setString(3, messGuest);
            ps.setString(4, messServer);
            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
