
import java.util.*;
public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
    }

    public static String caesarCipher(String s, int k) {

        HashMap<Integer,Character> hashMap = new HashMap<>();
        String character = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < character.length(); i++) {
            hashMap.put(i, character.charAt(i));
        }

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int index = k+2;
            if (index>25) {
                index = index - 25;
            }
            result.concat(Character.toString(hashMap.get(index)));
        }
        return result;
    }
}
