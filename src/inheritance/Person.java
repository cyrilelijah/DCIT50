/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Cyril
 */
public class Person extends Human {
    protected String name;
    protected int age;
    protected String gender;
    protected String civilStatus;
    protected double height;
    protected double weight;
    protected String address;    
    
    public Person() {
        System.out.println("Constructing person");
    }

    public Person(String name, int age, String gender, String civilStatus, double height, double weight, String address) {
        this(name, age);
        this.gender = gender;
        this.civilStatus = civilStatus;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }
            
    public Person(String name) {
        this();
        this.name = name;
    }
    
    public Person(String name, int age){
        this(name);
        this.age = age;
    }
    
    
    public void eat(){
        System.out.println("The person is eating");
    }
    
    public void sleep(){
        System.out.println("The person is sleeping");
    }
    
    public void walk(){
        System.out.println("The person is walking");
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age +
                "\nGender: " + gender + "\nCivil Status: " + 
                civilStatus + "\nHeight: " + height + " ft"+ "\nWeight: " + 
                weight + "kg" + "\nAddress: " + address;
    }
    
    
    
}
