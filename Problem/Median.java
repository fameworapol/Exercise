package Problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Median {
    public static void main(String[] args) {
        List<Integer> testCase = new ArrayList<>(List.of(0, 1, 2, 4, 6, 5));
        System.out.println(findMedian(testCase));;
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());
        int centerIndex = arr.size() / 2;
        return arr.get(centerIndex);
    }
}
