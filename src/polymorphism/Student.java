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
public class Student extends Person{
    @Override
    protected void eat(){
        System.out.println("The student is eating");
    }

    @Override
    protected void breath() {
        System.out.println("The student is breathing");
    }

    @Override
    protected void talking() {
        super.talking(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cleanTheClassroom() {
        System.out.println("The student is cleaning the room");
    }
}
