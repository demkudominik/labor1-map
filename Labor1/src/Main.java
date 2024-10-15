import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Universitat universitat = new Universitat();

        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(29, 37, 38, 41, 84, 67));

        ArrayList<Integer> insufficientGrades = universitat.insufficientGrades(grades);
        System.out.println(insufficientGrades);

        int avrageGrade = universitat.averageGrade(grades);
        System.out.println(avrageGrade);

        ArrayList<Integer> roundedGrades = universitat.roundedGrades(grades);
        System.out.println(roundedGrades);

        int maximalRoundedGrade = universitat.maximalRoundedGrade(grades);
        System.out.println(maximalRoundedGrade);

        System.out.println("\n aufgabe2");

        numberEx();
    }

    public static void numberEx() {
        Numbers numbers = new Numbers(4, 8, 3, 10, 17);

        int maximalNumber = numbers.maximumNumber();
        System.out.println(maximalNumber);

        int minimalNumber = numbers.minimalNumber();
        System.out.println(minimalNumber);

        int sumWithoutMinimalNumber = numbers.sumWithoutMinimalNumber();
        System.out.println(sumWithoutMinimalNumber);

        int sumWithoutMaximalNumber = numbers.sumWithoutMaximalNumber();
        System.out.println(sumWithoutMaximalNumber);

    }
}