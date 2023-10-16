import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class NumberArrayTest {
    @Test
    public void testFindMax() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 17;
        assertEquals(expected, NumberArrayUtils.findMax(numbers));
    }

    @Test
    public void testFindMaxWithEmptyArray() {
        int[] numbers = {};
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, NumberArrayUtils.findMax(numbers));
    }

    @Test
    public void testFindMin() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 3;
        assertEquals(expected, NumberArrayUtils.findMin(numbers));
    }

    @Test
    public void testFindMinWithEmptyArray() {
        int[] numbers = {};
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, NumberArrayUtils.findMin(numbers));
    }

    @Test
    public void testFindMaxSumOfNMinusOne() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 39;
        assertEquals(expected, NumberArrayUtils.findMaxSumOfNMinusOne(numbers));
    }

    @Test
    public void testFindMaxSumOfNMinusOneWithSingleElement() {
        int[] numbers = {5};
        int expected = 0; // Pentru un singur element, suma minimă este 0
        assertEquals(expected, NumberArrayUtils.findMaxSumOfNMinusOne(numbers));
    }

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
}
