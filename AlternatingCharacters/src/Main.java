public class Main {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAABBB"));
    }

    public static int alternatingCharacters(String s) {
        // Write your code here
        int i = 1;
        Character prevChar = s.charAt(0);
        int result = 0;
        StringBuilder testCase = new StringBuilder(s);
        while (i < testCase.length()){
            Character temp = testCase.charAt(i);
            if (testCase.charAt(i) == prevChar){
                testCase.deleteCharAt(i-1);
                prevChar = testCase.charAt(0);
                result++;
                i = 1;
            }else {
                prevChar = testCase.charAt(i);
                i++;
            }
        }
        return result;
    }
}