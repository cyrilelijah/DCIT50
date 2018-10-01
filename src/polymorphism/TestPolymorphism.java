/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Cyril
 */
public class TestPolymorphism {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.eat();
//        s.breath();
//        Person p = new Student();//Upcasting or dynamic binding
//        System.out.println("Run time");
//        p.eat();
//        
//        Student s = (Student) p;//Downcasting or static binding
//        System.out.println("Compile time");
//        s.eat();
//        int arr[] = {1,2,3};//array recap
//        int arr1[] = new int[4];
//        System.out.println(arr.length);
        Person persons[] = {new Student(), new Dancer(), new Vendor(), 
            new Programmer(), new Teacher(), new Singer()};
//        for (int i = 0; i < p.length; i++) {
//            p[i].eat();
//        }
        
        for (Person person : persons) {//for each loop
            person.eat();
            person.cleanTheClassroom();
        }
//      or
//        Person p[] = new Person[3];
//        p[0] =  new Dancer();
//        p[1] =  new Singer();
//        p[2] =  new Dancer();
//        p[3].eat();
    }
}
