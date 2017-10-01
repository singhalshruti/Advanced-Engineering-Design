/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;
import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Person.Person;
import Business.Role.Role;
import static Business.Role.Role.RoleType.Customer;
import Business.WorkQueue.WorkQueue;

public class UserAccount implements Comparable{
    
    private String username;
    private String password;
    private Person person;
    private Employee employee;
    private Customer customer;
    private Role role;
    private String preferredLanguage;
    private WorkQueue workQueue;
    private int adverseEffectNotification = 0;
    private int mconnectNotification = 0;
    private int tipNotification = 0;

    public int getTipNotification() {
        return tipNotification;
    }

    public void setTipNotification(int tipNotification) {
        this.tipNotification = tipNotification;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
        preferredLanguage = "English";
    }
    
    

    public int getAdverseEffectNotification() {
        return adverseEffectNotification;
    }

    public void setAdverseEffectNotification(int adverseEffectNotification) {
        this.adverseEffectNotification = adverseEffectNotification;
    }

    public int getMconnectNotification() {
        return mconnectNotification;
    }

    public void setMconnectNotification(int mconnectNotification) {
        this.mconnectNotification = mconnectNotification;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public void incrementAdverseEffectNotification(){
        adverseEffectNotification++;
    }
    
    public void incrementmConnectNotification(){
        mconnectNotification ++ ;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

   

    public void setRole(Role role) {
        this.role = role;
    }

 
    
    
    @Override
    public String toString() {
        return username;
    }
    
    public int compareTo(Object o) {
        String n = ((UserAccount) o).getPerson().getFirstName();
        return this.getPerson().getFirstName().toLowerCase().compareTo(n.toLowerCase());
    }
    
}