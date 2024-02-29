package org.example;

public class Main {
    public static void main(String[] args) {
        String testCase =
                "hacakaeararanaka " +
                "hhhhaaaaackkkkerrrrrrrrank " +
                "crackerhackerknar " +
                "hhhackkerbanker";
        String[] testCaseArr = testCase.split(" ");
        for (int i = 0; i < testCaseArr.length; i++) {
            System.out.println(testCaseArr[i]);
            System.out.println(hackerrankInString(testCaseArr[i]));
        }


    }

    public static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int index = 0;
        // Write your code here
        for (int i = 0; i < s.length(); i++) {
//            Character sTemp = s.charAt(i);
//            Character hTemp = hackerrank.charAt(index);
            if (index==hackerrank.length()){
                return "YES";
            }
            if (s.charAt(i) == hackerrank.charAt(index)){
                index++;
            }
        }
        if (index==hackerrank.length()){
            return "YES";
        }else {
            return "NO";
        }
    }
}