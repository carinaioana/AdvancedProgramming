package Lab2.homework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Problem {
    private ArrayList<Location> locations = new ArrayList<>();
    private ArrayList<Road> roads = new ArrayList<>();


    public ArrayList<Location> getLocations() {
        return locations;
    }

    public ArrayList<Road> getRoads() {
        return roads;
    }

    /**
     *
     * @param l - everytime I add a new location, will verify if it is different from all the elements in the list
     */
    public void setLocations(Location l) {
        for(int i = 0; i < locations.size(); i++) {
            if (l.equals(locations.get(i))) {
                System.out.println("Error at adding new location");
                return;
            }
        }
        locations.add(l);
    }

    public void setRoads(Road r) {
        for(int i = 0; i < roads.size(); i++){
            if(r.equals(roads.get(i))){
                System.out.println("Error at adding new road");
                return;
            }
        }
        roads.add(r);
    }
    /**
     * check if roads_array_list is not empty and locations_array_list has at least 2
     * because a road is between 2 locations
     */
    public void validInstanceProblem(){
        if(roads.isEmpty() && locations.size() <= 2){
            System.out.println("Invalid instance");
            return;
        }
        else System.out.println("Valid instance");
    }

    /**
     *
     * @param l1 - we need to find if there is a road between l1 and l2
     * @param l2
     * @return
     * first, I check where there is l1 as a start location in a road & initialize location2 from that road with departure
     * then, I check whether that departure is found in the road list of locations1
     * if it is equal with the l2 I am searching for I return false
     * else, I continue with the process
     */
    public boolean CheckConnection(Location l1, Location l2) {
        //Implement an algorithm for determining if it is possible to go from one location to another using the given roads.
        System.out.println("Is it a connection between "+ l1.name+ " and "+ l2.name + " ?");
        Location departure = null;
        for(int i = 0; i < roads.size(); i++){
            if(l1.equals(roads.get(i).location1)){
                departure = roads.get(i).location2;
            }
        }
        for(int i = 0 ;i < roads.size(); i++){
            if(departure.equals(roads.get(i).location1)){
                departure = roads.get(i).location2;
            }
            else if(departure == l2)
                return true;
        }
        for(int i = 0 ;i < roads.size(); i++){
            if(departure.equals(roads.get(i).location1)){
                departure = roads.get(i).location2;
            }
            else if(departure == l2)
                return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Problem{" +
                "locations=" + locations +
                ", roads=" + roads +
                '}';
    }

}
