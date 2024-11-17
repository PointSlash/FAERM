/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class modelPrescriptionMedication {
    private int prescription_id;
    private int medication_id;

    public modelPrescriptionMedication() {
    }

    public modelPrescriptionMedication(int prescription_id, int medication_id) {
        this.prescription_id = prescription_id;
        this.medication_id = medication_id;
    }

    // Getters and setters
    public int getPrescription_id() {
        return prescription_id;
    }

    public void setPrescription_id(int prescription_id) {
        this.prescription_id = prescription_id;
    }

    public int getMedication_id() {
        return medication_id;
    }

    public void setMedication_id(int medication_id) {
        this.medication_id = medication_id;
    }
}

