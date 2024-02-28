package Problem;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle3(27));
    }

    public static String convertToTitle(int columnNumber) {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        int round = (int) Math.ceil((double) columnNumber / 26);
        if (columnNumber <= 26) {
            return Character.toString(alphabet[columnNumber - 1]).toUpperCase();
        } else {
            int mainNum = columnNumber / 26;
            int subNum = columnNumber % 26;
            if (mainNum > 0) {
                String result = Character.toString(alphabet[mainNum - 1]).toUpperCase()
                        + Character.toString(alphabet[subNum - 1]).toUpperCase();
                return result;
            }
            System.out.println(mainNum + " " + subNum);
        }

        return null;
    }

    public static String convertToTitle2(int columnNumber) {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        float round = columnNumber;
        while (round > 1) {
            round = round / 26;
            System.out.println(round);
        }

        return null;
    }

    public static String convertToTitle3(int c) {
        if (c < 27) {
            return Character.toString((char) ('A' + (c - 1)));
        }
        StringBuilder ans = new StringBuilder("");
        while (c > 0) {
            int x = c % 26;
            if (x == 0) {
                ans.append('Z');
                c--;
            } else {
                ans.append((char) ('A' + x - 1));
            }
            c /= 26;
        }
        return ans.reverse().toString();
    }
}
