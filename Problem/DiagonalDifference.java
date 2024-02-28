package Problem;

import java.util.ArrayList;
import java.util.List;

class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>(List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12)));
        int result = diagonalDifference(arr);
        System.out.println(result);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int dimension = arr.size();
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.size(); i++) {
            left += arr.get(i).get(i);
            right += arr.get(i).get(dimension-i-1);
        }
        int result = Math.abs(left - right);
        return result;
    }
}