package Problem;

import java.util.HashMap;

class ContainsDuplicate {
    public static void main(String[] args) {
        // int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        int[] nums = { 1, 2, 3 };
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        boolean isDuplicate = false;
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                isDuplicate = true;
                break;
            }
            hashMap.put(nums[i], i);
        }
        return isDuplicate;
    }

    public static boolean containsDuplicateBest(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return true;
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}