import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Universitat universitat = new Universitat();

        ArrayList<Integer> grades= new ArrayList<>(Arrays.asList(29, 37, 38, 41, 84, 67));

        ArrayList<Integer> insufficientGrades = universitat.insufficientGrades(grades);
        System.out.println(insufficientGrades);

        int avrageGrade = universitat.averageGrade(grades);
        System.out.println(avrageGrade);

        ArrayList<Integer> roundedGrades = universitat.roundedGrades(grades);
        System.out.println(roundedGrades);

        int maximalRoundedGrade = universitat.maximalRoundedGrade(grades);
        System.out.println(maximalRoundedGrade);
    }

}