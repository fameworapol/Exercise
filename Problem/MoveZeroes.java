package Problem;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroess(nums);
    }

    public static void moveZeroes(int[] nums) {
        int[] resultTemp = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                resultTemp[index] = nums[i];
                index++;
            }
        }
        nums = resultTemp;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void moveZeroess(int[] nums) {
        // int[] resultTemp = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                nums[index++] = nums[i];
            }
        }
        // nums = resultTemp;
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void moveZeroes2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                nums[count++] = num;
            }
        }

        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
