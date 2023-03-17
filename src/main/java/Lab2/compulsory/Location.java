package Lab2.compulsory;

import java.util.HashMap;
public class Location {
    String name;
   LocationType type;
    double x;
    double y;
    public Location() {
    }

    /**
     * /
     * @param name -the name of a location
     * @param type - type enum of a location (LocationType)
     * @param x - the coordinates
     * @param y - the coordinates
     */
    public Location(String name, LocationType type, double x, double y) {
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    /**
     * generate setters and getters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * generate to string functions
     */
    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
