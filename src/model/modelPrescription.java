/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

public class modelPrescription {
    private int prescription_id;
    private int patient_id;
    private int doctor_id;
    private Timestamp prescription_date;

    public modelPrescription() {
    }

    public modelPrescription(int prescription_id, int patient_id, int doctor_id, Timestamp prescription_date) {
        this.prescription_id = prescription_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.prescription_date = prescription_date;
    }

    // Getters and setters
    public int getPrescription_id() {
        return prescription_id;
    }

    public void setPrescription_id(int prescription_id) {
        this.prescription_id = prescription_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Timestamp getPrescription_date() {
        return prescription_date;
    }

    public void setPrescription_date(Timestamp prescription_date) {
        this.prescription_date = prescription_date;
    }
}
