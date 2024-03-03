package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] numList = {1,1,1,1,2,2,2,2,2,3,3,4,4};
        int[] nums = {3,1,5,4,2,6,7};
        System.out.println(findMaxFreq(numList));
        System.out.println(findTwoMaxValue(nums));
    }

    public static int findMaxFreq(int[] numList){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int maxFreq = 0;
        int result = 0;
        for (int i = 0; i < numList.length; i++) {
            if (hashMap.containsKey(numList[i])){
                hashMap.put(numList[i],hashMap.get(numList[i])+1);
            }else {
                hashMap.put(numList[i],1);
            }
            if (hashMap.get(numList[i])> maxFreq){
                maxFreq = hashMap.get(numList[i]);
                result = numList[i];
            };
        }
        return result;
    }

    public static int[] findTwoMaxValue(int[] nums){
        Arrays.sort(nums);
        int[] result = new int[2];
        result[0] = nums[nums.length-1];
        result[1] = nums[nums.length-2];
        return result;
    }
}