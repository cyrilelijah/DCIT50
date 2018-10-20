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
public class TestLab4 {
    public static void main(String[] args) {
        Person p = new Person("Cyril", 21, "Tagaytay");
        System.out.println(p);
        Student s = new Student(201312107, "BSCS", "Cyril", 21, "Tagaytay");
        System.out.println(s);
                
    }
}
