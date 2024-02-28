import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = { "a@leetcode.com","b@leetcode.com","c@leetcode.com" };
        System.out.println(numUniqueEmails(emails));
        ;
    }

    public static int numUniqueEmails(String[] emails) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int result = 0;
        for (String email : emails) {
            String[] emailTemp = email.split("@");
            String front = emailTemp[0];
            String back = emailTemp[1];
            String actualEmail = "";

            // Delete .
            Pattern patternDot = Pattern.compile("[.]");
            Matcher matcherFront = patternDot.matcher(front);
            // Matcher matcherBack = patternDot.matcher(back);
            front = matcherFront.replaceAll("");
            // back = matcherBack.replaceAll("");

            //Check +
            for (int i = 0; i < front.length(); i++) {
                if (front.charAt(i) == '+') {
                    front = front.substring(0,i);
                    break;
                }
            }
            actualEmail = front + "@" + back;
            if (!hashMap.containsKey(actualEmail)) {
                result ++;
                hashMap.put(actualEmail, 1);
            }
           
        }
        return result;
    }
}
