/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ManageDoctor;

import model.Doctor;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        
        new ManageDoctor(doctor).run();
    }
}
