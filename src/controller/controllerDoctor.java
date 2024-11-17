/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.*;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author GadgetZone
 */
public class controllerDoctor {
    
    Connection con;
    conexion cn = new conexion();
    PreparedStatement pst ;
    ResultSet rs;
    
    public boolean save(modelDoctor md){
        
        String sql = "insert into doctors(doctor_id, first_name, last_name, specialty, phone_number, email, office_address)values(?,?,?,?,?,?,?)";
        
        try {

            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, md.getDoctor_id());
            pst.setString(2, md.getFirst_name());
            pst.setString(3, md.getLast_name());
            pst.setString(4, md.getSpecialty());
            pst.setString(5, md.getPhone_number());
            pst.setString(6, md.getEmail());
            pst.setString(7, md.getOffice_address());
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
    
    public List Lst(int Id){
        
        int id = Id;
        List<modelDoctor> lis =new ArrayList<>(); 
        String sql = "SELECT * FROM doctors WHERE patient_id = ?";
        try {
            
            con = cn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while(rs.next()){
                
                modelDoctor md = new modelDoctor();
                md.setDoctor_id(rs.getInt("docotr_id"));
                md.setFirst_name(rs.getString("first_name"));
                md.setLast_name(rs.getString("last_name"));
                md.setSpecialty(rs.getString("specialty"));
                md.setPhone_number(rs.getString("phone_number"));
                md.setEmail(rs.getString("email"));
                md.setOffice_address(rs.getString("office_address"));
                lis.add(md);
                
            }
            
            
        } catch (Exception e) { 
            e.printStackTrace();
        
        }
        
        return lis;
        
    }
}
