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
public class TestCompany {
    public static void main(String[] args) {
        Address ownerAddress = new Address("No Street", "No Barangay", "Indang", "Cavite");
        Address companyAddress = new Address("001 Street", "Barangay 1", "Indang", "Cavite");
        
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Rafael", 0, ownerAddress);
        employees[1] = new Employee("Pedro", 0, ownerAddress);
        employees[2] = new Employee("Julius", 0, ownerAddress);
        
        Person owner = new Person("Cyril", 21, ownerAddress);
        Company company = new Company("OOP", owner, employees, companyAddress);
        System.out.println(company);
    }
}
