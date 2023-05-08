package Lab3.homework;

import java.util.Map;

public class Programmer extends Person{
    private String favouriteLanguage;
    public Programmer(String name, String birthDate, String favouriteLanguage) {
        super(name, birthDate);
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }


    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }
}
