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
public class TestChair {
    public static void main(String[] args) {
        System.out.println("Chair 1");
        Chair chair = new Chair();// Class instantiation
        chair.move();
        chair.smash();
        chair.color = "Blue";
        chair.height = 4.0;
        chair.weight = .5;
        
        System.out.println("Color: " + chair.color);
        System.out.println("Height: " + chair.height);
        System.out.println("Weight: " + chair.weight);
        
        chair.color = "Red";
        System.out.println("Changing the color of chair.");
        System.out.println("Color: " + chair.color);
        
        System.out.println("Chair 2");
        Chair chair2 = new Chair();
        chair2.color = "black";
        chair2.height = 5;
        chair2.weight = .15;
        System.out.println("Color: " + chair2.color);
        System.out.println("Height: " + chair2.height);
        System.out.println("Weight: " + chair2.weight);
        
        // DCIT50 CS 2018
    }
}
