package Problem;

import java.util.Arrays;
import java.util.HashMap;;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4 };
        System.out.println(maxFrequencyElements(nums));
    }

    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if (hashMap.get(nums[i]) + 1 > max) {
                    max = hashMap.get(nums[i]) + 1;
                }
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                if (1>max) {
                    max = 1;
                }
                hashMap.put(nums[i], 1);
            }
        }
        int resultTemp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.get(nums[i]) == max){
                resultTemp += 1;
            }
        }
        return resultTemp;
    }
}
