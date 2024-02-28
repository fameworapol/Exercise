package Problem;

import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        countApplesAndOranges(7, 11, 5, 15, List.of(-2, 2, 1), List.of(5, -6));
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int apple = 0;
        int orange = 0;

        // TODO : Check Apple
        for (int i = 0; i < apples.size(); i++) {
            if (a + apples.get(i) >= s && a + apples.get(i) <= t) {
                apple += 1;
            }
        }

        // TODO : Check Oranges
        for (int i = 0; i < oranges.size(); i++) {
            if (b + oranges.get(i) >= s & b + oranges.get(i) <= t) {
                orange += 1;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }
}
