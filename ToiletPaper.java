package HW_01;

public class ToiletPaper extends Hygiene{
    Integer layers;

    public ToiletPaper(String name, Double price, Integer quantity, String unit, Integer qtyInPackage, Integer layers) {
        super(name, price, quantity, unit, qtyInPackage);
        this.layers = layers;
    }

    public ToiletPaper() {
    }

    @Override
    public String toString() {
        return super.toString() + ", слои:" + this.layers;
    }
}