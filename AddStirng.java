package Problem;

public class AddStirng {
    public static void main(String[] args) {
        System.out.println(addStrings("11","123"));;
    }

    public static String addStrings(String num1, String num2) {
        return Integer.toString(Integer.parseInt(num1)+Integer.parseInt(num2));
    }
}
