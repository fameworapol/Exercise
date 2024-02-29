package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s = "beabeefeab";
        System.out.println(alternate(s));
    }

    public static int alternate(String s) {
        // Write your code here
        int maxPattern = 0;

        if(s.length() == 1)//Edge case where length is 1
        {
            System.out.println(maxPattern);
            System.exit(0);
        }

        //Loop through all letter pairs
        for(int i = 0; i < 26; i++)
        {
            nextLetter:
            for(int j = i + 1; j < 26; j++)
            {
                char one = (char) ('a' + i); //First char in pair
                char two = (char) ('a' + j); //Second char in pair
                char lastSeen = '\u0000';
                int patternLength = 0;

                for(char letter : s.toCharArray())
                {
                    if(letter == one || letter == two)
                    {
                        if(letter == lastSeen)//Duplicate found
                        {
                            continue nextLetter;
                        }
                        //Not a duplicate
                        patternLength++;
                        lastSeen = letter;
                    }
                }//for char : s

                maxPattern = Math.max(patternLength, maxPattern); //Keep a running max

            }//for j
        }//for i
        return maxPattern;
    }
}