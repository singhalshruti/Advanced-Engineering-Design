/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Customer.mConnect.GroupCatalog;
import Business.Enterprise.EnterpriseDirectory;
import Business.FlightDetails.RouteDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import static Business.Role.Role.RoleType.Customer;
import Business.Role.SystemAdminRole;
import Business.Tips.TipCatalog;
import java.util.ArrayList;

public class Business extends Organization{
    private static Business business;
    private EnterpriseDirectory enterpriseDirectory;
    private GroupCatalog groupCatalog;
    private TipCatalog tipCatalog;
    private ArrayList<Network> networkList;
    private RouteDirectory routeDirectory;
    private Customer customer;
    public Counter counter;
    
     public static Business getInstance(){
        if (business == null){
            business = new Business();
        }
        
        return business;
    }

    public Business() {
        super(null, null);
        networkList = new ArrayList<Network>();
        enterpriseDirectory = new EnterpriseDirectory();
        tipCatalog = new TipCatalog();
        groupCatalog = new GroupCatalog();
        routeDirectory = new RouteDirectory();
        customer=new Customer();
        counter = new Counter();
    }

    public Network addNetwork(String name){
        Network network = new Network();
        network.setName(name);
        networkList.add(network);
        return network;
    }
    
    public boolean isNetworkAvailable(String name){
        for(Network n : networkList){
            if(n.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    public RouteDirectory getRouteDirectory() {
        return routeDirectory;
    }

    public void setRouteDirectory(RouteDirectory routeDirectory) {
        this.routeDirectory = routeDirectory;
    }
    
    public void deleteNetwork(Network network){
        networkList.remove(network);
    }

    public static Business getBusiness() {
        return business;
    }

    public static void setBusiness(Business business) {
        Business.business = business;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public GroupCatalog getGroupCatalog() {
        return groupCatalog;
    }

    public void setGroupCatalog(GroupCatalog groupCatalog) {
        this.groupCatalog = groupCatalog;
    }

    public TipCatalog getTipCatalog() {
        return tipCatalog;
    }

    public void setTipCatalog(TipCatalog tipCatalog) {
        this.tipCatalog = tipCatalog;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
    }
    
}
