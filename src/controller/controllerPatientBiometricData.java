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
public class controllerPatientBiometricData {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean save(modelPatientBiometricData mpb) {
        String sql = "insert into PatientBiometricData(patient_id, rfid_id, fingerprint_model1, fingerprint_model2) values(?,?,?,?)";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, mpb.getPatient_id());
            pst.setString(2, mpb.getRfid_id());
            pst.setString(3, mpb.getFingerprint_model1());
            pst.setString(4, mpb.getFingerprint_model2());
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
    
    public List<modelPatientBiometricData> Lst() {
        List<modelPatientBiometricData> lis = new ArrayList<>();
//        String id = Id;
        String sql = "SELECT * FROM PatientBiometricData";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
//            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                modelPatientBiometricData mpb = new modelPatientBiometricData();
                mpb.setBiometric_id(rs.getInt("biometric_id"));
                mpb.setPatient_id(rs.getInt("patient_id"));
                mpb.setRfid_id(rs.getString("rfid_id"));
                mpb.setFingerprint_model1(rs.getString("fingerprint_model1"));
                mpb.setFingerprint_model2(rs.getString("fingerprint_model2"));
                lis.add(mpb);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lis;
    }
}
