import java.util.ArrayList;
import java.util.Collections;

public class Budget {
    private int budgetValue;

    public Budget(int budgetValue) {
        this.budgetValue = budgetValue;
    }

    private int getMinimum(ArrayList<Integer> array) {
        if (array == null ||  array.isEmpty()) {
            return -1; //Empty = -1
        } else {
            return Collections.min(array); //not Emplty min value
        }
    }

    private int getMaximum(ArrayList<Integer> array) {
        if (array == null || array.isEmpty()) {
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

    public int get_budgetValue() {
        return budgetValue;
    }

    public int mostCheap(Keyboard keyboard) {
        return getMinimum(keyboard.getPriceList());
    }

    public int mostExpensive(PcAccessory pcAccessory) {
        return getMaximum(pcAccessory.getPriceList());
    }


    public int mostExpensiveAffordable(USB usb) {
        return getMaximum(filterPrices(usb.getPriceList()));
    }

    public int totalSpent(Keyboard keyboard, USB usb) {

        int finalPrice;
        int maxFinalPrice = -1;

        for ( int keyboardPrice: keyboard.getPriceList() ) {
            for ( int usbPrice: usb.getPriceList() ) {
                finalPrice = keyboardPrice + usbPrice;
                if ( finalPrice <= budgetValue && maxFinalPrice < finalPrice ) {
                    maxFinalPrice =  finalPrice;
                }
            }
        }
        return maxFinalPrice;
    }

}