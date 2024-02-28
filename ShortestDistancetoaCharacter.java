import java.util.ArrayList;
import java.util.List;

public class ShortestDistancetoaCharacter {
    public static void main(String[] args) {
        String s = "aaba";
        Character c = 'b';
        int[] result = shortestToChar2(s, c);
        for (int item : result) {
            System.out.println(item);
        }
    }

    public static int[] shortestToChar(String s, char c) {
        List<Integer> occurIn = new ArrayList<>();
        // find occour c in s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                occurIn.add(i);
            }
        }
        int[] result = new int[s.length()];
        int index = 0;
        Integer prev = null;
        int occurNum = occurIn.get(index);
        for (int i = 0; i < s.length(); i++) {
            if (i > occurNum) {
                prev = occurNum;
                index++;
                if (index > occurIn.size() - 1) {
                    index--;
                }
                occurNum = occurIn.get(index);
            }
            if (prev == null) {
                result[i] = Math.abs(occurNum - i);
            } else {
                int leftClose = i - prev;
                int rightClose = occurNum - i;
                if (leftClose <= rightClose) {
                    result[i] = Math.abs(leftClose);
                }
                if (rightClose < leftClose) {
                    result[i] = Math.abs(rightClose);
                }
            }

            System.out.println("left = " + prev + ", right = " + occurNum);

        }

        return result;
    }

    public static int[] shortestToChar2(String str, char c) {
        StringBuilder s = new StringBuilder(str);

        int ans[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                ans[i] = 0;
                continue;
            }
            String s1 = s.substring(0, i);
            String s2 = s.substring(i + 1);

            int a = s1.lastIndexOf(c);
            int b = s2.indexOf(c);

            if (a == -1)
                a = Integer.MAX_VALUE;
            else
                a = s1.length() - a;

            if (b == -1)
                b = Integer.MAX_VALUE;
            else
                b = b + 1;

            ans[i] = Math.min(a, b);
        }

        return ans;
    }
}
