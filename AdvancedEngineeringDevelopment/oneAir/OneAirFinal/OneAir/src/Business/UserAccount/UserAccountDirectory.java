/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Business;
import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;


public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;
    

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua: userAccountList) {
            if (ua.getUsername().equals(username)&& ua.getPassword().equals(password)) 
            {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createEmployeeUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createCustomerUserAccount(String username, String password, Customer customer, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCustomer(customer);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean isAccountAvailable(String username, Business business) {
        for (UserAccount ua : business.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getUsername().equalsIgnoreCase(username)) {
                return false;
            }
        }
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(username)) {
                        return false;
                    }
                }
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(username)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }


    public void deleteUserAccount(UserAccount userAccount) {
        userAccountList.remove(userAccount);
    }
}
