/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;


import Business.Role.AccountingManagerRole;

import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


public class AccountingOrganization extends Organization{
    
  // private WorkQueue requestInformation;
    
    public AccountingOrganization(String name) {
        super(Organization.Type.Accounting.getValue(), name);
       // requestInformation = new WorkQueue();
    }
@Override
    public ArrayList<Role> getSupportedRole() {
        //The roles required to support the account organization is defined here
        ArrayList<Role> roles = new ArrayList<>();
        //roles.add(new AdminRole());
        roles.add(new AccountingManagerRole());
        
        return roles;
    }
    
    @Override
    public String toString() {
        return super.getName();
    }

}
