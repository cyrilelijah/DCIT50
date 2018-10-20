/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HasARelationship;

/**
 *
 * @author Cyril
 */
public class Person {
    protected String name;
    protected int age;
    protected Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age+
                "\nAddress: " + ""+ address + "";
    }
}
