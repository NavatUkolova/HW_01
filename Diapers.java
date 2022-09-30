package HW_01;

public class Diapers extends Hygiene{
    Integer size;
    Integer minWeight;
    Integer maxWeight;
    String type;

    public Diapers(String name, Double price, Integer quantity, String unit, Integer qtyInPackage,
                   Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, price, quantity, unit, qtyInPackage);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public Diapers() {
    }

    @Override
    public String toString() {
        return super.toString() + ", размер:" + this.size
                                + ", min вес:" + this.minWeight
                                + ", max вес:" + this.maxWeight
                                + ", тип:'" + this.type + '\'';
    }
}
