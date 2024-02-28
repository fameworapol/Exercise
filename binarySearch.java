package Problem;

public class binarySearch {
    public static int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = nums.length-1;
        if(len==1 && nums[0]==target){
            return 0;
        }
        while (right>left) {
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
