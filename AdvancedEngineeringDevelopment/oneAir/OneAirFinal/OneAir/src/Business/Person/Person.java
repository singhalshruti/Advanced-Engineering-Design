/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Person {
 
    private String firstName;
    private String middleName;
    private String lastName;
    private Date DOB;
    private ContactDetails contactDetails;
    private String SSN;
    private String sex;
    private String maritalStatus;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getDOBInStringFormat() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            return dateFormat.format(DOB);
        } catch (Exception e) {
            return null;
        }
    }

    public Person() {
        contactDetails = new ContactDetails();
    }
    
    @Override
    public String toString(){
        return this.getFirstName();
    }
}
