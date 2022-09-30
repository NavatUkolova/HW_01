package HW_01;

import java.util.ArrayList;

public class program {

    public static void printProductList(ArrayList<Goods> productList) {
        int count = 1;
        for (Goods product: productList) {
            System.out.printf("%d. Информация о продукте %s\n", count, product.name);
            System.out.println(product);
            count+=1;
        }
    }

    public static void main(String[] args) {

        Goods good = new Goods();
        Foods caesar = new Foods("Нагетцы'", 300.0, 1, "шт",
                "05.12.2022");
        Drinks colaChernogolovka = new Drinks("Лимонад 'Волжанка'", 50.00,
                1, "шт", "2 л.");
        Hygiene wipes = new Hygiene("Салфетки 'Клинекс'", 30.00, 1,
                "шт", 20);
        KidsGoods pony = new KidsGoods("Игрушка мягкая", 950.00, 1, "шт",
                3, "Да");
        Milk domikVDerevne = new Milk("Молоко'Простоквашино'", 95.00,
                1, "шт", "1 л.", "2.5%", "05.10.2022");
        Lemonade lemonadeChernogolovka = new Lemonade("Лимонад 'Кола'",
                95.00, 1, "шт", "2 л.");
        Bread kolomenskiy = new Bread("Хлеб Старосельский", 45.00, 1, "шт",
                "01.10.2022", "1 сорт");
        Eggs okskoe = new Eggs("Яйцо Спутник СО", 55.00, 1, "шт",
                "15.11.2022", 10);
        Masks masks = new Masks("Маски одноразовые", 45.00, 1,
                "шт", 60);
        ToiletPaper tpLenta = new ToiletPaper("Туалетная бумага 'Магнит'", 130.00, 1,
                "шт", 10, 2);
        Diapers pampers = new Diapers("Подгузники 'Merris'", 1600.00, 1,
                "шт", 76, 3, 6, 11, "мягкие");
        Pacifier pacifier = new Pacifier("Соска детская", 450.00, 1,
                "шт", 1);
        ArrayList<Goods> productList= new ArrayList<>();
        productList.add(good);
        productList.add(caesar);
        productList.add(colaChernogolovka);
        productList.add(wipes);
        productList.add(pony);
        productList.add(domikVDerevne);
        productList.add(lemonadeChernogolovka);
        productList.add(kolomenskiy);
        productList.add(okskoe);
        productList.add(masks);
        productList.add(tpLenta);
        productList.add(pampers);
        productList.add(pacifier);

        printProductList(productList);
    }
}
