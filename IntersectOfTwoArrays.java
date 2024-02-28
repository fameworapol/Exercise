package Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2 };
        // int[] result = intersectionBestSolution(nums1, nums2);
        int[] result = intersectionOfTwoArrays(nums1, nums2);
        for (int elm : result) {
            System.out.println(elm);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hashMap.put(nums1[i], 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i]) && hashMap.get(nums2[i]) < 2) {
                result.add(nums2[i]);
                hashMap.put(nums2[i], hashMap.get(nums2[i]) + 1);
            }
        }

        int[] resultTemp = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultTemp[i] = result.get(i);
        }

        return resultTemp;
    }

    public static int[] intersectionBestSolution(int[] nums1, int[] nums2) {
        short[] map = new short[1001];
        for (int i = 0; i < nums1.length; i++) {
            map[nums1[i]] = 2;
        }
        System.out.println(map);
        int intersectionSize = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map[nums2[i]] == 2) {
                intersectionSize += 1;
                map[nums2[i]] = 1;
            }
        }

        int[] result = new int[intersectionSize];
        int j = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map[nums2[i]] == 1) {
                result[j] = nums2[i];
                j += 1;
                map[nums2[i]] = 0;
            }
        }
        return result;
    }

    public static int[] intersectionOfTwoArray(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (hashMap.containsKey(nums1[i])) {
                hashMap.put(nums1[i], hashMap.get(nums1[i]) + 1);
            } else {
                hashMap.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i])) {
                result.add(nums2[i]);
                hashMap.put(nums2[i], hashMap.get(nums2[i]) + 1);
            }
        }

        int[] resultTemp = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultTemp[i] = result.get(i);
        }

        return resultTemp;
    }

    public static int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        if (nums2.length < nums1.length) {
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }
        for (int i = 0; i < nums1.length; i++) {
            boolean intersect = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersect = true;
                }
            }
            if (intersect == true) {
                result.add(nums1[i]);
            }
        }

        int[] resultTemp = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultTemp[i] = result.get(i);
        }
        return resultTemp;
    }
}
