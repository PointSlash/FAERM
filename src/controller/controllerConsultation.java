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
public class controllerConsultation {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean save(modelConsultation mc) {
        String sql = "insert into consultations(patient_id, doctor_id, consultation_date, notes, diagnosis, treatment) values(?,?,?,?,?,?)";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, mc.getPatient_id());
            pst.setInt(2, mc.getDoctor_id());
            pst.setTimestamp(3, mc.getConsultation_date());
            pst.setString(4, mc.getNotes());
            pst.setString(5, mc.getDiagnosis());
            pst.setString(6, mc.getTreatment());
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
    
    public List<modelConsultation> Lst(int Id) {
        int id = Id;
        List<modelConsultation> lis = new ArrayList<>();
        String sql = "SELECT * FROM consultations WHERE patient_id = ?";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                modelConsultation mc = new modelConsultation();
                mc.setConsultation_id(rs.getInt("consultation_id"));
                mc.setPatient_id(rs.getInt("patient_id"));
                mc.setDoctor_id(rs.getInt("doctor_id"));
                mc.setConsultation_date(rs.getTimestamp("consultation_date"));
                mc.setNotes(rs.getString("notes"));
                mc.setDiagnosis(rs.getString("diagnosis"));
                mc.setTreatment(rs.getString("treatment"));
                lis.add(mc);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lis;
    }
}
