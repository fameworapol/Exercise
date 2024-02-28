package Problem;

import java.util.*;

public class BryteForceShortestPath {
    public static void main(String[] args) {
        HashMap<Integer,List<Integer>> hashMap = new HashMap<>();
        hashMap.put(0, List.of(1,3));
        hashMap.put(1, List.of(0,2,4));
        hashMap.put(2, List.of(1,5));
        hashMap.put(3, List.of(0,4,6));
        hashMap.put(4, List.of(1,3,5,7));
        hashMap.put(5, List.of(2,4,8));
        hashMap.put(6, List.of(3,7));
        hashMap.put(7, List.of(6,4,8));
        hashMap.put(8, List.of(5,7));
    }

    public static List<Integer> bruteForceMethod(){
        return null;
    }
}
