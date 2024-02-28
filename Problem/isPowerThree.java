package Problem;

public class isPowerThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(6));
        ;
    }

    public static boolean isPowerOfThree(int n) {
        int value = n;
        if (n < 3) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (value % 3 != 0) {
            if (value % 3 != 0) {
                return false;
            }
            value = value / 3;
        }
        return true;
    }
}
