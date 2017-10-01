/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightDetails;

import java.util.ArrayList;

/**
 *
 * @author Rakesh
 */
public class RouteDirectory {
    private ArrayList<Route> listOfRoute;

    public RouteDirectory() {
        listOfRoute=new ArrayList<>();                
    }

    public ArrayList<Route> getListOfRoute() {
        return listOfRoute;
    }

    public void setListOfRoute(ArrayList<Route> listOfRoute) {
        this.listOfRoute = listOfRoute;
    }
    
     
    
    public void removeRoute(Route r){
        listOfRoute.remove(r);
    }
    
    public Route searchRoute(int id)
    {
        for (Route r :listOfRoute)
            if(r.getRouteId()==id)
            {
                return r;
            }
        return null;
    }
    
     public Route addRoute(Route route) {        
        listOfRoute.add(route);
        return route;
    }
}
