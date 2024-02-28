package Problem;

import java.util.*;


public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 9,6,4,2,3,5,7,0,1 };
        // System.out.println("result = " + missingNumberTest(nums));
        System.out.println("result = " + missingNumber(nums));
    }

    // 🥲 Brute force
    public static int missingNumberTest(int[] nums) {
        // find max value
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        // find Missing Value
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
            boolean has = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    has = true;
                }
            }
            if (has == false) {
                return i;
            }
        }
        return max + 1;
    }

    public static int missingNumberUsingHashMap(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        System.out.println(max);
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(i)) {
                return i;
            }
        }
        return max + 1;
    }

    public int missingNumberSolution(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=i;
        }
        for(int i=0;i<n;i++){
            if(a[i]==nums[i]) continue;
            else return a[i];
        }
        return n;
    }

    public int missingNumberBestSolution(int[] nums) {
        int desired = 0;
        for(int i = 0; i <= nums.length; i++) {
            desired += i;
        }
        int present = 0;
        for(int i = 0; i < nums.length; i++) {
            present += nums[i];
        }
        
        return desired - present;
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }
}
