import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class WeightedUniformStrings {
    public static void main(String[] args) {
        String s = "abbcccdddd";
        List<Integer> queries = new ArrayList<>(List.of(1,7,5,4,15));
        System.out.println(weightedUniformStrings(s, queries));
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Create U set
        HashMap<Character,Integer> alphabetMap = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            alphabetMap.put(alphabet.charAt(i), i+1);
        }

        HashMap<Integer,Integer> uSetMap = new HashMap<>();
        // ArrayList uSet = new ArrayList<>();
        Character tempChar = '0';
        int countUniform = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == tempChar) {
                countUniform += alphabetMap.get(s.charAt(i));
                // uSet.add(countUniform);
                uSetMap.put(countUniform, 1);
            }else{
                countUniform = alphabetMap.get(s.charAt(i));
                // uSet.add(countUniform);
                uSetMap.put(countUniform, 1);
            }
            tempChar = s.charAt(i);
            // System.out.println(uSet);
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            if (uSetMap.containsKey(queries.get(i))) {
                result.add("YES");
            }else{
                result.add("NO");
            }
        }
        
        return result;
    }
}