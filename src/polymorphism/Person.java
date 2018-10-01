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
public class Person {

    public Person() {
//        System.out.println("Constructing a person");
    }
    
    
    protected void eat(){
        System.out.println("The person is eating");
    }
    
    protected void sleeping(){
        System.out.println("The person is sleeping");
    }
    
    protected void walking(){
        System.out.println("The person is walking");
    }
    
    protected void breath(){
        System.out.println("The person is breathing");
    }
    
    protected void talking(){
    }
    
    public void cleanTheClassroom(){
        System.out.println("The person is cleaning the classroom");
    }
}
