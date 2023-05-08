package Lab3.homework;

import java.util.Map;

public class Designer extends Person {
    int noOfFashionShows;

    public int getNoOfFashionShows() {
        return noOfFashionShows;
    }

    public Designer(String name, String birthDate, int fashionShows) {
        super(name, birthDate);
        this.noOfFashionShows = fashionShows;
    }
}
