package Lab1.homework;

import java.sql.SQLOutput;

public class Main {
    public static void display(int m[][],int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                String number = Integer.toString(m[i][j]);
                System.out.print(number + " "); //display the matrix after converting the numbers to strings
            }
            System.out.println();
        }
    }
    public static int[][] matrix(int n){

        int m[][] = new int [n][n];
        for(int i = 0;i < n;i++) {

            for (int j = 0; j < n; j++) {

                m[i][j] = (i + j) % n; //each value will be different depending on the number of the line and the column
            }
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        final long b = System.nanoTime();

        String s = args[0];
        int n = Integer.parseInt(s);//take the string from terminal and convert it to int

        if (n >= 30000) {
            final long time= System.nanoTime() - b;
            System.out.println(time + "nanoseconds");
            return;
        }/*if the number from console is bigger then prints only the nanoseconds it takes the program to compile */

        int m[][] = matrix(n);
        display(m,n);


    }
}