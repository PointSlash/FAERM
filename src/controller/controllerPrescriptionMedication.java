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
public class controllerPrescriptionMedication {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean save(modelPrescriptionMedication pm) {
        String sql = "insert into prescription_medications(prescription_id, medication_id) values(?,?)";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, pm.getPrescription_id());
            pst.setInt(2, pm.getMedication_id());
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
    
    public List<modelPrescriptionMedication> Lst(int Id) {
        List<modelPrescriptionMedication> lis = new ArrayList<>();
        int id = Id;
        String sql = "SELECT * FROM prescription_medications WHERE prescription_id = ?";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                modelPrescriptionMedication pm = new modelPrescriptionMedication();
                pm.setPrescription_id(rs.getInt("prescription_id"));
                pm.setMedication_id(rs.getInt("medication_id"));
                lis.add(pm);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lis;
    }
}
