package HW_01;

public class Bread extends Foods{
    String flourType;

    public Bread(String name, Double price, Integer quantity, String unit, String shelfLife, String flourType) {
        super(name, price, quantity, unit, shelfLife);
        this.flourType = flourType;
    }

    public Bread() {
    }

    @Override
    public String toString() {
        return super.toString() + ", тип муки:'" + this.flourType + '\'';
    }
}
