package Problem;
import java.util.HashMap;
import java.util.Map;
//TODO: Brute force
/*public class twoSumEx {
    public static int[] twoSum(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    if (i==j) {
                        continue;
                    }
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] intArray = {2,7,11,15};
        int [] reusult = twoSum(intArray,9);
        for (int i = 0; i < reusult.length; i++) {
            System.out.print(reusult[i]+",");
        }
    }
    
}*/

//Opimization
public class twoSumEx {
    public static int[] twoSum(int[] nums,int target) {
        Map<Integer, Integer> Hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (Hashtable.containsKey(target-nums[i])) {
                return new int [] {Hashtable.get(target-nums[i]),i};
            }
            Hashtable.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        //input
        int[] intArray = {2,7,11,15};
        int [] reusult = twoSum(intArray,9);
        for (int i = 0; i < reusult.length; i++) {
            System.out.print(reusult[i]+",");
        }
    }
}
