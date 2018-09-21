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
public class Student extends Person{
    private String course;
    private int studenNo;
    
    public Student(String name, int age, String gender, String civilStatus, double height, double weight, String address, String course, int studenNo) {
        super(name, age, gender, civilStatus, height, weight, address);
        this.course = course;
        this.studenNo = studenNo;
    }

    public Student(String name, int studenNo, String course) {
//        super(name);
        System.out.println("Constructing a student");
        this.name = name;
        this.course = course;
        this.studenNo = studenNo;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nCourse: " + course + "\nStudent no:" + studenNo;
    }
    
    @Override
    public void walk(){
        System.out.println("The student is walking");
    }

    @Override
    public void eat() {
        System.out.println("The student is eating");
    }
    
    
    
}
