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
public class TestAbstraction {
    public static void main(String[] args) {
        Person p = new Student("Rafael", 12, "Trece");
        System.out.println(p);
        p.sleep();
        p.walk();
    }
}
