
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(1));
    }

    public static boolean isHappy(int n) {
        String testCase = Integer.toString(n);
        int sum = 0;
        // int sumTemp = 0;
        int k = 0;
        while (k< n) {
            sum = 0;
            for (int i = 0; i < testCase.length(); i++) {
                int temp = Integer.parseInt(Character.toString(testCase.charAt(i)));
                sum += temp * temp;
            }
            if (sum == 1) {
                return true;
            }
            testCase = Integer.toString(sum);
            k++;
        }

        return false;
    }

    public static boolean isHappy2(int n) {
        if (n > 0) {
              if (n == 1 || n == 7) {
                    return true;
                }
            int k = n;
            while (k / 10 != 0) {
                int r = 0;
                int s = 0; // Initialize s to 0
                for (int i = k; i != 0; i = i / 10) {
                    r = i % 10;
                    s = s + (r * r);
                }
                k = s; // Update k, not s
                if (s == 1 || s == 7) {
                    return true;
                }
            }
        }
        return false;
    }
}
