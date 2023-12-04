package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {

    @Test
    public void testFindMaximumValue() {
        int[] testArray = {3, 5, 9, 1, 10};
        assertEquals(10, ArrayOperations.findMaximumValue(testArray));
    }

    @Test
    public void testCalculateAverage() {
        int[] testArray = {10, 20, 30, 40, 50};
        assertEquals(30.0, ArrayOperations.calculateAverage(testArray));
    }

    @Test
    public void testReverseArray() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = {5, 4, 3, 2, 1};
        assertArrayEquals(reversedArray, ArrayOperations.reverseArray(originalArray));
    }
}
