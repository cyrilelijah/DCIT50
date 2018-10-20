/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;


/**
 *
 * @author Cyril
 */
public class Computer {
    //encapsulation also refers as getter and setter 
    private int ram;
    private int hdd;
    private String motherboard;
    private String processor;
    private String color;
    private String os;
    public static int count;
    
    //Default Constructor
    public Computer(){
        System.out.println("Constructing a computer");
        count++;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setMotherboard(String motherboard){
        this.motherboard = motherboard;
    }
    
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public String getColor(){
        return color;
    }

    public int getHdd() {
        return hdd;
    }
    
    public int getRam(){
        return ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getOs() {
        return os;
    }

    public String getProcessor() {
        return processor;
    }
    
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
    
    public static void pullThePlug(){
        
    }
    
}
