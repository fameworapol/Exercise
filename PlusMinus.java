package Problem;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(-4, 3, -9, 0, 4, 1));
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int size = arr.size();
        // Write your code here
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positiveNumber += 1;
                
            }else if (arr.get(i)==0) {
                zeroNumber+=1;
            }else if (arr.get(i) < 0) {
                negativeNumber+=1;
            }
        }
        System.out.printf("%.6f", (double) positiveNumber / size);
        System.out.println("");
        System.out.printf("%.6f", (double) negativeNumber / size);
        System.out.println("");
        System.out.printf("%.6f", (double) zeroNumber / size);
    }
}
