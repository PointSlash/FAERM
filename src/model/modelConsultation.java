/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author GadgetZone
 */
public class modelConsultation {
    private int patient_id;
    private int consultation_id;
    private int doctor_id;
    private Timestamp consultation_date;
    private String notes;
    private String diagnosis;
    private String treatment;

    public modelConsultation() {
    }

    public modelConsultation(int patient_id, int consultation_id, int doctor_id, Timestamp consultation_date, String notes, String diagnosis, String treatment) {
        this.patient_id = patient_id;
        this.consultation_id = consultation_id;
        this.doctor_id = doctor_id;
        this.consultation_date = consultation_date;
        this.notes = notes;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getConsultation_id() {
        return consultation_id;
    }

    public void setConsultation_id(int consultation_id) {
        this.consultation_id = consultation_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Timestamp getConsultation_date() {
        return consultation_date;
    }

    public void setConsultation_date(Timestamp consultation_date) {
        this.consultation_date = consultation_date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    
}
