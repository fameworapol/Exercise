import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char left = s[i];
            char right = s[s.length - i - 1];
            s[i] = right;
            s[s.length - i - 1] = left;
            System.out.println(i);
        }
    }

    public static void reverseStringUsingStack(char[] s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            stack.add(s[i]);
        }

        char[] result = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = stack.pop();
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }
}
