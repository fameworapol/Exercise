

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;;

public class BigSorting {
    public static void main(String[] args) {
        List<String> unsorted = new ArrayList<>(List.of("1",
                "2",
                "100",
                "12303479849857341718340192371",
                "3084193741082937",
                "3084193741082938",
                "111",
                "200"));
        List<String> result = bigSorting(unsorted);
        for (String elm : result) {
            System.out.println(elm);
        }
    }

    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        List<BigInteger> unsortedInt = new ArrayList<>();
        for (int i = 0; i < unsorted.size(); i++) {
            BigInteger bigInteger = new BigInteger(unsorted.get(i));
            unsortedInt.add(bigInteger);
        }
        unsortedInt.sort(null);
        unsorted = new ArrayList<>();
        for (int i = 0; i < unsortedInt.size(); i++) {
            unsorted.add(unsortedInt.get(i).toString());
        }
        return unsorted;
    }
}
