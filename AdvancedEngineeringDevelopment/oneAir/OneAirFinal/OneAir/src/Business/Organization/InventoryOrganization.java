/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.InventoryManagerRole;
import Business.Role.InventoryStaffRole;
import Business.Role.Role;
import java.util.ArrayList;


public class InventoryOrganization extends Organization{
    public InventoryOrganization(String name) {
        super(Organization.Type.Inventory.getValue(), name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        // The roles required to support the pharmaceutical organization is defined here
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        roles.add(new InventoryManagerRole());
        roles.add(new InventoryStaffRole());
        return roles;
    }
    
    @Override
    public String toString() {
        return super.getName();
    }
}
