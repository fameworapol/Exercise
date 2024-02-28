import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
        insertionSort1(5, arr);
    }

    // public static void insertionSort1(int n, List<Integer> arr) {
    //     int elment = arr.get(arr.size() - 1);
    //     List<List<Integer>> resuList = new ArrayList<>();
    //     for (int i = arr.size() - 2; i >= 0; i--) {
    //         if (elment < arr.get(i)) {
    //             arr.set(i + 1, arr.get(i));
    //             List<Integer> clone = new ArrayList<Integer>(arr);
    //             resuList.add(clone);
    //             System.out.println(arr);
    //             if (i == 0) {
    //                 arr.set(i, elment);
    //                 List<Integer> cloneTemp = new ArrayList<Integer>(arr);
    //                 resuList.add(cloneTemp);
    //             }
    //             System.out.println(arr);
                
    //         } else {
    //             arr.set(i + 1, elment);
    //             System.out.println(arr);
    //             List<Integer> clone = new ArrayList<Integer>(arr);
    //             resuList.add(clone);
    //             break;
    //         }
    //     }

        // output
        // for (List<Integer> result : resuList) {
        //     for (int i = 0; i < result.size(); i++) {
        //         if (i==result.size()-1) {
        //             System.out.print(result.get(i));
        //         }else{
        //             System.out.print(result.get(i) + " ");
        //         }

        //     }
        //     System.out.print("\n");
        // }
    // }

    public static void insertionSort1(int n, List<Integer> arr) {
        for (int i = arr.size() - 1; i > 0; i--) {
            int current = arr.get(i);
            int next = arr.get(i - 1);
            if (current < next) {
                arr.set(i, next);
                printSpaceSeparatedIntegers(arr);
                arr.set(i - 1, current);
            } else {
                break;
            }
        }
        printSpaceSeparatedIntegers(arr);
    }
    
    private static void printSpaceSeparatedIntegers(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (i < arr.size() - 1) {
                System.out.print(arr.get(i) + " ");
            } else {
                System.out.println(arr.get(i));
            }
        }
    }
}
