package Problem;

public class addBinary {
    public static String addBinary1(String a, String b) {
        int len_a = a.length() - 1;
        int len_b = b.length() - 1;
        int i = len_a;
        int j = len_b;
        char temp = '0';
        String result = "";
        while (i >= 0 || j >= 0) {
            try {
                char x = a.charAt(i);
                char y = b.charAt(j);
                if ((x == '1' && y == '1') && temp == '0') {
                    result = "0" + result;
                    temp = '1';
                } else if ((x == '0' && y == '0') && temp == '1') {
                    result = "1" + result;
                    temp = '0';
                } else if ((x == '1' && y == '1') && temp == '1') {
                    result = "1" + result;
                    temp = '1';
                } else if ((x == '0' && y == '0') && temp == '0') {
                    result = "0" + result;
                    temp = '0';
                } else if (((x == '0' && y == '1') || (x == '1' && y == '0')) && temp == '1') {
                    result = "0" + result;
                    temp = '1';
                } else if (((x == '0' && y == '1') || (x == '1' && y == '0')) && temp == '0') {
                    result = "1" + result;
                    temp = '0';
                }
            } catch (StringIndexOutOfBoundsException e) {
                if (j < 0 && i >= 0) {
                    char x = a.charAt(i);
                    if (temp == '1' && x == '1') {
                        result = "0" + result;
                        temp = '1';
                    } else if (temp == '1' && x == '0') {
                        result = "1" + result;
                        temp = '0';
                    } else if (temp == '0' && x == '1') {
                        result = "1" + result;
                        temp = '0';
                    } else if (temp == '0' && x == '0') {
                        result = "0" + result;
                        temp = '0';
                    }
                }
                if (i < 0 && j >= 0) {
                    char y = b.charAt(j);
                    if (temp == '1' && y == '1') {
                        result = "0" + result;
                        temp = '1';
                    } else if (temp == '1' && y == '0') {
                        result = "1" + result;
                        temp = '0';
                    } else if (temp == '0' && y == '1') {
                        result = "1" + result;
                        temp = '0';
                    } else if (temp == '0' && y == '0') {
                        result = "0" + result;
                        temp = '0';
                    }
                }
            }
            i = i - 1;
            j = j - 1;
        }
        if (temp == '1') {
            result = temp + result;
        }
        return result;
    }

    public static String addBinary2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0)
                carry += a.charAt(i--) - '0'; // - '0' คือแปลงค่าให้อยู่ในรูป int
            if (j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2; //ตัวทด
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1101";
        String b = "1011";
        System.out.println(addBinary1(a, b));
        System.out.println(addBinary2(a, b));
        System.out.println(1%2); //1+0
        System.out.println(2%2); //1+1
        System.out.println(3%2); //1+1+1
    }
}
