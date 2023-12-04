package com.example;

public class ArrayOperations {
    // Exercise 1: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        int[] arrays = array;
        for(int i = 0; i > arrays.length-1; i++){
            if(arrays[i] > arrays[i+1]){
                int dummy = arrays[i+1];
                array[i+1] = i;
                arrays[i] = dummy;
                
            }
        }
        // TODO: Implement the logic to find the maximum value in the array.
        return arrays[arrays.length-1]; // Placeholder return value
    }

    // Exercise 2: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        double count = 0;
        double average = 0;
        for(int i: array){
            count += i;
        }
        average = count/array.length;
        // TODO: Implement the logic to calculate the average of the array elements.
        return average; // Placeholder return value
    }

    // Exercise 3: Reverse an Array
    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for(int i = array.length-1; i > -1; i--){
            reverse[array.length-1-i] = array[i];
        }
        // TODO: Implement the logic to reverse the array.
        return reverse; // Placeholder return value
    }
}
