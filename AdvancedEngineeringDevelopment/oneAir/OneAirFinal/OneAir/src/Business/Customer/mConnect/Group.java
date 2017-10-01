 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer.mConnect;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;


public class Group implements Comparable {

    private UserAccount groupAdmin;
    private Organization organization;
    private Date createdDate;
    private int groupId;
    private ArrayList<UserAccount> groupUsers;
    private boolean isOpen;
    private String groupName;
    private ArrayList<DiscussionThread> discussionThread;

    public Group(int i) {
        discussionThread = new ArrayList<>();
        groupUsers = new ArrayList<>();
        groupId = i;
        createdDate = new Date();
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public UserAccount getGroupAdmin() {
        return groupAdmin;
    }

    public void setGroupAdmin(UserAccount groupAdmin) {
        this.groupAdmin = groupAdmin;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public ArrayList<UserAccount> getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(ArrayList<UserAccount> groupUsers) {
        this.groupUsers = groupUsers;
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public ArrayList<DiscussionThread> getDiscussionThread() {
        return discussionThread;
    }

    public void setDiscussionThread(ArrayList<DiscussionThread> discussionThread) {
        this.discussionThread = discussionThread;
    }

    public DiscussionThread addThread() {
        DiscussionThread thread = new DiscussionThread();
        discussionThread.add(thread);
        return thread;
    }

    public void removeThread(DiscussionThread thread) {
        discussionThread.remove(thread);
    }
    
    public void incrementNotificationCounter(){
        for(UserAccount ua : this.getGroupUsers()){
            ua.incrementmConnectNotification();
        }
    }

    @Override
    public String toString() {
        return this.groupName;
    }

    public int compareTo(Object o) {
        String n = ((Group) o).getGroupName();
        return this.getGroupName().toLowerCase().compareTo(n.toLowerCase());
    }

}
