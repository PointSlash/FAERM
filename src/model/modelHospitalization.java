/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

public class modelHospitalization {
    private int hospitalization_id;
    private int patient_id;
    private Timestamp admission_date;
    private Timestamp discharge_date;
    private String reason;
    private String treatment;

    public modelHospitalization() {
    }

    public modelHospitalization(int hospitalization_id, int patient_id, Timestamp admission_date, Timestamp discharge_date, String reason, String treatment) {
        this.hospitalization_id = hospitalization_id;
        this.patient_id = patient_id;
        this.admission_date = admission_date;
        this.discharge_date = discharge_date;
        this.reason = reason;
        this.treatment = treatment;
    }

    // Getters and setters
    public int getHospitalization_id() {
        return hospitalization_id;
    }

    public void setHospitalization_id(int hospitalization_id) {
        this.hospitalization_id = hospitalization_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public Timestamp getAdmission_date() {
        return admission_date;
    }

    public void setAdmission_date(Timestamp admission_date) {
        this.admission_date = admission_date;
    }

    public Timestamp getDischarge_date() {
        return discharge_date;
    }

    public void setDischarge_date(Timestamp discharge_date) {
        this.discharge_date = discharge_date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}

