package alcohol.overseasMarket;

import alcohol.AlcoholSpecificity;
import alcohol.interfaces.Printable;

public class OverseasProduction extends AlcoholSpecificity implements Printable {
    int domesticPrice;
    public OverseasProduction(String name, String colour, int price, boolean legal, int strengthAlcoholInPercent, int domesticPrice) {
        super(name, colour, price, legal, strengthAlcoholInPercent);
        this.domesticPrice = domesticPrice;
    }
    @Override
    public void print() {
        System.out.println();
    }
    @Override
    public String toString() {
        return "OverseasProduction{" +
                "domesticPrice=" + domesticPrice +
                '}';
    }


}
