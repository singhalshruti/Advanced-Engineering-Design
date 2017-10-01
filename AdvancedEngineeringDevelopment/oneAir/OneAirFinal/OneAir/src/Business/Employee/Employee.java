/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;


import Business.Person.Person;

public class Employee extends Person implements Comparable{

    //private Person person;
    private String name;
    private int id;
    
    private static int count = 1;

    public Employee() {
        id = count;
        count++;  
       // person = new Person();
    }

    /*public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }*/

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        
        return (getFirstName() != null ?getFirstName() : "") + " "  + (getLastName() != null ? getLastName() : "");
    }
    
    public int compareTo(Object o) {
        String n = ((Employee) o).getName();
        return this.getName().toLowerCase().compareTo(n.toLowerCase());
    }
}
