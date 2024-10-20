import java.util.ArrayList;

public class Universitat {


    public int nextMultipleOf5(int number) {
        return number / 5 * 5 + 5;
    }

    public int round(int grade) {
        if (grade != 100 && nextMultipleOf5(grade) - grade < 3) {
            return nextMultipleOf5(grade);
        }
        return grade;
    }

    public boolean isInsufficient(int grade) {
        return (grade < 38 || round(grade) < 40);
    }

    public ArrayList<Integer> insufficientGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            if (isInsufficient(grade)) {
                result.add(grade);
            }
        }
        return result;
    }

    public int sumOfArrayElements(ArrayList<Integer> array) {
        int sum = 0;
        for (Integer element: array)
            sum += element;
        return sum;

    }
    public int averageGrade(ArrayList<Integer> grades) {
        if (grades.isEmpty()) {
            return 0;
        }return sumOfArrayElements(grades) / grades.size();

    }

    public ArrayList<Integer> roundedGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer grade : grades)
            result.add(round(grade));
        return result;
    }

    public int maximalRoundedGrade(ArrayList<Integer> grades) {
        int maximalRoundedGrade = 0;
        for (Integer grade : grades)
            if (round(grade) != grade && maximalRoundedGrade < round(grade))
                maximalRoundedGrade = round(grade);
        return maximalRoundedGrade;
    }

}
