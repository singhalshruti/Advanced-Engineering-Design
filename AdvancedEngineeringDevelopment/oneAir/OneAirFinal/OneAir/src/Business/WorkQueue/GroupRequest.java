/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.mConnect.Group;



public class GroupRequest extends WorkRequest {

    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    
    
    @Override
    public String toString() {
        return group.getGroupName();
    }
}
