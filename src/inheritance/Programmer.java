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
public class Programmer extends Person {
    String skills[];
    
    public Programmer(String name) {
        super(name);
    }

    public Programmer(String name, String[] skills) {
        super(name);
        this.skills = skills;
    }
    
    @Override
    public String toString() {
        return "Name: " + name;
    }

    @Override
    public void eat() {
        System.out.println(name+" is eating codes");
    }

    @Override
    public void sleep() {
        System.out.println(name+" is not sleeping");
    }
    
}
