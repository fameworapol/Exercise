package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(caesarCipher("www.abc.xy", 87));
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(today);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
    }

    public static String caesarCipher(String s, int k) {
        HashMap<Integer,Character> hashMap = new HashMap<>();
        String character = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < character.length(); i++) {
            hashMap.put(i, character.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int charIndex = 0;
            for (int j = 0; j < character.length(); j++) {
                Character charTemp = hashMap.get(j);
                if (charTemp.equals(Character.toLowerCase(s.charAt(i)))){
                    charIndex = j;
                }
            }

            int index = charIndex+k;
            if (index>25) {
                int indexTemp = index/26;
                if (indexTemp>1){
                    index = index%26;
                }else {
                    index = index - (26/indexTemp);
                }

            }

            String resultTemp = Character.toString(hashMap.get(index));
            if (Character.isUpperCase(s.charAt(i))){
                resultTemp = resultTemp.toUpperCase(Locale.ROOT);
            }
            if (charIndex == 0 && Character.toLowerCase(s.charAt(i)) != 'a'){
                result.append(Character.toString(s.charAt(i)));
            }else {
                result.append(resultTemp);
            }
        }
        return result.toString();
    }
}