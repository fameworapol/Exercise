package org.example;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(findTheDifference("aa","a"));
    }

    public static  char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }else {
                hashMap.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (hashMap.containsKey(t.charAt(i))){
                hashMap.put(t.charAt(i),hashMap.get(t.charAt(i))-1);
            }else {
                return t.charAt(i);
            }
        }
        Set<Character> keySets = hashMap.keySet();

        for (Character elm:
             keySets) {
            if (hashMap.get(elm)!=0){
                return elm;
            }
        }
        return 'A';
    }
}