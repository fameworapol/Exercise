package Problem;

public class mergesortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int[] result = merge(nums1, 3, nums2, 3);
        System.out.println(result);
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        for (int k = 0; k < m + n; k++) {
            if (nums1.length == 0) {
                result = nums2;
                break;
            }
            if (nums2.length == 0) {
                result = nums1;
                break;
            }
            if (nums1[i] == 0) {
                result[k] = nums2[j];
                j += 1;
            } else if (nums2[j] == 0) {
                result[k] = nums1[i];
                i += 1;
            } else {
                if (nums1[i] <= nums2[j]) {
                    result[k] = nums1[i];
                    i += 1;
                } else if (nums1[i] > nums2[j]) {
                    result[k] = nums2[j];
                    j += 1;
                }
            }
        }
        for (int temp : result) {
            System.out.println(temp);
        }
        return result;
    }
}
