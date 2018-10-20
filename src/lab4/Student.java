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
public class Student extends Person{
    private int studentNo;
    private String course;

    public Student() {
        
    }

    public Student(int studentNo, String course, String name, int age, String address) {
        super(name, age, address);//super constructor
        this.studentNo = studentNo;
        this.course = course;
    }

    @Override
    public void eat() {
        System.out.println("The student is eating.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nCourse: " + course + "\nStudent no: " + studentNo;
    }
    
}
