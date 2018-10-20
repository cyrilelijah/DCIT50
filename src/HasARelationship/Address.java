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
public class Address {
    protected String street;
    protected String barangay;
    protected String city;
    protected String province;
   
    public Address(String street, String barangay, String city, String province) {
        this.street = street;
        this.barangay = barangay;
        this.city = city;
        this.province = province;
    }

    @Override
    public String toString() {
        return "" + street + ", " + barangay +
            ", " + city + ", " + province;
    }
    
    
}
