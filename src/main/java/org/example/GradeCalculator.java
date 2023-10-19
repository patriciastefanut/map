package org.example;

public class GradeCalculator {

    public int nrOfFailingGrades(int[] grades) {
        if (grades.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int num = 0;
        for (int grade: grades) {
            if (grade < 38) num ++;
        }
        return num;
    }

    public int[] getFailingGrades(int[] grades) {
        if (grades.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int[] failingGrades = new int[nrOfFailingGrades(grades)];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index] = grade;
                index++;
            }
        }
        return failingGrades;
    }

    public double calculateAverage(int[] grades) {
        if (grades.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public int[] roundGrades(int[] grades) {
        if (grades.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade < 38) {
                roundedGrades[i] = grade;
            } else {
                int nextMultipleOf5 = (int) Math.ceil(grade / 5.0) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    roundedGrades[i] = nextMultipleOf5;
                } else {
                    roundedGrades[i] = grade;
                }
            }
        }
        return roundedGrades;
    }

    public int getMaxRoundedGrade(int[] grades) {
        if (grades.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int maxRoundedGrade = Integer.MIN_VALUE;
        for (int grade : grades) {
            int roundedGrade = grade;
            if (grade >= 38) {
                int nextMultipleOf5 = (int) Math.ceil(grade / 5.0) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    roundedGrade = nextMultipleOf5;
                }
            }
            if (roundedGrade > maxRoundedGrade) {
                maxRoundedGrade = roundedGrade;
            }
        }
        return maxRoundedGrade;
    }
}
