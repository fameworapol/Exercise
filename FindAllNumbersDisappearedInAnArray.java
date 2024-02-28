package Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int size = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 1; i <= size; i++) {
            if (!hashMap.containsKey(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
