/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Customer.mConnect;

public class ThreadSplit {
    private String threadName;
    private int count = 0;

    
    public int getCount() {
        return count;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }   
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public void incrementCounter(){
        this.count ++;
    }
    
}
