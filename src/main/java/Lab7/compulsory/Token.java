package Lab7.compulsory;

public class Token {
    private final int number;
//constructor

    public Token(int number) {
        this.number = number;
    }

//getters

    public int getNumber() {
        return number;
    }

//toString

    @Override
    public String toString() {
        return "Token{" +
                "number=" + number +
                '}';
    }
}
