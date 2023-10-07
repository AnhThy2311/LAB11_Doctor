/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import view.Validation;

/**
 *
 * @author HP
 */
public class ListDoctor {
    private ArrayList<Doctor> doctors;
    private Validation validation;
    
    public ListDoctor(){
        doctors = new ArrayList<>();
        validation= new Validation();
    }
    
    public void addDoctor(){
        while (true) {
            System.out.print("Enter code: ");
            String code = validation.inputString();
            System.out.print("Enter name: ");
            String name = validation.inputString();
            System.out.print("Enter specialization: ");
            String specialization = validation.inputString();
            System.out.print("Enter availability: ");
            int availability = validation.inputInt();

            Doctor d = new Doctor(code, name, specialization, availability);
            if (validation.checkIdExist(doctors ,code)) {
                doctors.add(d);
            System.err.println("Create success!");
            }

                System.out.print("Do you want to create more students (Y/N): ");
            if (!validation.inputYesNo()) {
                return;
            }
            
        }
    }
    
    public void updateDoctor(ArrayList<Doctor> doctors) {
        Doctor updateDoctor = searchDoctorByID(doctors);
        if (updateDoctor == null) return;
        else { 
            System.out.print("Enter code: ");
            String codeUpdate = validation.inputString();
            System.out.print("Enter name: ");
            String updateName = validation.inputString();
            System.out.print("Enter specialization: ");
            String updateSpecialization = validation.inputString();
            System.out.print("Enter availability: ");
            int updateAvailability = validation.inputInt();
            if (validation.checkChangeInfo(updateDoctor ,codeUpdate, updateName, updateSpecialization, updateAvailability)){
            updateDoctor.setCode(codeUpdate);
            updateDoctor.setName(updateName);
            updateDoctor.setSpecialization(updateSpecialization);
            updateDoctor.setAvailability(updateAvailability);
            System.out.println("Update successful!");
        }
        else {
            System.out.println("Nothing change!");
        }
        }
    }
    
    public Doctor searchDoctorByID(ArrayList<Doctor> doctors) {
        System.out.println("Enter code:");
        String idSearch = validation.inputString();
        int count = 0;
        for (Doctor d : doctors) {
            if (d.getCode().equalsIgnoreCase(idSearch)) {   
                count++;
                return d;
            }
        }
        if (count == 0) {
            System.out.println("Not Found!");
        }
        return null;
    }
    
    public void searchDoctor(ArrayList<Doctor> doctors) {
        System.out.print("Enter name: ");
        String nameSearch = validation.inputString();
        ArrayList<Doctor> listFoundByName = listFoundByName(doctors, nameSearch);
        if (listFoundByName.isEmpty()) {
            System.err.println("List empty.");
        } else {
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            for (Doctor doctor : listFoundByName) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            }
        }
    }
    
    public ArrayList<Doctor> listFoundByName(ArrayList<Doctor> doctors, String name) {
        ArrayList<Doctor> listFoundByName = new ArrayList<>();
        for (Doctor doctor : doctors) {
            if (doctor.getName().toLowerCase().contains(name.toLowerCase())) {
                listFoundByName.add(doctor);
            }
        }
        return listFoundByName;
    }

    //allow user delete contact
    public void deleteDoctor(ArrayList<Doctor> doctors) {
        System.out.print("Enter id: ");
        String idDelete = validation.inputString();
        Doctor doctorDelete = getDoctorById(doctors, idDelete);
        if (doctorDelete == null) {
            System.err.println("Not found doctor.");
            return;
        } else {
            doctors.remove(doctorDelete);
        }
        System.err.println("Delete successful.");
    }

    //get contact by id
    public Doctor getDoctorById(ArrayList<Doctor> doctors, String codeDelete) {
        for (Doctor d : doctors) {
            if (d.getCode().equalsIgnoreCase(codeDelete)) {
                return d;
            }
        }
        return null;
    }    
    }
    

