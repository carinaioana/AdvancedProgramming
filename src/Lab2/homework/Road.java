package Lab2.homework;

public class Road {
    RoadType type;
    int length;
    int speedLimit;
    Location location1;
    Location location2;
    public Road(){
    }
    /**
     *
     * @param type - the type of the road from enum class RoadType
     * @param length - the length of the road
     * @param speedLimit - the speed limit on that road
     * @param location1 - the start point of the road
     * @param location2 - the end point of the road
     * @throws Error - if the length is < that the distance between "location1" and "location2"
     * location1 has x1,y1 coordinates
     * location2 has x2,y2 coordinates
     * distance is calculated by using a formula
     */
    public Road(RoadType type, int length, int speedLimit, Location location1, Location location2) throws Error{
        this.type = type;
        this.speedLimit = speedLimit;
        this.location1 = location1;
        this.location2 = location2;

        double x1 = location1.getX();
        double y1 = location1.getY();
        double x2 = location2.getX();
        double y2 = location2.getY();

        double distance = Math.sqrt(Math.pow(y1-x1,2) + Math.pow(y2-x2,2) );
        if (length >= distance)
            this.length = length;
        else throw new Error("The length of a road should not be less than the euclidian distance between the location coordinates.");
    }

    /**
     * generate setters and getters
     */
    public RoadType getType() {
        return type;
    }
    public void setType(RoadType type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    /**
     *generate to string function
     */
    @Override
    public String toString() {
        return "Road{" +
                "type=" + type +
                ", length=" + length +
                ", speedLimit=" + speedLimit +
                ", location1=" + location1 +
                ", location2=" + location2 +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof Road)){
            return false;
        }
        Road r = (Road) obj;
        return location1.equals(r.location1) && location2.equals(r.location2);
    }
}
