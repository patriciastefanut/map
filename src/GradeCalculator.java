import java.util.ArrayList;
import java.util.List;

public class GradeCalculator {
    public static int[] getFailingGrades(int[] grades) {
        List<Integer> failingGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades.add(grade);
            }
        }
        return failingGrades.stream().mapToInt(Integer::intValue).toArray();
    }

    public static double calculateAverage(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int[] roundGrades(int[] grades) {
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

    public static int getMaxRoundedGrade(int[] grades) {
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
