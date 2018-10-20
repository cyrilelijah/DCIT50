/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Cyril
 */

// every variable or method that is declared 
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.color = "Pink";
        
        computer.ram = 1;
        computer.hdd = 1;
        computer.processor = "Intel core i3";
        computer.motherboard = "Asus";
        computer.os = "Windows 10";
        
        System.out.println("Color: " + computer.color);
        System.out.println("Processor: " + computer.processor);
        System.out.println("Ram: " + computer.ram + "gb");
        System.out.println("HDD: " + computer.hdd + "tb");
        System.out.println("Motherboard: " + computer.motherboard);
        System.out.println("OS: " + computer.os);
        
        computer.open();
        computer.install("Microsoft Office");
        computer.install("Avira");
        computer.install("NBA 2k18");
        computer.open("NBA 2k18");
        computer.shutdown();
        
        
        Computer desktop = new Computer();
    }
}
