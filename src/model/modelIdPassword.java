/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
/**
 *
 * @author GadgetZone
 */
public class modelIdPassword {
    private String id;
    private String password;

    public modelIdPassword() {
    }

    public modelIdPassword(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
