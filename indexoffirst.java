package Problem;
class indexoffirst {
    public static int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        for (int i = 0; i < haystack.length()-needleLen+1; i++) {
            String s = haystack.substring(i, i+needleLen);
            if(s.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        int result = new indexoffirst().strStr(haystack, needle);
        System.out.println(result);
    }
}