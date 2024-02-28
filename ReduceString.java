public class ReduceString {
    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));
    }

    public static String superReducedString(String s) {
        Character tempString = '0';
        StringBuilder stringBuilder = new StringBuilder(s);
        int i = 0;
        while (i < stringBuilder.length()) {
            System.out.println(stringBuilder.toString());
            System.out.println("tempString = " + tempString);
            System.out.println("i = " + stringBuilder.charAt(i));
            System.err.println("---------------------------");
            if (tempString.equals(stringBuilder.charAt(i))) {
                stringBuilder.delete(i - 1, i + 1);
                i = 0;
                tempString = '0';
            } else {
                tempString = stringBuilder.charAt(i);
                i++;
            }
        }
        String result = "";
        if (stringBuilder.toString().equals("")) {
            result = "Empty String";
        } else {
            result = stringBuilder.toString();
        }
        return result;
    }
}