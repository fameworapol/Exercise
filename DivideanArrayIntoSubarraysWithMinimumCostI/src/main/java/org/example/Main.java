package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = {10,3,1,1};
        int result = minimumCost(nums);
        System.out.println(result);
    }

    public static int minimumCost(int[] nums) {
        //TODO: find min value index
        int[] numsTemp = nums.clone();
        List<Integer> numsNew = new ArrayList<>();
        for (int i = 0; i < numsTemp.length; i++) {
            if (i==0) {
                continue;
            }else {
                numsNew.add(nums[i]);
            }
        }

        numsNew.sort(null);
        int min = numsNew.get(0);
        int minIndex = 0;
        int secondMin = numsNew.get(1);
        int secondMinIndex = nums[1];


        //TODO: find max value index
        return min + secondMin+numsTemp[0];
    }
}