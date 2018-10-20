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
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Rafael", 201610420, "BSCS");
        System.out.println(student);
        student.eat();
//        student.sleep();
        student.walk();
    }
}
