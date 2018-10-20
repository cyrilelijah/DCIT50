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
public abstract class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void eat(){
        System.out.println("The person is eating");
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age
                + "\nAddress: " + address;
    }
    
    public abstract void walk();
    public abstract void sleep();
}
