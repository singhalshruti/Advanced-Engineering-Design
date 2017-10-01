/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Tips;

import java.util.Date;

/**
 *
 * @author Rakesh
 */
public class Tip implements Comparable{

    private String description;
    private Date addedDate;
    
    public Tip(){
        addedDate = new Date();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
    
    

    

    @Override
    public String toString() {
        return this.getDescription();
    }

    public int compareTo(Object o) {        
        Date date = ((Tip)o).getAddedDate();
        return date.compareTo(this.getAddedDate());        
    }
}
