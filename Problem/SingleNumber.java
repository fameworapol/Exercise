package Problem;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println("result = " + singleNumbers(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int element : nums) {
            if (hashMap.containsKey(element)) {
                hashMap.put(element, hashMap.get(element) + 1);
            }
            if (!hashMap.containsKey(element)) {
                hashMap.put(element, 1);
            }

        }

        for (int element : nums) {
            if (hashMap.get(element) == 1) {
                return element;
            }
        }
        return 1;
    }

    public static int singleNumbers(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (count < 2) {
                    return nums[i - 1];
                } else {
                    count = 1;
                }
            } else {
                count++;
            }

        }
        return nums[nums.length - 1];
    }

    public int singleNumberss(int[] nums) {
        return recursiveXor(0, nums);
    }

    public int recursiveXor(int i, int... nums) {
        if (i >= nums.length) return 0;
        return nums[i] ^ recursiveXor(++i, nums);
    }
}
