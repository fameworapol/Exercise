package Problem;
import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(256741038 ,623958417, 467905213 ,714532089, 938071625));
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(null);
        long max = (long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3);
        long min = (long) arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        // Write your code here
        System.out.print(max);
        System.out.print(" ");
        System.out.print(min);
    }
}
