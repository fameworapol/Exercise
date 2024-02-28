
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;;

public class IntersectionOfMultipleArray {
    public static void main(String[] args) {
        int[][] nums = { { 3, 1, 2, 4, 5 }, { 1, 2, 3, 4 }, { 3, 4, 5, 6 } };
        List<Integer> result = intersections(nums);
        // Output
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int tempI = 0;
        for (int i = 0; i < nums.length; i++) {
            int[] element = nums[i];
            for (int j = 0; j < element.length; j++) {
                tempI = i;
                if (hashMap.containsKey(element[j])) {
                    hashMap.put(element[j], hashMap.get(element[j]) + 1);
                } else {
                    hashMap.put(element[j], 1);
                }
            }
        }
        Set<Integer> allKey = hashMap.keySet();
        int[] intArray = new int[allKey.size()];
        Iterator<Integer> iterator = allKey.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            intArray[index++] = iterator.next();
        }

        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            if (hashMap.containsKey(intArray[i])) {
                if (hashMap.get(intArray[i]) == nums.length) {
                    result.add(intArray[i]);
                }
            }
        }

        return result;
    }

    public static List<Integer> intersections(int[][] nums) {
        int MAX_NUM = 1000;
        int[] counts = new int[MAX_NUM + 1];
        for (int[] subNums : nums) {
            for (int n : subNums) {
                counts[n]++;
            }
        }

        List<Integer> output = new LinkedList<>();
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] == nums.length)
                output.add(i);
        }

        return output;
    }
}
