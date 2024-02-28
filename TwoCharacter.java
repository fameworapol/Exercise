
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwoCharacter {
    public static void main(String[] args) {
        System.out.println(alternateFinal("cwomzxmuelmangtosqkgfdqvkzdnxerhravxndvomhbokqmvsfcaddgxgwtpgpqrmeoxvkkjunkbjeyteccpugbkvhljxsshpoymkryydtmfhaogepvbwmypeiqumcibjskmsrpllgbvc"));
    }

    public static int alternate(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        List<Character> continousChar = new ArrayList<>();
        Character tempChar = '0';
        for (int i = 0; i < s.length(); i++) {
            if (tempChar == s.charAt(i)) {
                continousChar.add(s.charAt(i));
            }
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
            tempChar = s.charAt(i);
        }

        Integer maxValue = 0;
        Character maxKey = '0';
        Integer secondMaxValue = 0;
        Character secondMaxKey = '0';

        if (continousChar.size() > 0) {
            for (int i = 0; i < continousChar.size(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (continousChar.get(i).equals(s.charAt(j))) {
                        continue;
                    } else {
                        if (hashMap.get(s.charAt(j)) > maxValue) {
                            maxKey = s.charAt(j);
                            maxValue = hashMap.get(s.charAt(j));
                        }
                    }
                }
            }

            for (int i = 0; i < continousChar.size(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (continousChar.get(i).equals(s.charAt(j)) || maxKey.equals(s.charAt(j))) {
                        continue;
                    } else {
                        if (hashMap.get(s.charAt(j)) > secondMaxValue) {
                            secondMaxKey = s.charAt(j);
                            secondMaxValue = hashMap.get(s.charAt(j));
                        }
                    }
                }
            }
        } else {
            for (int j = 0; j < s.length(); j++) {
                if (hashMap.get(s.charAt(j)) > maxValue) {
                    maxKey = s.charAt(j);
                    maxValue = hashMap.get(s.charAt(j));
                }
            }

            for (int j = 0; j < s.length(); j++) {
                if (maxKey.equals(s.charAt(j))) {
                    continue;
                } else {
                    if (hashMap.get(s.charAt(j)) > secondMaxValue) {
                        secondMaxKey = s.charAt(j);
                        secondMaxValue = hashMap.get(s.charAt(j));
                    }
                }
            }
        }

        return secondMaxValue + maxValue;
    }

    public static int alternates(String s) {
        String regex = "a";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        // StringBuffer result = new StringBuffer(s);
        String sTemp = s;
        List<Character> dupChar = new ArrayList<>();
        while (matcher.find()) {
            s = matcher.replaceAll("");
            Character charTemp = '0';
            // Check Dup
            for (int i = 0; i < s.length(); i++) {
                if (charTemp.equals(s.charAt(i))) {
                    dupChar.add(s.charAt(i));
                } else {
                    charTemp = s.charAt(i);
                }
            }
            if (!dupChar.isEmpty()) {
                for (int i = 0; i < dupChar.size(); i++) {
                    regex = Character.toString(dupChar.get(i));
                    pattern = Pattern.compile(regex);
                    matcher = pattern.matcher(s);
                    s = matcher.replaceAll("");
                }
            }
        }

        System.out.println(s);
        return 0;
    }

    public static int alternateFinal(String s) {
        Set<String> uniqueChar = new HashSet<>(List.of(s.split("")));
        String[] uniqueStr = uniqueChar.toArray(new String[0]);
        List<String> coupleStr = new ArrayList<>();
        for (int i = 0; i < uniqueStr.length; i++) {
            for (int j = 0; j < uniqueStr.length; j++) {
                if (i == j) {
                    continue;
                }
                String first = uniqueStr[i];
                String second = uniqueStr[j];
                StringBuilder temStr = new StringBuilder();
                // coupleStr.add(uniqueStr[i]+uniqueStr[j]);
                for (int k = 0; k < uniqueStr.length; k++) {
                    if (uniqueStr[k] != first && uniqueStr[k] != second) {
                        temStr.append(uniqueStr[k]);
                    }
                }
                // System.out.println(first+second+ " , "+temStr.toString());
                coupleStr.add(temStr.toString());
            }
        }

        // remove string
        List<String> removedStr = new ArrayList<>();
        for (int i = 0; i < coupleStr.size(); i++) {
            String sTemp = new String(s);
            String coupleStrTemp = coupleStr.get(i);
            for (int j = 0; j < coupleStrTemp.length(); j++) {
                Pattern pattern = Pattern.compile(Character.toString(coupleStrTemp.charAt(j)));
                Matcher matcher = pattern.matcher(sTemp);
                if (matcher.find()) {
                    sTemp = matcher.replaceAll("");
                }
                // System.out.println(Character.toString(coupleStrTemp.charAt(j)));
                sTemp.replaceAll(Character.toString(coupleStrTemp.charAt(j)), "");
            }
            removedStr.add(sTemp);
        }

        // check duplicate string
        ArrayList<Integer> sizeOfItem = new ArrayList<>();
        for (int i = 0; i < removedStr.size(); i++) {
            String item = removedStr.get(i);
            Boolean isDuplicate = false;
            Character tempStr = '0';
            for (int j = 0; j < item.length(); j++) {
                if (item.charAt(j) == tempStr) {
                    isDuplicate = true;
                }
                tempStr = item.charAt(j);
            }
            if (!isDuplicate) {
                sizeOfItem.add(item.length());
                // return item.length();
            }
        }
        int max = 0;
        for (int i = 0; i < sizeOfItem.size(); i++) {
            if (sizeOfItem.get(i) >= max) {
                max = sizeOfItem.get(i);
            }
        }
        return max;
    }
}
