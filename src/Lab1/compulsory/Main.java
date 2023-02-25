package Lab1.compulsory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int res = (int) (Math.random() * 1_000_000);
        System.out.println(res);
        res = res * 3;
        res = res+0b10101; //add binary to decimal
        res = res+0xFF; //add hexa to decimal
        res *= 6; //multiply by 6
        //sum of digits
        int sum = 0;
        while(res > 0) {
            sum = sum + res%10;
            res = res/10;
        }
        while(sum > 9) {
            int aux = sum;
            int suma1 = 0;
            while(aux > 0){
                suma1 = suma1 + aux%10;
                aux = aux/10;
            }
            sum = suma1;
        }
        System.out.println( "Willy-nilly, this semester I will learn " + languages[sum]);
        //prints java
    }
}