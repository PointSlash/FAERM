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
public class controllerMedication {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean save(modelMedication mm) {
        String sql = "insert into medications(name, description, dosage, side_effects, contraindications) values(?,?,?,?,?)";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, mm.getName());
            pst.setString(2, mm.getDescription());
            pst.setString(3, mm.getDosage());
            pst.setString(4, mm.getSide_effects());
            pst.setString(5, mm.getContraindications());
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
    
    public List<modelMedication> Lst(int Id) {
        List<modelMedication> lis = new ArrayList<>();
        int id = Id;
        String sql = "SELECT * FROM medications WHERE medication_id = ?";
        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                modelMedication mm = new modelMedication();
                mm.setMedication_id(rs.getInt("medication_id"));
                mm.setName(rs.getString("name"));
                mm.setDescription(rs.getString("description"));
                mm.setDosage(rs.getString("dosage"));
                mm.setSide_effects(rs.getString("side_effects"));
                mm.setContraindications(rs.getString("contraindications"));
                lis.add(mm);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lis;
    }
}
