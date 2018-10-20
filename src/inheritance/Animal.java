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
public class Animal {
    String color;
    boolean hastail;
    String name;

    public Animal(String color){
        this.color = color;
    }
    
    public Animal(String color, boolean hastail, String name) {
        this.color = color;
        this.hastail = hastail;
        this.name = name;
    }
    
    public Animal(){
        System.out.println("Creating an animal");
    }
    
    public void eat(){
        System.out.println("The animal is eating");
    }
    
    public void walk(){
        System.out.println("The animal is walking");
    }
    
    public void makeSound(){
        System.out.println("The animal is speaking");
    }
}
