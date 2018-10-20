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
public class Computer {
    int ram;
    int hdd;
    String motherboard;
    String processor;
    String color;
    String os;
    
    public void open(){
        System.out.println("Starting...");
        System.out.println("Loading Windows...");
    }
    
    public void open(String app){
        System.out.println("Opening..." + app);
    }
    
    public void install(String app){
        System.out.println("Installing..." + app);
    }
    
    public void shutdown(){
        System.out.println("Shutting down..");
    }
    
    public void pullThePlug(){
        
    }
}
