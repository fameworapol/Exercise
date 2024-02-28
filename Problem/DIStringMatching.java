public class DIStringMatching {
    public static void main(String[] args) {
        System.out.println(diStringMatch("DDI"));
    }

    public static int[] diStringMatch(String s) {
        int I = 0;
        int D = s.length();
        int[] result = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result[i] = I;
                I++;
            } else if (s.charAt(i) == 'D') {
                result[i] = D;
                D--;
            }
        }
        Character lastChar = s.charAt(s.length() - 1);
        if (lastChar.equals('I')) {
            result[s.length()] = I;
        } else if (lastChar.equals('D')) {
            result[s.length()] = D;
        }

        return result;
    }
}
