package Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class removeDupicate {
    // Set
    public static int removeDuplicates2(int[] nums) {
        Set<Integer> set = new HashSet<>(Arrays.asList(
                Arrays.stream(nums).boxed().toArray(Integer[]::new)));
        int i = 0;
        // copy set to array nums
        for (int ele : set) {
            nums[i] = ele;
            i++;
        }
        return set.size();
    }

    // Hash table
    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> Hashtable = new HashMap<>(); // key = int , value = int
        int[] numbers = {};
        for (int i = 0; i < nums.length; i++) {
            Hashtable.put(nums[i], i);
        }
        int i = 0;
        for (int ele : Hashtable.keySet()) {
            nums[i] = ele;
            i++;
        }
        return Hashtable.size();
    }

    // Fastest
    public static int removeDuplicates3(int[] nums) {
        if (nums.length == 0)
            return 0;
        int addIndex = 1; // index that unique characters will be inserted at
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) { // if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        return addIndex;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates2(nums));
        System.out.println(removeDuplicates3(nums));
    }

}
