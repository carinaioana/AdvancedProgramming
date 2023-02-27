package Lab1.homework;

import java.sql.SQLOutput;

public class Main {
    public static void display(int m[][],int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                String number = Integer.toString(m[i][j]);
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    public static int[][] matrix(int n){

        int m[][] = new int [n][n];
        for(int i = 0;i < n;i++) {

            for (int j = 0; j < n; j++) {

                m[i][j] = (i + j) % n;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        final long b = System.nanoTime();

        String s = args[0];
        int n = Integer.parseInt(s);
        if (n >= 30000) {
            final long time= System.nanoTime() - b;
            System.out.println(time);
            return;
        }
        int m[][] = matrix(n);
        display(m,n);


    }
}