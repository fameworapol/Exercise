package Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class isSubSequence {
    public static void main(String[] args) {
        System.out.println(isSubsequences("bb", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hashMap.put(t.charAt(i), i);
        }
        int tempIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                return false;
            }
            if (hashMap.containsKey(s.charAt(i))) {
                if (hashMap.get(s.charAt(i)) >= tempIndex) {
                    tempIndex = hashMap.get(s.charAt(i));
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSubsequences(String s, String t) {
        HashMap<Character, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (hashMap.containsKey(t.charAt(i))) {
                List<Integer> oldList = hashMap.get(t.charAt(i));
                oldList.add(i);
                hashMap.put(t.charAt(i), oldList);
            } else {
                hashMap.put(t.charAt(i), new ArrayList<>(List.of(i)));
            }
        }
        int tempIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                return false;
            }
            if (hashMap.containsKey(s.charAt(i))) {
                if (hashMap.get(s.charAt(i)).size() == 1 && hashMap.get(s.charAt(i)).get(0) >= tempIndex) {
                    tempIndex = hashMap.get(s.charAt(i)).get(0);
                } else if (hashMap.get(s.charAt(i)).size() > 1) {
                    int count = 0;
                    for (int index = 0; index < s.length(); index++) {
                        if (s.charAt(index) == s.charAt(i)) {
                            count++;
                        }
                    }
                    if (count != hashMap.get(s.charAt(i)).size()) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
