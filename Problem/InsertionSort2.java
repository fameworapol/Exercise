import java.util.ArrayList;
import java.util.List;

public class InsertionSort2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(3, 4, 7, 5, 6, 2, 1));
        insertionSort2(arr.size(), arr);
    }

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for (int i = 0; i < arr.size(); i++) {
            // Integer element = arr.get(i);
            for (int j = i; j > 0; j--) {
                int current = arr.get(j);
                int next = arr.get(j - 1);
                if (current < next) {
                    arr.set(j, next);
                    arr.set(j-1, current);
                }
            }
            if (i != 0) {
                printOutput(arr);
            }
        }
    }

    public static void printOutput(List<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.print("\n");
    }

}
