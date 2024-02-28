

public class GuessGame {
    public static void main(String[] args) {
        System.out.println(guessNumber(2));;
    }

    public static int guessNumber(int n) {
        if (n==1) {
            return n;
        }
        int left = 0;
        int right = n;
        int mid = left + (right-left)/2;
        while (left<=right) {
            mid = left + (right-left)/2;
            if (guess(mid) == 0) {
                return mid;
            }
            if (guess(mid) == -1) {
                right = mid - 1;
            }
            if (guess(mid) == 1) {
                left = mid +1;
            }
        }
        return 0;
    }

    public static int guess(int num) {
        int[] guess = { 1, 1, 0};
        return guess[num];
    }
}
