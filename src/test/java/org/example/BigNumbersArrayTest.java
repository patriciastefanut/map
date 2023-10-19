package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigNumbersArrayTest {
    @Test
    public void testFindMinSumOfNMinusOne() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 25;
        assertEquals(expected, NumberArrayUtils.findMinSumOfNMinusOne(numbers));
    }

    @Test
    public void testFindMinSumOfNMinusOneWithSingleElement() {
        int[] numbers = {5};
        int expected = 0; // Pentru un singur element, suma minimă este 0
        assertEquals(expected, NumberArrayUtils.findMinSumOfNMinusOne(numbers));
    }

    @Test
    public void testSubtractLargeNumbers() {
        int[] num1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {2, 9, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, LargeNumberMath.subtractLargeNumbers(num1, num2));
    }

    @Test
    public void testSubtractLargeNumbersWithBorrow() {
        int[] num1 = {1, 0, 0, 0};
        int[] num2 = {2};
        int[] expected = {9, 8, 0, 0};
        assertArrayEquals(expected, LargeNumberMath.subtractLargeNumbers(num1, num2));
    }

    @Test
    public void testMultiplyLargeNumberByDigit() {
        int[] num = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digit = 2;
        int[] expected = {4, 7, 2, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, LargeNumberMath.multiplyLargeNumberByDigit(num, digit));
    }

    @Test
    public void testMultiplyLargeNumberByZero() {
        int[] num = {4, 8, 3, 2};
        int digit = 0;
        int[] expected = {0};
        assertArrayEquals(expected, LargeNumberMath.multiplyLargeNumberByDigit(num, digit));
    }

    @Test
    public void testDivideLargeNumberByDigit() {
        int[] num = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digit = 2;
        int[] expected = {1, 1, 8, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, LargeNumberMath.divideLargeNumberByDigit(num, digit));
    }

    @Test
    public void testDivideLargeNumberByZero() {
        int[] num = {4, 8, 3, 2};
        int digit = 0;
        int[] expected = null; // Unerwarteter Fall: Division durch Null
        assertNull(LargeNumberMath.divideLargeNumberByDigit(num, digit));
    }
}
