package com.jdbc.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args) {
        try {
            // System.out.println("this is jdbc");

            Connection c = ConnectionProvider.getConnection();
            String q = "insert into images(pic) values(?)";
            PreparedStatement pstmt = c.prepareStatement(q);
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
