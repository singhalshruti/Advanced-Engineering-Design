/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer.mConnect;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rakesh
 */
public class Discussion implements Comparable{

    private String comments;
    private UserAccount addedBy;
    private Date addedOn;
    private int agreeCounter = 0;
    private int disagreeCounter = 0;
    private ArrayList<UserAccount> agreedUsers;
    private ArrayList<UserAccount> disagreedUsers;

    public Discussion() {
        agreedUsers = new ArrayList<>();
        disagreedUsers = new ArrayList<>();
        addedOn = new Date();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public UserAccount getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(UserAccount addedBy) {
        this.addedBy = addedBy;
    }

    public Date getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

    public int getAgreeCounter() {
        return agreeCounter;
    }

    public void setAgreeCounter(int agreeCounter) {
        this.agreeCounter = agreeCounter;
    }

    public int getDisagreeCounter() {
        return disagreeCounter;
    }

    public void setDisagreeCounter(int disagreeCounter) {
        this.disagreeCounter = disagreeCounter;
    }

    public ArrayList<UserAccount> getAcknowledgedUsers() {
        return agreedUsers;
    }

    public void setAcknowledgedUsers(ArrayList<UserAccount> acknowledgedUsers) {
        this.agreedUsers = acknowledgedUsers;
    }

    public boolean incrementAggreeCounter(UserAccount ua) {
        if ((!disagreedUsers.contains(ua)) && (!agreedUsers.contains(ua))) {
            agreeCounter++;
            agreedUsers.add(ua);
            return true;
        }
        return false;
    }

    public boolean incrementDisagreeCounter(UserAccount ua) {
        if ((!disagreedUsers.contains(ua)) && (!agreedUsers.contains(ua))) {
            disagreeCounter++;
            disagreedUsers.add(ua);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.comments;
    }
    
     public int compareTo(Object o) {        
        Date date = ((Discussion)o).getAddedOn();
        return date.compareTo(this.getAddedOn());        
    }
}
