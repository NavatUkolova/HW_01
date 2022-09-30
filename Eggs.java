package HW_01;

public class Eggs extends Foods{
    Integer qtyInPackage;

    public Eggs(String name, Double price, Integer quantity, String unit, String shelfLife, Integer qtyInPackage) {
        super(name, price, quantity, unit, shelfLife);
        this.qtyInPackage = qtyInPackage;
    }

    public Eggs() {
    }

    @Override
    public String toString() {
        return super.toString() + ", колличество в упаковке:" + this.qtyInPackage;
    }
}
