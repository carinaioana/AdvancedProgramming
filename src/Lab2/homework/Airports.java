package Lab2.homework;

public class Airports extends Location{
    int numberOfTerminals;

    /**
     * Airports - derived from Location --> inheritance
     * @param name
     * @param x
     * @param y
     * @param numberOfTerminals
     */
    public Airports(String name, double x, double y, int numberOfTerminals) {
        super(name, x, y);
        this.numberOfTerminals = numberOfTerminals;
    }

    public int getNumberOfTerminals() {
        return numberOfTerminals;
    }

    public void setNumberOfTerminals(int numberOfTerminals) {
        this.numberOfTerminals = numberOfTerminals;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "numberOfTerminals=" + numberOfTerminals +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
