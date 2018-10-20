/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author Cyril
 */
public class Student extends Person{
    
    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public void walk() {
        System.out.println("The Student is walking.");
    }

    @Override
    public void sleep() {
        System.out.println("The Student is sleeping.");
    }
     
}
