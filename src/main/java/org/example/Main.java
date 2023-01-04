package org.example;

/*
Test task
You have two strings as an input, 3 > n > 5000, where n is a string length
Output is a boolean, which indicates if these two string are anagrams(case insensitive)
Write unit tests that covers at least 80% cases
Tech stack: Java 8+, JUnit 5
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String firstString, String secondString) {
        if(firstString.length() != secondString.length()) {
            return false;
        }

        char[] sortedFirstString = firstString.toLowerCase().toCharArray();
        char[] sortedSecondString = secondString.toLowerCase().toCharArray();

        Arrays.sort(sortedFirstString);
        Arrays.sort(sortedSecondString);

        return Arrays.equals(sortedFirstString, sortedSecondString);
    }
}