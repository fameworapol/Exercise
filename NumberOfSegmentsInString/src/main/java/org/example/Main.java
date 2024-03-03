package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public static int countSegments(String s) {
        int result= 0;
        String[] sSplit = s.split(" ");
        for (int i = 0; i < sSplit.length; i++) {
            if (!sSplit[i].trim().isEmpty()){
                result+=1;
            }
        }
        return result;
    }
}