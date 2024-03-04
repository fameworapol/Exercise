package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(hammingDistance(4,14));
    }

    public static int hammingDistance(int x, int y) {
        String xBit = Integer.toBinaryString(x);
        String yBit = Integer.toBinaryString(y);
        int size = Math.max(yBit.length(),xBit.length());
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (i+1 > xBit.length()){
                for (int j = i; j < yBit.length(); j++) {
                    if (yBit.charAt(i) == '1'){
                        result ++;
                    }
                }
                return result;
            } else if (i+1 > yBit.length()) {
                for (int j = i; j < xBit.length(); j++) {
                    if (yBit.charAt(i) == '1'){
                        result ++;
                    }
                }
                return result;
            }
            if (xBit.charAt(i) == yBit.charAt(i)){
                continue;
            }
            if (xBit.charAt(i) != yBit.charAt(i)){
                result ++;
            }
        }
        return result;
    }

    public static String toBinary(int num) {
        StringBuilder result = new StringBuilder();
        while (num > 0){
            int fraction = num%2;
            result.append(fraction);
            num = num/2;
        }

        return result.reverse().toString();
    }
}