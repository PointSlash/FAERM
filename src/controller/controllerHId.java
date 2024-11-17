/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.*;

public class controllerHId {

    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst;
    ResultSet rs;

    public boolean verifyPassword(modelHId mh) {
        String sql = "select hpassword from login where hid = ?";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, mh.getId());
            rs = pst.executeQuery();
            
            if (rs.next()) {
                String storedPassword = rs.getString("hpassword");
                return storedPassword.equals(mh.getPassword());
            } else {
                return false; // ID non trouvé
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
