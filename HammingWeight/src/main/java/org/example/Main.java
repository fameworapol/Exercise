package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(hammingWeight("0000000000000000001000010010000000"));
    }

    public static int hammingWeight(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '1'){
                count ++;
            }
        }
        return count;
    }
}