package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }

    public static String toHex(int num) {
        HashMap<Integer,Character> hashMap = new HashMap<>();
        String hexStr = "abcdef";
        long val;
        StringBuilder result = new StringBuilder();
        if (num == 0){
            return "0";
        }
        for (int i = 0; i < hexStr.length(); i++) {
            hashMap.put(10+i,hexStr.charAt(i));
        }
        if (num < 0){
            val = (long) (Math.pow(2, 32) + num); // TODO : THIS IS FOR SOLVE MINUS VALUE
        }else {
            val = num;
        }

        while (val > 0){
            Long fraction = val%16;
            if (fraction <= 9){
                result.append(fraction);
            }else {
                result.append(hashMap.get(Integer.parseInt(fraction.toString())));
            }
            val = val/16;
        }
        return result.reverse().toString();
    }

    public static String toHexExample(int num) {
        if (num == 0) {
            return "0";
        }
        long val = num;
        if (num < 0) {
            val = (long) (Math.pow(2, 32) + num);
        }

        StringBuilder res = new StringBuilder();
        while (val != 0) {
            int remainder = (int) (val - (((int) (val / 16)) * 16));
            val = val / 16;
            if (remainder >= 10) {
                res.append((char) (remainder + 87));
            } else {
                res.append(remainder);
            }
        }

        return res.reverse().toString();
    }

    public static String toBinary(int num) {
        StringBuilder result = new StringBuilder();
        while (num > 0){
            int fraction = num%2;
            result.append(fraction);
            num = num/2;
        }
        return result.toString();
    }
}