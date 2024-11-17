/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class modelMedication {
    private int medication_id;
    private String name;
    private String description;
    private String dosage;
    private String side_effects;
    private String contraindications;

    public modelMedication() {
    }

    public modelMedication(int medication_id, String name, String description, String dosage, String side_effects, String contraindications) {
        this.medication_id = medication_id;
        this.name = name;
        this.description = description;
        this.dosage = dosage;
        this.side_effects = side_effects;
        this.contraindications = contraindications;
    }

    // Getters and setters
    public int getMedication_id() {
        return medication_id;
    }

    public void setMedication_id(int medication_id) {
        this.medication_id = medication_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getSide_effects() {
        return side_effects;
    }

    public void setSide_effects(String side_effects) {
        this.side_effects = side_effects;
    }

    public String getContraindications() {
        return contraindications;
    }

    public void setContraindications(String contraindications) {
        this.contraindications = contraindications;
    }
}

