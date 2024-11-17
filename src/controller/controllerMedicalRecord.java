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
public class controllerMedicalRecord {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean save(modelMedicalRecord mr) {
        String sql = "insert into medicalrecords(patient_id, created_at, medical_summary, medical_history, allergies) values(?,?,?,?,?)";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, mr.getPatient_id());
            pst.setTimestamp(2, mr.getCreated_at());
            pst.setString(3, mr.getMedical_summary());
            pst.setString(4, mr.getMedical_history());
            pst.setString(5, mr.getAllergies());
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
    
    public List<modelMedicalRecord> Lst(int Id) {
        List<modelMedicalRecord> lis = new ArrayList<>();
        int id = Id;
        String sql = "SELECT * FROM medicalrecords WHERE patient_id = ?";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                modelMedicalRecord mr = new modelMedicalRecord();
                mr.setRecord_id(rs.getInt("record_id"));
                mr.setPatient_id(rs.getInt("patient_id"));
                mr.setCreated_at(rs.getTimestamp("created_at"));
                mr.setMedical_summary(rs.getString("medical_summary"));
                mr.setMedical_history(rs.getString("medical_history"));
                mr.setAllergies(rs.getString("allergies"));
                lis.add(mr);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lis;
    }
}
