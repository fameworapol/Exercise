public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquareWithBinarySearch(2147483647));
    }

    public static boolean isPerfectSquare(int num) {
        boolean result = false;
        if (num == 1) {
            return true;
        }
        for (int i = 0; i <= num; i++) {
            if (i*i == num) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isPerfectSquareWithBinarySearch(int num) {
        boolean result = false;
        long left = 0;
        long right = num;
        long center = (right+left)/2;
        if (num == 1) {
            return true;
        }
        while (right >= left) {
            center = (right+left)/2;
            System.out.println("left = "+left+" ,right = "+right);
            if (center*center == num) {
                result = true;
                break;
            }
            if (center*center > num) {
                right = center - 1;
            }
            if (center*center < num) {
                left = center + 1;
            }
        }
        return result;
    }
}
