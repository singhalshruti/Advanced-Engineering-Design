/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Inventory.Staff.InventoryStaffWorkAreaJPanel;
import javax.swing.JPanel;


public class InventoryStaffRole extends Role{

    public InventoryStaffRole() {
        super(Role.RoleType.InventoryStaff.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Business business) {
        return new InventoryStaffWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    
}
