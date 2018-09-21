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
public class Mammal extends Animal{

    @Override
    public String toString() {
        return "Name: " + name + "\nColor: " + color +
                "\nHastail: " + hastail;
    }
    
    @Override
    public void eat(){
        System.out.println("The mammal is eating");
    }
}
