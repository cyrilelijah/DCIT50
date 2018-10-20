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
public class Company {
    private String name;
    private Person owner;
    private Employee[] employees;
    private Address address;

    public Company(String name, Person owner, Employee[] employees, Address address) {
        this.name = name;
        this.owner = owner;
        this.employees = employees;
        this.address = address;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //for each employee in employees
//        for (Employee employee : employees) {
//            sb.append(employees[i].name).append("\n");
//        }
        //normal for loop
        for (int i=0; i<employees.length; i++) {
            sb.append(employees[i].name).append("\n");
        }
        return "Name: " + name + "\nOwner:\n" + owner + "" +
                "\nEmployees: " + sb + 
                "\nCompany Address: " + address;
    }
    
    
}
