package Problem;

import java.util.ArrayList;
import java.util.List;

public class MaxCost {
    public static void main(String[] args) {
        List<Integer> cost = new ArrayList<>(List.of(3,
        2,
        0,
        2,
        4,
        0,
        1,
        4));
        List<String> labels = new ArrayList<>(List.of("legal",
        "illegal",
        "legal",
        "legal",
        "illegal",
        "legal",
        "legal",
        "legal"));
        int dailyCount = 4;
        System.out.println(maxCost(cost, labels, dailyCount));
    }

    public static int maxCost(List<Integer> cost, List<String> labels, int dailyCount) {
        // Write your code here
        int costPerDaily = 0;
        int day = 1;
        List<Integer> costInEachDay = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < cost.size(); i++) {
            int costTemp = cost.get(i);
            String labelsTemp = "";
            if (i < labels.size()) {
                labelsTemp = labels.get(i);
            }
            if ((labelsTemp.equals("") || labelsTemp.equals("legal"))) {
                if (costTemp!=0) {
                    costPerDaily += costTemp;
                    count++;
                }else{
                    count++;
                }
            } else if (!labelsTemp.isEmpty() && labelsTemp.equals("illegal")) {
                costPerDaily+=costTemp;
            }

            if (count >= dailyCount) {
                day+=1;
                costInEachDay.add(costPerDaily);
                costPerDaily = 0;
                count = 0;
            }
        }
        int result = 0;
        //find max cost
        for (int i = 0; i < costInEachDay.size(); i++) {
            if (costInEachDay.get(i) > result) {
                result = costInEachDay.get(i);
            }
        }

        return result;
    }
}
