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
public class Desktop extends Computer {

    //default constructor
    public Desktop() {
        processor = "Pentium 4";
        ram = 256;
        hdd = 50;
        motherboard = "AsRock";
        casing = "wood";
    }

    public void setCasing(String casing) {
        this.casing = casing;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getCasing() {
        return casing;
    }

    public int getHdd() {
        return hdd;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getVideocard() {
        return videocard;
    }

    @Override
    public String toString() {
        return "a;lkd;lkasl;"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
