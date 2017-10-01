/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.FlightDetails.FlightDirectory;
import Business.FlightDetails.RouteDirectory;
import Business.FlightDetails.ScheduledJourneyDirectory;
import Business.Person.ContactDetails;
import Business.Role.Role;

import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


public abstract class Organization {

    private String organizationType;
    private String name;
    private String description;
    private ContactDetails contactDetails;
    private WorkQueue workQueue;    
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private RouteDirectory routeDirectory;
    private FlightDirectory flghtDirectory;
    private ScheduledJourneyDirectory scheduledJourneyDirectory;
    private int organizationID;
    private static int counter;

    public enum Type {

        Admin("Admin Organization")
        , CustomerService("Customer Service Organization")
        , Inventory("Inventory Organization")
        , Accounting("Accounting Organization")
        ;
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    public Organization(String type, String name) {
        this.organizationType = type;
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        contactDetails = new ContactDetails();
        routeDirectory = new RouteDirectory();
        flghtDirectory = new FlightDirectory();
        organizationID = counter;
        ++counter;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public RouteDirectory getRouteDirectory() {
        return routeDirectory;
    }

    public void setRouteDirectory(RouteDirectory routeDirectory) {
        this.routeDirectory = routeDirectory;
    }

    public FlightDirectory getFlghtDirectory() {
        return flghtDirectory;
    }

    public void setFlghtDirectory(FlightDirectory flghtDirectory) {
        this.flghtDirectory = flghtDirectory;
    }

    public ScheduledJourneyDirectory getScheduledJourneyDirectory() {
        return scheduledJourneyDirectory;
    }

    public void setScheduledJourneyDirectory(ScheduledJourneyDirectory scheduledJourneyDirectory) {
        this.scheduledJourneyDirectory = scheduledJourneyDirectory;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getOrganizationType() {
        return organizationType;
    }


    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return name;
    }

}
