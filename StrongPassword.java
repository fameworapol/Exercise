import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(minimumNumber(7, "AUzs-nV"));
    }

    public static int minimumNumber(int n, String password) {
        int result = 0;
        String upperCaseRegex = "[A-Z]";
        String lowerCaseRegex = "[a-z]";
        String numberRegex = "[0-9]";
        String spRegex = "[!@#$%^&*()_+\\[\\]{}|;':\",.<>?/-]";

        Pattern upperpattern = Pattern.compile(upperCaseRegex);
        Matcher uppermatcher = upperpattern.matcher(password);
        int lagChar = 0;
        if (n < 6) {
            lagChar += 6 - password.length();
        }
        // Check UpperCase
        if (!uppermatcher.find()) {
            result += 1;
            lagChar--;
        }
        // Check LowerCase
        Pattern lowerpattern = Pattern.compile(lowerCaseRegex);
        Matcher lowermatcher = lowerpattern.matcher(password);
        if (!lowermatcher.find()) {
            result += 1;
            lagChar--;
        }
        // Check Number
        Pattern numberpattern = Pattern.compile(numberRegex);
        Matcher numbermatcher = numberpattern.matcher(password);
        if (!numbermatcher.find()) {
            result += 1;
            lagChar--;
        }
        // Check Sp
        Pattern sppattern = Pattern.compile(spRegex);
        Matcher spmatcher = sppattern.matcher(password);
        if (!spmatcher.find()) {
            result += 1;
            lagChar--;
        }

        return lagChar > 0 ? result + lagChar : result;
    }
}
