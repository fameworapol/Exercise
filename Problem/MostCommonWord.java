import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl";
        String[] banned = { "hit","bob"};
        System.out.println(mostCommonWord(paragraph, banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        // TODO : stroe banded word to hashmap
        HashMap<String, Integer> bandedMap = new HashMap<>();
        for (int i = 0; i < banned.length; i++) {
            bandedMap.put(banned[i], i);
        }
        HashMap<String, Integer> paragraphMap = new HashMap<>();
        String[] paragraphList = paragraph.split("[\\s,]");
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\\\s]", Pattern.CASE_INSENSITIVE);
        int max = 0;
        String maxStr = "";
        for (int i = 0; i < paragraphList.length; i++) {
            Matcher matcher = pattern.matcher(paragraphList[i].trim());
            String resultStr = matcher.replaceAll("").toLowerCase().trim();
            if (resultStr.equals("")) {
                continue;
            }
            if (!bandedMap.containsKey(resultStr)) {
                if (paragraphMap.containsKey(resultStr)) {
                    paragraphMap.put(resultStr, paragraphMap.get(resultStr) + 1);
                    if ((paragraphMap.get(resultStr)) > max) {
                        max = paragraphMap.get(resultStr);
                        maxStr = resultStr;
                    }
                } else {
                    paragraphMap.put(resultStr, 1);
                    if ((paragraphMap.get(resultStr)) > max) {
                        max = paragraphMap.get(resultStr);
                        maxStr = resultStr;
                    }
                }
            }

        }
        return maxStr;
    }

    public static String mostCommonWordWord(String s1, String[] ban) {
        s1 = s1.toLowerCase().replaceAll("\\W+"," ");
        String[] arr = s1.split("\\s+");

        int n = arr.length;
        HashMap<String,Integer> hp = new HashMap<>();
        for(int i=0; i<n; i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }

        HashSet<String> h = new HashSet<>();
        for(int i=0; i<ban.length; i++){
            h.add(ban[i]);
        }
        

        int freq = 0;
        String ans = "";
        for(var a : hp.keySet()){
            if(hp.get(a)>freq && !h.contains(a)){
                freq = hp.get(a);
                ans = a;
            }
        }
        return ans;
    }
}
