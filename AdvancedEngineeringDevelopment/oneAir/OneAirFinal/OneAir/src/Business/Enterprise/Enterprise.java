/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private WorkQueue workQueue;

    public Enterprise(String name, EnterpriseType type) {
        super(String.valueOf(type), name);
        this.organizationDirectory = new OrganizationDirectory();
        this.enterpriseType = type;
        workQueue=new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public abstract ArrayList<Organization> getSupportedOrganization();

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public enum EnterpriseType {

        Airline("Airline"), Customer("Customer");
        private String value;

        private EnterpriseType(String value) {
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
}
