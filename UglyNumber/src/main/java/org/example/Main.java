package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isUgly(2));
        System.out.println(6%2);
    }

    public static  boolean isUgly(int n) {
        n = Math.abs(n);
        int[] primeNumber = {2,3,5};
        if (n==1){
            return true;
        }
        int current = n;
        List<Integer> prime = new ArrayList<>();
        boolean stop = false;
        while (stop == false){
            for (int i = 0; i < primeNumber.length; i++) {
                if (current % primeNumber[i] != 0){
                    if (i==2){
                        break;
                    }
                    continue;
                }else {
                    current/=primeNumber[i];
                    prime.add(primeNumber[i]);
                    break;
                }

            }
            if (current == 2 || current == 3 || current == 5){
                prime.add(current);
                stop = true;
            }

            if ((current%2 != 0 && current%3 !=0) && current%5!=0){
                prime.add(current);
                stop = true;
            }

            if (current==1){
                break;
            }
        }
        System.out.println(prime);
        for (int i = 0; i < prime.size(); i++) {
            if (prime.get(i) == 2 || prime.get(i) == 3 || prime.get(i) == 5 || prime.get(i) == 1){
                continue;
            }else {
                return false;
            }
        }

        return true;
    }

    public static  boolean isUglys(int n) {
        int[] primeNumber = {2,3,5};
        return false;
    }
}