package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     * //iterating over an array
     *
     */ // TODO
    public static boolean contains(String[] array, String value) {
//       // boolean b = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equals(value)){
//            b =true;
//        }}
//        for (int i = 0; i < array.length; i++) {
//            String currentValue = array[i];

        for(String currentValue : array){
            if(currentValue.equals(value)) {
        return true;
    }
}

        return false;
                }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] newArray = new String[array.length];//Create array

        //itar through backwards

        for (int currentIndex = array.length-1; currentIndex >=0 ; currentIndex--) {

            String currentString = array[currentIndex]; //get current string from current index

           int newArrayIndex = (array.length-currentIndex)-1;//derive current index from new index

        //place current string in array at (length-current index-1) = new Array current index
            newArray[newArrayIndex] = currentString;
        }

        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
       String[] reversedArray = reverse(array);



        return Arrays.equals(array, reversedArray);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {


        String stringRepresentation = Arrays.toString(array).toLowerCase(); //concanates to one string
        for (Character letter = 'a'; letter < 'z'; letter++) { //verifes every letter in string
            String letterAsString = "" + letter;
            if (stringRepresentation.contains(letterAsString) == false) {

            return false;
        }
    }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i=0; i<array.length; i++){

            if ( value == array[i]){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int k=0;
        int n=getNumberOfOccurrences(array,valueToRemove);
        String [] newArray = new String [array.length-n];

        for ( int i= 0; i<array.length; i++){

            if ( !array[i].equals(valueToRemove)){
                newArray[k]= array[i];
                k++;
            }
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {



        int removeConDup = 0;

        for(int i = 0; i < array.length-1; i++){
            if(array[i].equals(array[i+1])){
                removeConDup = removeConDup + 1;
            }
        }

        String[] newArray = new String[array.length - removeConDup];



        int j=0;
        for(int i = 0; i < array.length-1; i++){
            if(!array[i].equals(array[i + 1])){
                newArray[j++] = (array[i]);
            }
        }

        newArray[newArray.length-1] = array[array.length-1];

        return newArray;
    }




    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {




        return null;


    }
}
