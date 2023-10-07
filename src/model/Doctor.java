/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Doctor {
    private String Code;
    private String Name;
    private String Specialization;
    private int Availability;

    public Doctor() {
    }
    

    public Doctor(String Code, String Name, String Specialization, int Availability) {
        this.Code = Code;
        this.Name = Name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    public String getCode() {
        return Code;
    }

    public String getName() {
        return Name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }

    @Override
    public String toString() {
        return "Doctor{" + "Code=" + Code + ", Name=" + Name + ", Specialization=" + Specialization + ", Availability=" + Availability + '}';
    }
    
    
    
    
    
}
