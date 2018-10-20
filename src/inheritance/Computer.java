/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Cyril
 */
public class Computer {
    protected String processor;
    protected int hdd;
    protected int ram;
    protected String motherboard;
    protected String videocard;
    protected String casing;
    
    public Computer(){
        
    }
    
    public void open(String toOpen){
        System.out.println("Opening " + toOpen + "...");
    }
    
    public void install(String toInstall){
        System.out.println("Installing " + toInstall + "...");
    }

    @Override
    public String toString() {
        return "Processor: " + processor + "\nRam: "+ram + 
                "gb\nHdd: " + hdd + "gb\nMotherboard: " + motherboard +
                "\nCasing: " + casing;
    }
    
    
}
