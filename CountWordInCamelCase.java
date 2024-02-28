public class CountWordInCamelCase {
    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    public static int camelcase(String s) {
        // Write your code here
        int result = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}
