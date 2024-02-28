package Problem;

import java.util.HashMap;;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("aaa", "aa aa aa aa"));
        ;
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hashMap = new HashMap<>();
        String[] sArr = s.split(" ");
        if (sArr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (hashMap.containsKey(pattern.charAt(i))) {
                if (!hashMap.get(pattern.charAt(i)).equals(sArr[i])) {
                    return false;
                }
            } else if (hashMap.containsValue(sArr[i])) {
                return false;
            } else {
                hashMap.put(pattern.charAt(i), sArr[i]);
            }

        }

        return true;
    }
}
