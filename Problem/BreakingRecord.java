package Problem;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecord {
    public static void main(String[] args) {
        System.out.println(breakingRecords(new ArrayList<>(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1))));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int bestScore = scores.get(0);
        int worstScore = scores.get(0);
        int bestCount = 0;
        int worstCount = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > bestScore) {
                bestScore = scores.get(i);
                bestCount += 1;
            } else if (scores.get(i) < worstScore) {
                worstScore = scores.get(i);
                worstCount += 1;
            }
        }
        return List.of(bestCount,worstCount);
    }
}
