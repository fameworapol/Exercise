package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseBits("00000010100101000001111010011100"));
    }

    public static  int reverseBits(String x) {
        int n = Integer.parseInt(x);
        String data = Integer.toString(n);
        int testCaseInt = Integer.parseInt(data,2);
        String testCase = Integer.toString(testCaseInt);
        String reverseStr = "";
        for (int i = data.length()-1; i >= 0; i--) {
            reverseStr += Character.toString(data.charAt(i));
        }
        System.out.println(reverseStr);
        int result = Integer.parseInt(reverseStr,2);
        return result;
    }
}