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
public class Teacher extends Person{
    @Override
    protected void eat(){
        System.out.println("The teacher is eating");
    }

    @Override
    public void cleanTheClassroom() {
        System.out.println("The teacher is cleaning the classroom");
    }
    
    
    
}
