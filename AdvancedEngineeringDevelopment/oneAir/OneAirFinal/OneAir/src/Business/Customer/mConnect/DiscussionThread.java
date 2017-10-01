/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Customer.mConnect;


import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Rakesh
 */
public class DiscussionThread implements Comparable{
    private UserAccount createdBy;
    private Date createdDate;
    private Date lastActivityOn;
    private String threadName;
    private String topic;
    private int agreeCounter = 0;

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
    
    
    
    private ArrayList<UserAccount> acknowledgedUsers;
    private int responseCounter = 0;    
    private ArrayList<Discussion> discussion;
    
    public DiscussionThread(){
        discussion = new ArrayList<>();
        acknowledgedUsers = new ArrayList<>();
        createdDate = new Date();
    }

    public int getAgreeCounter() {
        return agreeCounter;
    }


    public void setAgreeCounter(int agreeCounter) {
        this.agreeCounter = agreeCounter;
    }

    public ArrayList<UserAccount> getAcknowledgedUsers() {
        return acknowledgedUsers;
    }

    public void setAcknowledgedUsers(ArrayList<UserAccount> acknowledgedUsers) {
        this.acknowledgedUsers = acknowledgedUsers;
    }
    
    public void incrementAggreeCounter(UserAccount ua){
        agreeCounter++;
        acknowledgedUsers.add(ua);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public UserAccount getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserAccount createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastActivityOn() {
        return lastActivityOn;
    }

    public void setLastActivityOn(Date lastActivityOn) {
        this.lastActivityOn = lastActivityOn;
    }

    public int getResponseCounter() {
        return responseCounter;
    }

    public void setResponseCounter(int responseCounter) {
        this.responseCounter = responseCounter;
    }

    public ArrayList<Discussion> getDiscussion() {
        return discussion;
    }

    public void setDiscussion(ArrayList<Discussion> discussion) {
        this.discussion = discussion;
    }
    
    public Discussion addComments(){
        ++this.responseCounter ;
        Discussion d = new Discussion();
        discussion.add(d);
        Collections.sort(this.getDiscussion());
        return d;
    }
    
    @Override
    public String toString(){
        return this.getTopic();
    }
    
    public int compareTo(Object o) {
        String n = ((DiscussionThread) o).getTopic();
        return this.getTopic().toLowerCase().compareTo(n.toLowerCase());
    }
}
