package Problem;
import java.util.*;

public class ReverseVowelsofaString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
    }

    public static String reverseVowels(String s) {
        //Prepare Character
        String vowel = "aeiou";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < vowel.length(); i++) {
            hashMap.put(vowel.charAt(i), i);
        }
        List<Integer> index = new ArrayList<>();
        List<Character> value = new ArrayList<>();
        // check has vowel
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(Character.toLowerCase(s.charAt(i)))) {
                index.add(i);
                value.add(s.charAt(i));
            }
        }
        // reverse vowel
        List<Character> reverseValue = new ArrayList<>();
        for (int i = value.size()-1; i >= 0  ; i--) {
            reverseValue.add(value.get(i));
        }
        // assign reverse to string
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < index.size(); i++) {
            result.setCharAt(index.get(i), reverseValue.get(i));
        }
        return result.toString();
    }
}
