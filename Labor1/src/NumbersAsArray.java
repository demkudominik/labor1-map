public class NumbersAsArray {

    private final int[] digits;

    public int[] get (){return digits;}

    public NumbersAsArray (int...digits){ this.digits = digits;}


    public int arrayToNumber(int[] numberAsArray){
        StringBuilder stringBuilder = new StringBuilder();
        for(int digit : numberAsArray){
            stringBuilder.append(digit);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public int[] numberToArray(int number){
        int numberOfDigits = (int) Math.log10(number) + 1;

        int[] result = new int[numberOfDigits];
        for(int i = numberOfDigits - 1; i >= 0; i--){
            result[i] = number % 10;
            number /= 10;
        }
        return result;
    }

    public int[] add(NumbersAsArray other){ return numberToArray(arrayToNumber(digits) + arrayToNumber(other.get())); }

    public int[] sutract(NumbersAsArray other){
        return numberToArray(Math.abs(arrayToNumber(digits) - arrayToNumber(other.get())));
    }
}
