package Problem;

import java.util.HashMap;

public class containsNearbyDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1 };
        boolean result = containsNearbyDuplicates(nums, 1);
        System.out.println(result);
    }

    public static boolean containsNearbyDuplicates(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                int checkLength = i - hashMap.get(nums[i]);
                if (checkLength <= k) {
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
