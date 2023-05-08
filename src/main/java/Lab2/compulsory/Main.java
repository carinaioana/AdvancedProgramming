package Lab2.compulsory;

/**
 * "location1"
 * "location2"
 * "road" isn't connected with any locations
 * "roadConnected1" and "roadConnected2" are between "location1" and "location2"
 * "roadConnected1" has the "length" >= "distance"
 * "roadConnected2" has the "length" < "distance" => displays error
 */
public class Main {
    public static void main(String[] args) {

        Location location1 = new Location("Iasi", LocationType.CITIES, 71.5, 150.7);
        System.out.println(location1.toString());

        Location location2 = new Location("Vatra-Dornei", LocationType.CITIES, 41.9, 110.74);
        System.out.println(location2.toString());

        Road road = new Road(RoadType.COUNTRY,100,50);
        System.out.println(road.toString());

        Road roadConnected1 = new Road(RoadType.HIGHWAYS,250, 100, location1, location2);
        System.out.println(roadConnected1.toString());

        Road roadConnected2 = new Road(RoadType.HIGHWAYS,2, 100, location1, location2);
        System.out.println(roadConnected2.toString());

    }
}