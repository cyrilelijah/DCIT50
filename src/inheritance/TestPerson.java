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
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Karen");
//        System.out.println(person);
        Person person2 = new Person("Ella", 16);
//        System.out.println(person2);
        Person person3 = new Person("Rafael", 19, "Male", "Single", 5.4, 40, "Trece");
        System.out.println(person3);
        
    }
}
