package alcohol.ourMarket;

import alcohol.AlcoholSpecificity;
import alcohol.interfaces.Printable;

public class OurProduction extends AlcoholSpecificity implements Printable {
    int domesticPrice;
    public OurProduction(String name, String colour, int price, boolean legal, int strengthAlcoholInPercent, int domesticPrice) {
        super(name, colour, price, legal, strengthAlcoholInPercent);
        this.domesticPrice = domesticPrice;
    }
    @Override
    public void print() {
        System.out.println();
    }
    @Override
    public String toString() {
        return "OurProduction{" +
                "domesticPrice=" + domesticPrice +
                '}';
    }

    public static void main(String[] args) {
        AlcoholSpecificity vodka = new AlcoholSpecificity("Vodka","White",100,true,40);
        System.out.println(vodka);
        System.out.println(new OurProduction("Vodka","White",100,true,40,85));

    }


}
