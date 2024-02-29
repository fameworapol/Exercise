import java.util.*;

public class RelativeRank {
    public static void main(String[] args) {
        int[] testCase = {10,3,8,9,4};
        String[] result = findRelativeRanks(testCase);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] scoreTemp = score;
        String[] result = new String[score.length];
        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) {
            hashMap.put(score[i], score.length - i +1);
        }
        for (int i = 0; i < scoreTemp.length; i++) {
            if (hashMap.containsKey(score[i])) {
                if (hashMap.get(score[i])==1) {
                    result[i] = "Gold Medal";
                }else if (hashMap.get(score[i])==2){
                    result[i] = "Silver Medal";
                }else if (hashMap.get(score[i])==3){
                    result[i] = "Bronze Medal";
                }else {
                    result[i] = Integer.toString(hashMap.get(score[i]));
                }
            }
        }
        return result;
    }
}
