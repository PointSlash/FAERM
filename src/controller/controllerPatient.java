package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 */
public class controllerPatient {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean save(modelPatient mp) {
        String sql = "insert into patients(first_name, last_name, birth_date, gender, address, phone_number, email, social_security_number, emergency_contact, allergies) values(?,?,?,?,?,?,?,?,?,?)";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, mp.getFirst_name());
            pst.setString(2, mp.getLast_name());
            pst.setDate(3, mp.getBirth_date());
            pst.setString(4, mp.getGender());
            pst.setString(5, mp.getAddress());
            pst.setString(6, mp.getPhone_number());
            pst.setString(7, mp.getEmail());
            pst.setString(8, mp.getSocial_security_number());
            pst.setString(9, mp.getEmergency_contact());
            pst.setString(10, mp.getAllergies());
            pst.executeUpdate();
            
            return true;
            
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
    
    public List<modelPatient> Lst(int Id) {
        List<modelPatient> lis = new ArrayList<>();
        int id = Id;
        String sql = "SELECT * FROM patients WHERE patient_id = ?";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                modelPatient mp = new modelPatient();
                mp.setPatient_id(rs.getInt("patient_id"));
                mp.setFirst_name(rs.getString("first_name"));
                mp.setLast_name(rs.getString("last_name"));
                mp.setBirth_date(rs.getDate("birth_date"));
                mp.setGender(rs.getString("gender"));
                mp.setAddress(rs.getString("address"));
                mp.setPhone_number(rs.getString("phone_number"));
                mp.setEmail(rs.getString("email"));
                mp.setSocial_security_number(rs.getString("social_security_number"));
                mp.setEmergency_contact(rs.getString("emergency_contact"));
                mp.setAllergies(rs.getString("allergies"));
                lis.add(mp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lis;
    }
}
