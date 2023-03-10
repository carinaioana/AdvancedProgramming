package Lab2.homework;

public class GasStations extends Location{
    int gasPrice;

    public GasStations(String name, double x, double y, int gasPrice) {
        super(name, x, y);
        this.gasPrice = gasPrice;
    }

    public int getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(int gasPrice) {
        this.gasPrice = gasPrice;
    }

    @Override
    public String toString() {
        return "GasStations{" +
                "gasPrice=" + gasPrice +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
