package Problem;
import java.util.*;;

public class Longcommonprefix {
    public static String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        String second = strs[1];
        String third = strs[2];
        String result = "";
        for (int i = 0; i < first.length(); i++) {
            try {
                char a = first.charAt(i);
                char b = second.charAt(i);
                char c = third.charAt(i);
                if(a==b && b==c){
                    result = result + a;
                }
            } catch (Exception e) {
                break;
            }
        }
        return result;
    }
    public static String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0]; //first elm
        String s2 = strs[strs.length-1]; //last elm
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix1(strs));
    }
}
