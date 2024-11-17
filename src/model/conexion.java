      /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author GadgetZone
 */  
public class conexion {
    
    Connection con;
    
    public Connection getConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/faemf", "root", "");
            return con;
        } catch (Exception e) {
            
            e.printStackTrace();
        
        }
        return null;
    }  
   
}
