package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPatterns("ababababab"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        Boolean result = false;
        for (int i = 1; i <= s.length(); i++) {
            String checkStr = s.substring(0,i);
            if (checkStr.length()+checkStr.length()> s.length()){
                break;
            }
            String nextStr = s.substring(checkStr.length(),checkStr.length()+checkStr.length());
            if (checkStr.equals(nextStr)){
                result = true;
                int start = checkStr.length()*2;
                int size = checkStr.length();
                while (start < s.length()){
                    int end = start+size;
                    if (end > s.length()){
                        end = s.length();
                    }
                    String checkSubStr = s.substring(start,end);
                    if (!checkStr.equals(checkSubStr)){
                        result = false;
                    }
                    start+=size;
                }
            }
            if (result){
                return  true;
            }
        }
        return  result;
    }

    public static boolean repeatedSubstringPatterns(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                StringBuilder pattern = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    pattern.append(s.substring(0, i));
                }
                if (s.equals(pattern.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
}