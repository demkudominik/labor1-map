public class Numbers {

    private final int[] number;

    public Numbers(int... numbers) {
        this.number = numbers;
    }

    public int minimalNumber() {
        int minimalNumber = number[0];
        for (Integer number : number)
            if (minimalNumber > number)
                minimalNumber = number;
        return minimalNumber;
    }

    public int maximumNumber() {
        int maximumNumber = number[0];
        for (Integer number : number)
            if (maximumNumber < number)
                maximumNumber = number;
        return maximumNumber;
    }

    public int sum() {
        int sum = 0;
        for (Integer number : number)
            sum += number;
        return sum;
    }

    public int sumWithoutMinimalNumber(){return sum() - minimalNumber();}
    public int sumWithoutMaximalNumber(){return sum() - maximumNumber();}
}
