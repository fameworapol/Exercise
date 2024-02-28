import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdMax {
    public static void main(String[] args) {
        int[] nums = { 1,2};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }
        nums =  numsSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(nums);
        if (nums.length < 3) {
            return nums[nums.length-1];
        }
        return nums[nums.length-3];
    }

}
