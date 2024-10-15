import java.util.ArrayList;
import java.util.Collections;

public class Budget {
    private int budgetValue;

    public Budget(int budgetValue) {
        this.budgetValue = budgetValue;
    }

    private int getMinimum(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            return -1; //Empty = -1
        } else {
            return Collections.min(array); //not Emplty min value
        }
    }

    private int getMaximum(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            return -1; //Empty = -1
        } else {
            return Collections.max(array); //not Emplty max value
        }
    }

    private ArrayList<Integer> filterPrices(ArrayList<Integer> priceList) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int price : priceList) {
            if (price <= budgetValue)
                result.add(price);
        }
        return result;
    }


}