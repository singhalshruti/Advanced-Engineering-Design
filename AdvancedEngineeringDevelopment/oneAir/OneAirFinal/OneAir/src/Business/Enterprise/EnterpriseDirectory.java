/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Rakesh
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type.getValue().equals(Enterprise.EnterpriseType.Airline.getValue())) {
            enterprise = new AirlineEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type.getValue().equals(Enterprise.EnterpriseType.Customer.getValue())) {
            enterprise = new CustomerEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public void deleteEnterprise(Enterprise enterprise) {
        enterpriseList.remove(enterprise);
    }
}
