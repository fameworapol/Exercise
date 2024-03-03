package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int result = 0;
        // sort array
        Arrays.sort(g);
        Arrays.sort(s);
        // initial pointer
        for (int child : g ){
            for (int cookie : s){
                if (cookie == child){
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}