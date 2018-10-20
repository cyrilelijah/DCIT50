/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Cyril
 */
public class Person extends Human{
    protected String name;
    protected int age;
    protected String address;
    
    public Person(){
        System.out.println("Constructing a person");
    }

    public Person(String name, int age, String address) {
        this();
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public Person(String name){
        this.name = name;
    }
    
    public void eat(){
        System.out.println("The person is eating.");
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
    }
    
}
