

public class indexinsert {
    // Brute force O(n)
    public static int searchInsert1(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                return i;
            }

            if (i == 0 && target < nums[i]) {
                return i;
            }

            if (i == len - 1 && target > nums[i]) {
                return i + 1;
            }

            if (i != 0) {
                if ((target > nums[i - 1]) && target < nums[i]) {
                    return i;
                }
            }

        }
        return target;
    }

    // Binary search O(logn)
    public static int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            double d_mid = Math.ceil((left + right) / 2);
            int mid = (int) Math.round(d_mid);
            if (target == nums[mid]) {
                return mid;
            }
            if(left==right && right==mid){
                if(target<=nums[mid]){
                    return mid;
                }
                if(mid==nums.length-1 && target<nums[mid]){
                    return mid;
                }
                return mid + 1;
            }
            if (target < nums[mid]) {
                right = mid - 1;
                if(right<left){
                    return mid;
                }
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static int searchInsert3(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
    public static void main(String[] args) {
        int[] num = {3,6,7,8,10};
        System.out.println(searchInsert2(num, 5));
        System.out.println(searchInsert3(num, 5));
    }
}
