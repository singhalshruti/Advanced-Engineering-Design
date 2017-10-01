/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightDetails;


public class Route{
  private String source;
  private String destination;
  private int routeId;
  private static int count=0;
  private String routeCategory;
  private String description;

    public Route() {
        count++;
        routeId=count;
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
    
    public void setRouteId(int id) {
        this.routeId = id;
    }

    public int getRouteId() {
        return routeId;
    }

    public String getRouteCategory() {
        return routeCategory;
    }

    public void setRouteCategory(String routeCategory) {
        this.routeCategory = routeCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
     public enum routeCategory {

        Domestic("Domestic"), International("International");
        private String value;

        private routeCategory(String value) {
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
     }

    @Override
    public String toString() {
        return String.valueOf(routeId); //To change body of generated methods, choose Tools | Templates.
    }
     
     

    
     
}
