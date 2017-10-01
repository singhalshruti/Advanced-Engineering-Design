/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.FlightDetails.Route;

/**
 *
 * @author Rakesh
 */
public class RouteRequest extends WorkRequest{
    private Route route;
    private Customer customer;
    private String source;
    private String destination;
    private String routeCategory;
   

    public RouteRequest() {
        route=new Route();
        customer=new Customer();
        
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRouteCategory() {
        return routeCategory;
    }

    public void setRouteCategory(String routeCategory) {
        this.routeCategory = routeCategory;
    }

    @Override
    public String toString() {
        return super.getRequestType(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
