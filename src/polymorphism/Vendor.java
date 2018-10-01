/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Cyril
 */
public class Vendor extends Person{
    @Override
    protected void eat(){
        System.out.println("The vendor is eating");
    }
    
}
