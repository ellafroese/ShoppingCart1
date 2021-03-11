package shopping;

public class Milch extends Produkt implements iBuyable {

    @Override
    public double getPrice() {
        return 2.5;
    }
}
