/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.FlightDetails.Flight;
import Business.Person.Person;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

public class Customer extends Person implements Comparable{
    private Person person;
    private String name;
    private WorkQueue workQueue;
    private int id;
    private Boolean shareInfo = false;
    private ArrayList<CustomerBookings> listOfBookings;
    private int credits=0;
    
    private static int count = 1;

    public Customer() {
        id = count;
        count++;
        person = new Person();
        listOfBookings=new ArrayList<>();
    }

    public ArrayList<CustomerBookings> getListOfBookings() {
        return listOfBookings;
    }

    public void setListOfBookings(ArrayList<CustomerBookings> listOfBookings) {
        this.listOfBookings = listOfBookings;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
      public Boolean isShareInfo() {
        return shareInfo;
    }

    public void setShareInfo(Boolean shareInfo) {
        this.shareInfo = shareInfo;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        
        return (getFirstName() != null ? getFirstName() : "") + " "  + (getLastName() != null ? getLastName() : "");
    }
    public int compareTo(Object o) {
        String n = ((Customer) o).getName();
        return this.getName().toLowerCase().compareTo(n.toLowerCase());
    }
    
}
