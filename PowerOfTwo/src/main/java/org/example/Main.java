package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {
        double i = 0;
        double twoPower = 0;
        while (twoPower<n){
            twoPower = Math.pow(2,i);
            if (twoPower==n){
                return true;
            }
            i++;
        }
        return false;
    }
}