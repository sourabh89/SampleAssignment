package com.example.information.test.testSystem.utility;

import java.util.HashMap;

public class Utility {

    //to find the largest number in aan array
    public int largestNumber(int[] arr){
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    //to find the duplicateCharacters from the string
    public HashMap duplicateCharacters(String str){

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (Character ch : charArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
    //to find the removeWhiteSpace from the string
    public String removeWhiteSpace(String str){
        char[] charArray = str.toCharArray();

        String stringWithoutSpaces = "";

        for (int i = 0; i < charArray.length; i++)
        {
            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
            {
                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
            }
        }
            return stringWithoutSpaces;
    }
}
