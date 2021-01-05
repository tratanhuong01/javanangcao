package controller;

import java.util.*;
import java.sql.*;
import model.*;

public class keyWord {
    public List<String[]> getKeyWord() {
        List<String[]> list = new ArrayList<>();
        try (Connection conn = new ConnectDAO().getConection()){
            String query = "SELECT `word`, `message` FROM `keyword`";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] arr = new String[2];
                arr[0] = rs.getString(1);
                arr[1] = rs.getString(2);
                list.add(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
