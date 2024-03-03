package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindromes("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        if (s.length() == 1){
            return 1;
        }
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int result = 0;
        boolean isPlusOne = true;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }else {
                hashMap.put(s.charAt(i),1);
            }
        }
        Set<Character> charSet = hashMap.keySet();
        int maxOdd = 0;
        for (Character item : charSet){
            if (hashMap.get(item) %2 == 0){
                result += hashMap.get(item);
                System.out.println(hashMap.get(item));
            }else {
                if (hashMap.get(item) > maxOdd){
                    maxOdd = hashMap.get(item);
                    if (hashMap.get(item) != 1) {
                        result +=hashMap.get(item)-1;
                    }
                }
            }
        }
        result += maxOdd;
        return result;
    }
//    public static boolean checkPalindrome(String s){
//        for (int i = 0; i < s.length(); i++) {
//            int j = s.length()- i - 1;
//            if (s.charAt(i) != s.charAt(j)){
//                return false;
//            }
//        }
//        return true;
//    }

    public static int longestPalindromes(String s) {
        int length = 0;
        // Create a HashSet...
        HashSet<Character> hset = new HashSet<Character>();
        // Traverse every element through the loop...
        for (int idx = 0; idx < s.length(); idx++) {
            // Convert string to character array...
            char character = s.charAt(idx);
            // If hset contains character already, emove that character & adding 2 to length...
            // It means we get pair of character which is used in palindrome...
            if (hset.contains(character)) {
                length += 2;
                hset.remove(character);
            }
            // Otherwise, add the character to the hashset...
            else {
                hset.add(character);
            }
        }
        // If the size of the set is greater than zero, move length forward...
        if (hset.size() > 0) {
            length ++;
        }
        return length;
    }}