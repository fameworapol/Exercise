package Problem;

import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public static boolean isAnagram2(String s, String t) {
        Map<Character, Character> Hashtable = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            if(!Hashtable.containsKey(schar)){
                Hashtable.put(schar, 's');
            }
            if (!Hashtable.containsKey(tchar)) {
                Hashtable.put(tchar, 't');
            }

            if((Hashtable.containsKey(schar) && Hashtable.get(schar)=='t')){
                Hashtable.remove(schar);
            }
            if((Hashtable.containsKey(schar) && Hashtable.get(schar)=='s')){
                Hashtable.remove(schar);
            }


            if(Hashtable.containsKey(tchar) && Hashtable.get(tchar)=='s'){
                Hashtable.remove(tchar);
            }
            if(Hashtable.containsKey(tchar) && Hashtable.get(tchar)=='t'){
                Hashtable.remove(tchar);
            }
            
        }
        if (Hashtable.isEmpty()) {
            return true;
        }
        return false;
    }
    //HashMap ทำเอง
    public static boolean isAnagram1(String s, String t) {
        if(s.equals(t)){
            return true;
        }
        Map<Character, Integer> Hashtable = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(Hashtable.containsKey(schar)){
                Hashtable.put(schar, Hashtable.get(schar)+1);
                if (Hashtable.get(schar)==0) {
                    Hashtable.remove(schar);
                }
            }
            if (Hashtable.containsKey(tchar)) {
                Hashtable.put(tchar, Hashtable.get(tchar)-1);
                if (Hashtable.get(tchar)==0) {
                    Hashtable.remove(tchar);
                }
            }

            if(i<1){
                if(!Hashtable.containsKey(schar)){
                    Hashtable.put(schar, 1);
                }if(!Hashtable.containsKey(tchar)) {
                    Hashtable.put(tchar, -1);
                }
                
            }
        }
        if (Hashtable.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>(); // character frequency map
        // populate map with frequency of characters in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // compare character frequency map of t with s
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) { // character not found in s
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
