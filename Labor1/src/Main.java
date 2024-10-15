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

        System.out.println("\n aufgabe3");
        ArrayEx1();
        ArrayEx2();
        ArrayEx3();
        ArrayEx4();
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

    public static void ArrayEx1() {

        NumbersAsArray num1 = new NumbersAsArray(1, 3, 0, 0, 0, 0, 0, 0, 0);
        NumbersAsArray num2 = new NumbersAsArray(8, 7, 0, 0, 0, 0, 0, 0, 0);

        int[] additionResult = num1.add(num2);
        for (int i : additionResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

        public static void ArrayEx2() {
        NumbersAsArray num1 = new NumbersAsArray(8, 3, 0, 0, 0, 0, 0, 0, 0);
        NumbersAsArray num2 = new NumbersAsArray(5, 4, 0, 0, 0, 0, 0, 0, 0);

        int[] subtractionResult = num1.sutract(num2);
        for (int i : subtractionResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ArrayEx3() {

        NumbersAsArray num = new NumbersAsArray(2, 3, 6, 0, 0, 0, 0, 0, 0);
        int[] multiplicationResult = num.multiply(2);
        for (int i : multiplicationResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ArrayEx4() {

        NumbersAsArray num = new NumbersAsArray(2, 3, 6, 0, 0, 0, 0, 0, 0);
        int[] divisionResult = num.divide(2);
        for (int i : divisionResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
