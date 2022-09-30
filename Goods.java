package HW_01;

public class Goods {
    String name;
    Double price;
    Integer quantity;
    String unit;

    public Goods(String name, Double price, Integer quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return  "название:'" + this.name + '\'' +
                ", цена:" + this.price +
                ", колличество:" + this.quantity +
                ", еденица:'" + this.unit + '\'';
    }
}
