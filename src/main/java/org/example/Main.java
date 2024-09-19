package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    public static double sum()
    {
        double result = 0.0;
        int n = 2;
        double a = 1.0;

        do {
            a = 1.0/(n*n + n - 2.0);
            result+= a;
            n++;
        }
        while (a > Math.pow(10, -6));

        return result;
    }

}