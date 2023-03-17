package Lab3.homework;

import java.util.Map;

public class CEO extends Person {
    int noOfLambos;

    public int getNoOfLambos() {
        return noOfLambos;
    }

    public CEO(String name, String birthDate, int lambos) {
        super(name, birthDate);
        this.noOfLambos = lambos;
    }
}
