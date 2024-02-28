import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FrequencySort {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 3, 2 };
        int[] result = frequencySort(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.sort(nums);
        // Count Frequency in hashMap
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        // Sort By Frequency
        int max = 0;
        int indexPoint = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if (hashMap.get(nums[i]) >= max) {
                    result.add(nums[i]);
                    max = hashMap.get(nums[i]);
                } else if (hashMap.get(nums[i]) < max) {
                    result.add(indexPoint, nums[i]);
                    indexPoint++;
                }
            }
        }

        int[] resultTemp = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultTemp[i] = result.get(i);
        }
        return resultTemp;
    }
}
