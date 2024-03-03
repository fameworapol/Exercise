package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getRow(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result  = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> resultTemp = new ArrayList<>();
            if (i == 1){
                resultTemp.add(1);
            } else if (i == 2) {
                resultTemp.add(1);
                resultTemp.add(1);
            } else if (i==3) {
                resultTemp.add(1);
                resultTemp.add(2);
                resultTemp.add(1);
            } else {
                List<Integer> lastElement = result.get(result.size()-1);
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i-1){
                        resultTemp.add(1);
                    }else {
                        resultTemp.add(lastElement.get(j) + lastElement.get((j-1)));
                    }
                }
            }
            result.add(resultTemp);
        }
        return  result;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result  = new ArrayList<>();
        for (int i = 1; i <= rowIndex+1; i++) {
            List<Integer> resultTemp = new ArrayList<>();
            if (i == 1){
                resultTemp.add(1);
            } else if (i == 2) {
                resultTemp.add(1);
                resultTemp.add(1);
            } else if (i==3) {
                resultTemp.add(1);
                resultTemp.add(2);
                resultTemp.add(1);
            } else {
                List<Integer> lastElement = result.get(result.size()-1);
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i-1){
                        resultTemp.add(1);
                    }else {
                        resultTemp.add(lastElement.get(j) + lastElement.get((j-1)));
                    }
                }
            }
            result.add(resultTemp);
            if (i-1 == rowIndex){
                return resultTemp;
            }

        }
        return  new ArrayList<>();
    }
}