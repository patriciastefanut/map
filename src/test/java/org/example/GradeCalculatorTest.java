package org.example;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    @Test
    public void testGetFailingGrades() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        int[] grades = {75, 42, 35, 90};
        int[] expected = {35};
        assertArrayEquals(expected, gradeCalculator.getFailingGrades(grades));

        int[] grades2 = {85, 90, 95};
        int[] expected2 = {};
        assertArrayEquals(expected2, gradeCalculator.getFailingGrades(grades2));
    }

    @Test
    public void testCalculateAverage() {
        int[] grades = {85, 92, 78, 64};
        double expected = 79.75;
        assertEquals(expected, GradeCalculator.calculateAverage(grades), 0.01);

        int[] grades2 = {};
        double expected2 = 0.0;
        assertEquals(expected2, GradeCalculator.calculateAverage(grades2), 0.01);
    }

    @Test
    public void testRoundGrades() {
        int[] grades = {85, 92, 78, 64};
        int[] expected = {85, 92, 80, 65};
        assertArrayEquals(expected, GradeCalculator.roundGrades(grades));

        int[] grades2 = {30, 35, 38, 39};
        int[] expected2 = {30, 35, 38, 39};
        assertArrayEquals(expected2, GradeCalculator.roundGrades(grades2));
    }

    @Test
    public void testGetMaxRoundedGrade() {
        int[] grades = {85, 92, 78, 64};
        int expected = 92;
        assertEquals(expected, GradeCalculator.getMaxRoundedGrade(grades));

        int[] grades2 = {30, 33, 38, 39};
        int expected2 = 39;
        assertEquals(expected2, GradeCalculator.getMaxRoundedGrade(grades2));
    }
}
