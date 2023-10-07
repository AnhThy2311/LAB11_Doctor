/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ListDoctor;
import view.Menu;

/**
 *
 * @author HP
 */
public class ManageDoctor extends Menu<String>{
    
    private ListDoctor doctors= new ListDoctor();
    
    public ManageDoctor(String title, String[] s){
        super(title,s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                createDoctor(doctors);
                break;
            case 2:
                updateDoctor(doctors);
                break;
            case 3:
                deleteDoctor(doctors);
                break;
            case 4:
                searchDoctor(doctors);
                break;
            case 5:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    
}
