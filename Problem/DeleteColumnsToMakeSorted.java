import java.util.HashMap;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        String[] strs = { "cba", "daf", "ghi" };
        System.out.println(minDeletionSizes(strs));
        ;
    }

    // public static int minDeletionSize(String[] strs) {
    // HashMap<Character, Integer> hashMap = new HashMap<>();
    // String alphabet = "abcdefghijklmnopqrstuvwxyz";
    // for (int i = 0; i < alphabet.length(); i++) {
    // hashMap.put(alphabet.charAt(i), i);
    // }
    // int result = 0;
    // for (String word : strs) {
    // boolean isSorted = true;
    // int temp = hashMap.get(word.charAt(0));
    // for (int i = 0; i < word.length(); i++) {
    // if (i == 0) {
    // continue;
    // }
    // int range = Math.abs(hashMap.get(word.charAt(i)) - temp);
    // if (range != 1) {
    // isSorted = false;
    // }
    // temp = hashMap.get(word.charAt(i));
    // }
    // if (isSorted == false) {
    // result++;
    // }
    // }
    // return result;
    // }

    public static int minDeletionSize(String[] strs) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            hashMap.put(alphabet.charAt(i), i);
        }
        int result = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            boolean isSorted = true;
            int temp = 0;
            for (int j = 0; j < strs.length; j++) {
                if (j == 0) {
                    temp = hashMap.get(strs[j].charAt(i));
                }
                int range = hashMap.get(strs[j].charAt(i)) - temp;
                if (range < 0) {
                    isSorted = false;
                }
                temp = hashMap.get(strs[j].charAt(i));
                System.out.println(range);
            }
            if (!isSorted) {
                result++;
            }
            System.out.println("------------------- ");
        }
        return result;
    }

    public static int minDeletionSizes(String[] strs) {
        int row = strs.length;
        int col = strs[0].length();
        int ans = 0;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row - 1; j++) {
                // ไอสัส character มันเทียบกันตรงๆได้เว้ยยยยยยย !!!
                char x = strs[j].charAt(i);
                char y = strs[j + 1].charAt(i);
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
