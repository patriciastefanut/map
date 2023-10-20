package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigNumbersArrayTest {
    @Test
    public void expectedTestAddLargeNumbers() throws Exception {
        BigNumbersArray bigNumbersArray = new BigNumbersArray();
        int[] number1 = new int[]{3, 5, 0, 0, 0};
        int[] number2 = new int[]{1, 2, 0, 0, 0};
        int[] expected = new int[]{4, 7, 0, 0, 0};

        assertArrayEquals(expected, bigNumbersArray.addLargeNumbers(number1, number2));
    }

    @Test
    public void unexpectedTestAddLargeNumbers() {
        BigNumbersArray bigNumbersArray = new BigNumbersArray();

        assertThrows(Exception.class, () -> bigNumbersArray.addLargeNumbers(new int[]{}, new int[0]));
        assertThrows(Exception.class, () -> bigNumbersArray.addLargeNumbers(new int[]{1, 2}, new int[]{3}));
    }

    @Test
    public void expectedTestSubtractLargeNumbers() throws Exception {
        BigNumbersArray bigNumbersArray = new BigNumbersArray();
        int[] number1 = new int[]{3, 5, 0, 0, 0};
        int[] number2 = new int[]{1, 2, 0, 0, 0};
        int[] expected = new int[]{2, 3, 0, 0, 0};

        assertArrayEquals(expected, bigNumbersArray.subtractLargeNumbers(number1, number2));
    }

    @Test
    public void unexpectedTestSubtractLargeNumbers() {
        BigNumbersArray bigNumbersArray = new BigNumbersArray();

        assertThrows(Exception.class, () -> bigNumbersArray.subtractLargeNumbers(new int[]{}, new int[0]));
        assertThrows(Exception.class, () -> bigNumbersArray.subtractLargeNumbers(new int[]{1, 2}, new int[]{3}));
    }

    @Test
    public void expectedTestMultiplyLargeNumbers() throws Exception {
        BigNumbersArray bigNumbersArray = new BigNumbersArray();
        int[] number = new int[]{3, 5, 0, 0, 0};
        int[] expected = new int[]{7, 0, 0, 0, 0};
        assertArrayEquals(expected, bigNumbersArray.multiplyLargeNumberByDigit(number, 2));
    }

    @Test
    public void unexpectedTestMultiplyLargeNumbers() {
        BigNumbersArray bigNumbersArray = new BigNumbersArray();

        assertThrows(Exception.class, () -> bigNumbersArray.divideLargeNumberByDigit(new int[]{}, 2));
    }

    @Test
    public void expectedTestDivideLargeNumbers() throws Exception {
        BigNumbersArray bigNumbersArray = new BigNumbersArray();
        int[] number = new int[]{3, 5, 0, 0, 0};
        int[] expected = new int[]{1, 7, 5, 0, 0};
        assertArrayEquals(expected, bigNumbersArray.divideLargeNumberByDigit(number, 2));
    }

    @Test
    public void unexpectedTestDivideLargeNumbers() {
        BigNumbersArray bigNumbersArray = new BigNumbersArray();

        assertThrows(Exception.class, () -> bigNumbersArray.divideLargeNumberByDigit(new int[]{}, 3));
        assertThrows(Exception.class, () -> bigNumbersArray.divideLargeNumberByDigit(new int[]{1, 2}, 0));
    }
}
