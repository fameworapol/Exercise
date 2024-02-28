import java.util.HashMap;

public class VerifyingAnAlienDictionary {
    public static void main(String[] args) {
        String[] words = { "apple","app" };
        String order = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words, order));
        ;
    }

    public static boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }
        int sumTemp = 0;
        int sumTempFirst = 0;
        boolean isSortedFirst = true;
        boolean isSortedSize = true;
        boolean result = false;
        for (int i = 0; i < words.length; i++) {
            int sumWord = 0;
            String word = words[i];
            if (word.charAt(0) < sumTempFirst) {
                isSortedFirst = false;
            }else if (word.charAt(0) == sumTempFirst) {
                isSortedFirst = secondMoreThanFirst(words[i-1],word,orderMap);
            }
            sumTempFirst = word.charAt(0);
            for (int j = 0; j < word.length(); j++) {
                sumWord += orderMap.get(word.charAt(j));
            }
            System.out.println(sumWord);
            if (sumWord < sumTemp) {
                isSortedSize = false;
            }
            sumTemp = sumWord;
        }
        if (isSortedFirst) {
            result = true;
        }


        return result;
    }

    public static boolean secondMoreThanFirst(String first,String second,HashMap<Character,Integer> orderMap){
        System.out.println("first : "+first+" , second : "+second);
        for (int i = 0; i < first.length(); i++) {
            int firstIndex = orderMap.get(first.charAt(i));
            int secondIndex = orderMap.get(second.charAt(i));
            if (firstIndex > secondIndex) {
                return false;
            }
        }
        return false;
    }
}
