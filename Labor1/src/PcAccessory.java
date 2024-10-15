import java.util.ArrayList;

public abstract class PcAccessory {

    protected ArrayList<Integer> priceList = new ArrayList<>();

    public PcAccessory(int... prices) {
        for (int price : prices) {
            if (price >= 0)
                priceList.add(price);
        }
    }

}
