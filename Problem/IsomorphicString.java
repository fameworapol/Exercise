package Problem;

import java.util.HashMap;;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i)) && hashMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else {
                hashMap.put(s.charAt(i), t.charAt(i));
            }

        }
        return true;
    }
}
