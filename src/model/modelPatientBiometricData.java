package model;

public class modelPatientBiometricData {
    private int biometric_id;
    private int patient_id;
    private String rfid_id;
    private String fingerprint_model1;
    private String fingerprint_model2;

    public modelPatientBiometricData() {
    }

    public modelPatientBiometricData(int biometric_id, int patient_id, String rfid_id, String fingerprint_model1, String fingerprint_model2) {
        this.biometric_id = biometric_id;
        this.patient_id = patient_id;
        this.rfid_id = rfid_id;
        this.fingerprint_model1 = fingerprint_model1;
        this.fingerprint_model2 = fingerprint_model2;
    }

    // Getters and setters
    public int getBiometric_id() {
        return biometric_id;
    }

    public void setBiometric_id(int biometric_id) {
        this.biometric_id = biometric_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getRfid_id() {
        return rfid_id;
    }

    public void setRfid_id(String rfid_id) {
        this.rfid_id = rfid_id;
    }

    public String getFingerprint_model1() {
        return fingerprint_model1;
    }

    public void setFingerprint_model1(String fingerprint_model1) {
        this.fingerprint_model1 = fingerprint_model1;
    }

    public String getFingerprint_model2() {
        return fingerprint_model2;
    }

    public void setFingerprint_model2(String fingerprint_model2) {
        this.fingerprint_model2 = fingerprint_model2;
    }
}
