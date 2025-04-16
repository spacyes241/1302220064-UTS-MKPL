/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculator;

/**
 *
 * @author Farrel Haykal
 */
public class PersonalInfo {
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;

    public PersonalInfo(String firstName, String lastName, String idNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
    }
}
