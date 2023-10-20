package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberArrayTest {
    @Test
    public void expectedTestFindMax() throws Exception {
        NumberArrayUtils numberArrayUtils = new NumberArrayUtils();
        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 17;
        assertEquals(expected, numberArrayUtils.findMax(numbers));
    }

    @Test
    public void unexpectedTestFindMaxWithEmptyArray() {
        NumberArrayUtils numberArrayUtils = new NumberArrayUtils();
        int[] numbers = new int[0];
        try {
            numberArrayUtils.findMax(numbers);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void expectedTestFindMin() throws Exception {
        NumberArrayUtils numberArrayUtils = new NumberArrayUtils();

        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 3;
        assertEquals(expected, numberArrayUtils.findMin(numbers));
    }

    @Test
    public void unexpectedTestFindMinWithEmptyArray() {
        NumberArrayUtils numberArrayUtils = new NumberArrayUtils();

        int[] numbers = {};
        try {
            numberArrayUtils.findMin(numbers);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void expectedTestFindMaxSumOfNMinusOne() throws Exception {
        NumberArrayUtils numberArrayUtils = new NumberArrayUtils();

        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 39;
        assertEquals(expected, numberArrayUtils.findMaxSumOfNMinusOne(numbers));
    }

    @Test
    public void unexpectedTestFindMaxSumOfNMinusOneWithSingleElement() {
        NumberArrayUtils numberArrayUtils = new NumberArrayUtils();

        int[] numbers = {5};
        try {
            numberArrayUtils.findMaxSumOfNMinusOne(numbers);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testFindMinSumOfNMinusOne() throws Exception {
        NumberArrayUtils numberArrayUtils = new NumberArrayUtils();

        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 25;
        assertEquals(expected, numberArrayUtils.findMinSumOfNMinusOne(numbers));
    }

    @Test
    public void testFindMinSumOfNMinusOneWithSingleElement() {
        NumberArrayUtils numberArrayUtils = new NumberArrayUtils();

        int[] numbers = {5};
        try {
            numberArrayUtils.findMinSumOfNMinusOne(numbers);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

