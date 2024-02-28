import java.util.HashMap;
import java.util.Map;

public class majority {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int mid = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums, 0)+1);
            }else if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }
            if(map.get(nums[i])>mid){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
