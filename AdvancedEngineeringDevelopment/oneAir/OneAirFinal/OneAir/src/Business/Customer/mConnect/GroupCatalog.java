/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Customer.mConnect;

import java.util.ArrayList;


public class GroupCatalog {
    private ArrayList<Group> groupList;
    int counter = 1;
    
    private int getNextCounter(){
        return counter++;
    }

    public ArrayList<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(ArrayList<Group> groupList) {
        this.groupList = groupList;
    }
    
    public GroupCatalog(){
        groupList = new ArrayList<>();
    }
    
    public Group addGroup(){
        Group g = new Group(this.getNextCounter());
        groupList.add(g);
        return g;        
    }
    
    public void deleteGroup(Group group){
        groupList.remove(group);
    }
}
