package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(arrangeCoins(5));
    }

    public static int arrangeCoins(int n) {
        int tempCoin = n;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            tempCoin -= i;
            if (tempCoin < 0){
                break;
            }
            result ++;
        }
        return result;
    }
}