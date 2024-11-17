/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

public class modelMedicalRecord {
    private int record_id;
    private int patient_id;
    private Timestamp created_at;
    private String medical_summary;
    private String medical_history;
    private String allergies;

    public modelMedicalRecord() {
    }

    public modelMedicalRecord(int record_id, int patient_id, Timestamp created_at, String medical_summary, String medical_history, String allergies) {
        this.record_id = record_id;
        this.patient_id = patient_id;
        this.created_at = created_at;
        this.medical_summary = medical_summary;
        this.medical_history = medical_history;
        this.allergies = allergies;
    }

    // Getters and setters
    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public String getMedical_summary() {
        return medical_summary;
    }

    public void setMedical_summary(String medical_summary) {
        this.medical_summary = medical_summary;
    }

    public String getMedical_history() {
        return medical_history;
    }

    public void setMedical_history(String medical_history) {
        this.medical_history = medical_history;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
}

