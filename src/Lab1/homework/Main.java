package Lab1.homework;

public class Main {
    public static void matrix(int n){
        int m[][] = new int [n][n];
        for(int i = 0;i < n;i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (i + j) % n;
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = args[0];
        int n = Integer.parseInt(s);
    }
}
