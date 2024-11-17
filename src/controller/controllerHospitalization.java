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
public class controllerHospitalization {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean save(modelHospitalization mh) {
        String sql = "insert into hospitalizations(patient_id, admission_date, discharge_date, reason, treatment) values(?,?,?,?,?)";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, mh.getPatient_id());
            pst.setTimestamp(2, mh.getAdmission_date());
            pst.setTimestamp(3, mh.getDischarge_date());
            pst.setString(4, mh.getReason());
            pst.setString(5, mh.getTreatment());
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
    
    public List<modelHospitalization> Lst(int Id) {
        List<modelHospitalization> lis = new ArrayList<>();
        String sql = "SELECT * FROM hospitalizations WHERE patient_id = ?";
        int id = Id;
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                modelHospitalization mh = new modelHospitalization();
                mh.setHospitalization_id(rs.getInt("hospitalization_id"));
                mh.setPatient_id(rs.getInt("patient_id"));
                mh.setAdmission_date(rs.getTimestamp("admission_date"));
                mh.setDischarge_date(rs.getTimestamp("discharge_date"));
                mh.setReason(rs.getString("reason"));
                mh.setTreatment(rs.getString("treatment"));
                lis.add(mh);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lis;
    }
}
