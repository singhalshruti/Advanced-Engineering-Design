/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;


public class AdminOrganization extends Organization {

    public AdminOrganization(String name) {
        super(Type.Admin.getValue(), name);
    }

     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
    @Override
    public String toString() {
        return super.getName();
    }
    
}
