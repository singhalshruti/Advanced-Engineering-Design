/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Rakesh
 */
public class ConfigureABusiness {
       public static Business configure(){
        
        Business business = Business.getInstance();      
        Network network = business.addNetwork("One Air");        
        Employee employee = business.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount systemAdmin = business.getUserAccountDirectory().createEmployeeUserAccount("sa", "sa", employee, new SystemAdminRole());                
        network.getEnterpriseDirectory().addEnterprise("Customer Enterprise", Enterprise.EnterpriseType.Customer);  
        network.getEnterpriseDirectory().addEnterprise("Airline Enterprise", Enterprise.EnterpriseType.Airline);        

        return business;
    }
    

}
