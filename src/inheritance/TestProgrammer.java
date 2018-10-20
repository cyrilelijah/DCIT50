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
public class TestProgrammer {
    public static void main(String[] args) {
        String skills[] = new String[3];
        skills[0] = "";
        Programmer programmer = new Programmer("Elmer");
        System.out.println(programmer);
        programmer.eat();
        programmer.sleep();
        
    }
}
