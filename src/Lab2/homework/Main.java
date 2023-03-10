package Lab2.homework;

public class Main {
    public static void main(String args[]) {
        Problem pb = new Problem();

        Location[] sites = new Location[5];
        sites[0] = new Cities("Iasi",150.9, 15.20, 1600);
        sites[1] = new Airports("Otopeni" , 41.9, 110.74, 5);
        sites[2] = new GasStations("OMV", 127.5, 350.6, 7);
        sites[3] = new Cities("Botosani", 1232, 232, 1000);
        sites[4] = new Cities("Roman", 500, 132, 1000);

        Road[] roads = new Road[4];
        roads[0] =  new Road(RoadType.HIGHWAYS,750, 100, sites[0], sites[1]);
        roads[1] =  new Road(RoadType.HIGHWAYS,600, 130, sites[1], sites[2]);
        roads[2] = new Road(RoadType.EXPRESS, 1500, 90, sites[3], sites[4]);
        roads[3] = new Road(RoadType.EXPRESS, 1500, 90, sites[0], sites[2]);


        for(int i = 0;i < sites.length;i++){
            pb.setLocations(sites[i]);
            System.out.println(sites[i]);
        }
        for(int i = 0;i < roads.length;i++){
            pb.setRoads(roads[i]);
            System.out.println(roads[i]);
        }

        System.out.println("Print problem:");
        System.out.println(pb);

        System.out.println(pb.CheckConnection(sites[0],sites[2]));
        System.out.println(pb.CheckConnection(sites[0],sites[3]));

        //Algorithm alg = new DijkstraAlgorithm(pb);

    }
}
