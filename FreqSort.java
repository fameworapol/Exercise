

import java.util.ArrayList;
import java.util.List;

public class FreqSort {
    public static void main(String[] args) {
        System.out.println(itemsSort(new ArrayList<>(List.of(4, 4, 5, 5, 6, 3))));
    }

    public static List<Integer> itemsSort(List<Integer> items) {
        // HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        // for (int i = 0; i < items.size(); i++) {
        // if (hashMap.containsKey(items.get(i))) {
        // hashMap.put(items.get(i), hashMap.get(items.get(i)) + 1);
        // } else if (!hashMap.containsKey(items.get(i))) {
        // hashMap.put(items.get(i), 1);
        // }
        // }

        // // get all value
        // Set<Integer> tempSet = new HashSet<>();
        // for (int i = 0; i < items.size(); i++) {
        // tempSet.add(hashMap.get(items.get(i)));
        // }
        // return null;

        items.sort(null);
        List<Integer> temp = new ArrayList<>();
        int maxCount = 0;
        for (int i = 0; i < items.size(); i++) {
            int tempCount = 0;
            for (int j = 0; j < items.size(); j++) {
                if (items.get(i) == items.get(j)) {
                    tempCount++;
                }
            }
            if (tempCount >= maxCount) {
                result.add(items.get(i));
                maxCount = tempCount;
                temp.add(tempCount);
            } else if (tempCount < maxCount) {
                // result.add(0, items.get(i));
                for (int k = 1; k < temp.size(); k++) {
                    if (temp.get(k) != temp.get(k - 1) && tempCount == temp.get(k - 1)) {
                        result.add(k, items.get(i));
                        break;
                    }
                }
            }
        }
        return result;
    }
}
