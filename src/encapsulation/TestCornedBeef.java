/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import objects.*;

/**
 *
 * @author Cyril
 */
public class TestCornedBeef {
    public static void main(String[] args) {
        CornedBeef cornedBeef = new CornedBeef();
        cornedBeef.setColor("Red");
        cornedBeef.setTexture("choowey");
        cornedBeef.setTaste("Salty");
        
        System.out.println(cornedBeef);
        cornedBeef.cook();
        cornedBeef.put("Potato");
        cornedBeef.setColor("Brown");
        System.out.println("Color: " + cornedBeef.getColor());
        cornedBeef.put("Onion");
        cornedBeef.put("Cheese");
        cornedBeef.setTexture("");
        cornedBeef.eat();
    }
}
