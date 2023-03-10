package Lab2.homework;

import Lab2.compulsory.LocationType;

public abstract class Location {
   protected String name;
   protected double x;
   protected double y;

    public Location(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object obj) {
        if ( obj == this ) return true;
        if ( !( obj instanceof Location ) ) return false;
        Location l = (Location) obj;
        return x == l.x && y == l.y;
    }

}
