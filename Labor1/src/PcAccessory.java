import java.util.ArrayList;

public abstract class PcAccessory {

    protected ArrayList<Integer> priceList = new ArrayList<>();

    public PcAccessory(ArrayList<Integer> prices) {
        for (int price : prices) {
            if (price >= 0)
                priceList.add(price);
        }
    }

    public ArrayList<Integer> getPriceList() { return priceList; }

    public void addToPriceList(int price) { priceList.add(price); }
}
