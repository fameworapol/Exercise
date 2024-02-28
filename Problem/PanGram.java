package Problem;

import java.util.HashMap;

public class PanGram {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    public static String pangrams(String s) {
        String allAplphabet = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // Add all character to hashMap
        for (int i = 0; i < allAplphabet.length(); i++) {
            hashMap.put(allAplphabet.charAt(i), 1);
        }

        // Check all character is in s
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(Character.toLowerCase(s.charAt(i)))
                    && hashMap.get(Character.toLowerCase(s.charAt(i))) > 0) {
                hashMap.put(Character.toLowerCase(s.charAt(i)), 0);
            }
        }

        // Check is pangram
        for (int i = 0; i < allAplphabet.length(); i++) {
            if (hashMap.get(allAplphabet.charAt(i)) > 0) {
                return "not pangram";
            }
        }
        // Write your code here
        return "pangram";
    }
}
