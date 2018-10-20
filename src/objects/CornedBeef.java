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
public class CornedBeef {
    String color;
    String taste;
    String texture;
    
    public CornedBeef(){
        
    }
    
    public void cook(){
        System.out.println("Cooking corned beef");
    }
    
    public void put(String toPut){
        System.out.println("Putting " + toPut);
    }
}
