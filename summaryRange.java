import java.util.ArrayList;
import java.util.List;

public class summaryRange {
    public static void main(String[] args) {
        System.out.println("fame");
        int[] nums = { 0, 1, 2 };
        List<String> result = summaryRanges(nums);
        for (String item : result) {
            System.out.println(item);
        }
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            return result;
        }
        Integer temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == len && temp == nums[i]) {
                result.add(Integer.toString(nums[i]));
            } else if (nums[i + 1] - nums[i] > 1 && nums[i] == temp) {
                result.add(Integer.toString(nums[i]));
                temp = nums[i + 1];
            } else if (nums[i + 1] - nums[i] == 1 && i + 1 == len - 1) {
                result.add(Integer.toString(nums[i]) + "->" + Integer.toString(nums[i + 1]));
                break;
            } else if (nums[i + 1] - nums[i] == 1) {
                continue;
            } else if (nums[i + 1] - nums[i] > 1 && nums[i] == temp) {
                result.add(Integer.toString(nums[i]));
                temp = nums[i + 1];
            } else if (nums[i + 1] - nums[i] > 1) {
                result.add(Integer.toString(temp) + "->" + Integer.toString(nums[i]));
                temp = nums[i + 1];
            }
        }
        return result;
    }
}
