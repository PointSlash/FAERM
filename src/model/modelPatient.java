/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class modelPatient {
    private int patient_id;
    private String first_name;
    private String last_name;
    private java.sql.Date birth_date;
    private String gender;
    private String address;
    private String phone_number;
    private String email;
    private String social_security_number;
    private String emergency_contact;
    private String allergies;

    public modelPatient() {
    }

    public modelPatient(int patient_id, String first_name, String last_name, java.sql.Date birth_date, String gender, String address, String phone_number, String email, String social_security_number, String emergency_contact, String allergies) {
        this.patient_id = patient_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.gender = gender;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
        this.social_security_number = social_security_number;
        this.emergency_contact = emergency_contact;
        this.allergies = allergies;
    }

    // Getters and setters
    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public java.sql.Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(java.sql.Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocial_security_number() {
        return social_security_number;
    }

    public void setSocial_security_number(String social_security_number) {
        this.social_security_number = social_security_number;
    }

    public String getEmergency_contact() {
        return emergency_contact;
    }

    public void setEmergency_contact(String emergency_contact) {
        this.emergency_contact = emergency_contact;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
}
