import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        System.out.println("Aufgabe 1 \n#############################");

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
    }

    public static void ex2() {
        System.out.println("Aufgabe 2 \n#############################");

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

    public static void ex3() {
        System.out.println("Aufgabe 3 \n#############################");
        arrayEx1();
        arrayEx2();
        arrayEx3();
        arrayEx4();
    }


    public static void arrayEx1() {

        NumbersAsArray num1 = new NumbersAsArray(1, 3, 0, 0, 0, 0, 0, 0, 0);
        NumbersAsArray num2 = new NumbersAsArray(8, 7, 0, 0, 0, 0, 0, 0, 0);

        int[] additionResult = num1.add(num2);
        for (int i : additionResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

        public static void arrayEx2() {
        NumbersAsArray num1 = new NumbersAsArray(8, 3, 0, 0, 0, 0, 0, 0, 0);
        NumbersAsArray num2 = new NumbersAsArray(5, 4, 0, 0, 0, 0, 0, 0, 0);

        int[] subtractionResult = num1.sutract(num2);
        for (int i : subtractionResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void arrayEx3() {

        NumbersAsArray num = new NumbersAsArray(2, 3, 6, 0, 0, 0, 0, 0, 0);
        int[] multiplicationResult = num.multiply(2);
        for (int i : multiplicationResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void arrayEx4() {

        NumbersAsArray num = new NumbersAsArray(2, 3, 6, 0, 0, 0, 0, 0, 0);
        int[] divisionResult = num.divide(2);
        for (int i : divisionResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ex4() {

        System.out.println("Aufgabe 4 \n#############################");

        ArrayList<Integer> keyboardPrices = new ArrayList<>();
        keyboardPrices.add(40);
        keyboardPrices.add(50);
        keyboardPrices.add(60);

        ArrayList<Integer> usbPrice = new ArrayList<>();
        usbPrice.add(12);
        usbPrice.add(8);


        // Create Keyboard and USB objects
        Keyboard keyboard = new Keyboard(keyboardPrices);
        USB usb = new USB(usbPrice);

        // Create a Budget object with a budget of 600
        Budget budget = new Budget(60);

        // Test the mostCheap method
        int cheapestKeyboard = budget.mostCheap(keyboard);
        System.out.println("Cheapest keyboard price: " + cheapestKeyboard); // Expected output: 150

        // Test the mostExpensive method
        int mostExpensiveAccessory = budget.mostExpensive(new PcAccessory(usbPrice) {
        });
        System.out.println("Most expensive accessory price: " + mostExpensiveAccessory); // Expected output: 400

        System.out.println("Most expensive affordable USB " + budget.mostExpensiveAffordable(usb));
        System.out.println("Total spend: " + budget.totalSpent(keyboard, usb));
    }


}