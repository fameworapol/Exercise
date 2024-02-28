package Problem;

import java.util.Stack;

public class isPalindrome {
    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        Stack st = new Stack<>();
        int middle = (s.length() / 2);
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 != 0 && i == middle) {
                continue;
            }
            if (!st.empty() && st.peek().equals(s.charAt(i))) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
            // System.out.println(st);
        }
        if (st.size() == 1 || st.isEmpty()) {
            return true;
        }
        return false;
    }

    //Fastest
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "adam";
        System.out.println(isPalindrome(s));
    }
}
