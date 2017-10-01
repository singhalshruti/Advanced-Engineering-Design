/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class WorkRequest {

    private String requestType;
    private String comments;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String requestDate;
    private String resolveDate;
    private static int count=0;
    private int workRequestId;

    public enum RequestCategory {

        DiscountRequest("Discount Request"),
        FareRequest("Fare Request"),
        RouteRequest("Route Request"),
        CustomerServiceRequest("CustomerServiceRequest")
        ;
        private String value;

        private RequestCategory(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public enum OrderStatus {
        Processing("Processing"),
        Review("Review"),
        Approved("Approved"),
        Disapproved("Disapproved");
        private String value;

        private OrderStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

  
    
 

    public WorkRequest() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        requestDate = dateFormat.format(new Date());
        count++;
        workRequestId=count;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

   
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(String resolveDate) {
        this.resolveDate = resolveDate;
    }

    public int getWorkRequestId() {
        return workRequestId;
    }

    public void setWorkRequestId(int workRequestId) {
        this.workRequestId = workRequestId;
    }
    
    @Override
    public String toString(){
        return String.valueOf(workRequestId);
    }
    
}
