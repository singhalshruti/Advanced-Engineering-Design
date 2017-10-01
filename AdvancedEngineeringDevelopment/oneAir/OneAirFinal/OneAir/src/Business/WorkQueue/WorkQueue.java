/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;


public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private int counter = 1;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    public void deleteWorkRequest(WorkRequest wr){
        workRequestList.remove(wr);
    }
    
    public int getNextCounter(){
        return counter++;
    }
    
    
}