package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
    }

    public static int marsExploration(String s) {
        // Write your code here
        int result = 0;
        String sos = "";
        for (int i = 0; i < s.length(); i+=3) {
            sos+="SOS";
        }

        for (int i = 0; i < sos.length(); i++) {
            if (sos.charAt(i) != s.charAt(i)){
                result += 1;
            }
        }
        System.out.println(sos);
        return result;
    }
}