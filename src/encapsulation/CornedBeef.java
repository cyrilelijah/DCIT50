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
public class CornedBeef {
    private String color;
    private String taste;
    private String texture;
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getTaste() {
        return taste;
    }

    public String getTexture() {
        return texture;
    }
    
    public CornedBeef(){
        
    }
    
    public void cook(){
        System.out.println("Cooking corned beef");
    }
    
    public void put(String toPut){
        System.out.println("Putting " + toPut);
    }
    
    public void eat(){
        System.out.println("Eating... corned beef" );
    }
    
    @Override
    public String toString(){ // to make this object as a string
        return "Color: " + color + "\nTexture: " + 
                texture + "\nTaste: " + taste;
    }
}
