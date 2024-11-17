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
public class controllerPrescription {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean save(modelPrescription mp) {
        String sql = "insert into prescriptions(patient_id, doctor_id, prescription_date) values(?,?,?)";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, mp.getPatient_id());
            pst.setInt(2, mp.getDoctor_id());
            pst.setTimestamp(3, mp.getPrescription_date());
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
    
    public List<modelPrescription> Lst(int Id) {
        List<modelPrescription> lis = new ArrayList<>();
        int id = Id;
        String sql = "SELECT * FROM prescriptions WHERE patient_id = ?";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                modelPrescription mp = new modelPrescription();
                mp.setPrescription_id(rs.getInt("prescription_id"));
                mp.setPatient_id(rs.getInt("patient_id"));
                mp.setDoctor_id(rs.getInt("doctor_id"));
                mp.setPrescription_date(rs.getTimestamp("prescription_date"));
                lis.add(mp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lis;
    }
}

