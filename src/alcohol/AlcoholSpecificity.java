package alcohol;

public class AlcoholSpecificity {
    String name;
    String colour;
    int price;
    boolean legal;
    int strengthAlcoholInPercent;

    public AlcoholSpecificity(String name, String colour, int price, boolean legal, int strengthAlcoholInPercent) {
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.legal = legal;
        this.strengthAlcoholInPercent = strengthAlcoholInPercent;
    }

    @Override
    public String toString() {
        return "AlcoholSpecificity{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", legal=" + legal +
                ", strengthAlcoholInPercent=" + strengthAlcoholInPercent +
                '}';
    }

}