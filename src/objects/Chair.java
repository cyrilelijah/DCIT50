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
public class Chair {
    String color;
    double height;
    double weight;
    
    public void move(){
        System.out.println("The chair was moved.");
    }
    
    public void smash(){
        System.out.println("Smash...");
    }
}
