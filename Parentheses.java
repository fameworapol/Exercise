package Problem;

import java.util.Stack;

public class Parentheses {
    // Use stack
    public static boolean isValid(String s) {
        Stack st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (st.isEmpty()) {
                st.push(c);
            } else {
                if (st.peek().equals('(') && c == ')') {
                    st.pop();
                } else if (st.peek().equals('[') && c == ']') {
                    st.pop();
                } else if (st.peek().equals('{') && c == '}') {
                    st.pop();
                } else {
                    st.push(c);
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        System.out.println(st);
        return false;
    }

    // fastest
    // time = O(n)// memory = O(n)

    public static boolean isValid2(String s) {
        // validate that number of letters is even
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] stack = new char[s.length()];
        int pointer = -1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++pointer] = c;
            } else if (pointer < 0) {
                return false;
            } else if (c == ')' && stack[pointer] == '(') {
                pointer--;
            } else if (c == '}' && stack[pointer] == '{') {
                pointer--;
            } else if (c == ']' && stack[pointer] == '[') {
                pointer--;
            } else {
                return false;
            }
        }
        return pointer == -1;
    }

    // medium
    public static boolean isValid3(String s) {
        int length = s.length();
        char[] array = s.toCharArray();
        if (length == 0)
            return true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < length; i++) {
            if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
                stack.push(array[i]);
            }
            if (array[i] == ')' || array[i] == '}' || array[i] == ']') {
                if (stack.isEmpty())
                    return false;
                char temp = stack.pop();
                if ((temp == '(' && array[i] == ')') || (temp == '{' && array[i] == '}')
                        || (temp == '[' && array[i] == ']')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
        System.out.println(isValid2(s));
        System.out.println(isValid3(s));
    }
}
