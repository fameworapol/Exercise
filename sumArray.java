import java.util.ArrayList;
import java.util.List;

/**
 * sumArray
 */
public class sumArray {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(17 ,28 ,30 ));
        List<Integer> b = new ArrayList<>(List.of(99 ,16 ,8));
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aPoint = 0;
        int bPoint = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aPoint += 1;
            }
            if (b.get(i) > a.get(i)) {
                bPoint += 1;
            }
        }
        return new ArrayList<>(List.of(aPoint,bPoint));
    }
}