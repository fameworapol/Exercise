package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        String data = Integer.toString(num);
        while (data.length() > 1){
            int sum = 0;
            for (int i = 0; i < data.length(); i++) {
                sum += Integer.parseInt(String.valueOf(data.charAt(i)));
            }
            data = Integer.toString(sum);
        }

        return Integer.parseInt(data);
    }
}