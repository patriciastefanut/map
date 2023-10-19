package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class GradeCalculatorTest {

    @Test
    public void expected_testGetFailingGrades() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        int[] grades = {75, 42, 35, 90};
        int[] expected = {35};
        assertArrayEquals(expected, gradeCalculator.getFailingGrades(grades));

        int[] grades2 = {85, 90, 95};
        int[] expected2 = {};
        assertArrayEquals(expected2, gradeCalculator.getFailingGrades(grades2));
    }

    @Test
    public void unexpected_testGetFailingGrades() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> gradeCalculator.getFailingGrades(new int[]{}));
    }

    @Test
    public void testCalculateAverage() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        int[] grades = {85, 92, 78, 64};
        double expected = 79.75;
        assertEquals(expected, gradeCalculator.calculateAverage(grades), 0.01);
    }

    @Test
    public void unexpected_testCalculatorAverage() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> gradeCalculator.calculateAverage(new int[]{}));
    }

    @Test
    public void testRoundGrades() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        int[] grades = {85, 92, 78, 64};
        int[] expected = {85, 92, 80, 65};
        assertArrayEquals(expected, gradeCalculator.roundGrades(grades));

        int[] grades2 = {30, 35, 38, 39};
        int[] expected2 = {30, 35, 38, 39};
        assertArrayEquals(expected2, gradeCalculator.roundGrades(grades2));
    }

    @Test
    public void testGetMaxRoundedGrade() {
        GradeCalculator gradeCalculator = new GradeCalculator();

        int[] grades = {85, 92, 78, 64};
        int expected = 92;
        assertEquals(expected, gradeCalculator.getMaxRoundedGrade(grades));

        int[] grades2 = {30, 33, 38, 39};
        int expected2 = 39;
        assertEquals(expected2, gradeCalculator.getMaxRoundedGrade(grades2));
    }
}
