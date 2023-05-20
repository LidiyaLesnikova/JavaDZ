package org.example.DZ3.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
// название которых содержит «высший»
public class Main {
    public static void main(String[] args) {
        List<Product> productList = getProduct();

        try {
            Product maxPrice = productList.stream().filter(pr -> (pr.nameProduct.contains("высший")) &&
                    (pr.variety == 1 || pr.variety == 2)).max(Comparator.comparingDouble(Product::getPrice)).get();
            System.out.println("Товар 'высший' из 1-2 сорта с наибольшей ценой: \n" + maxPrice);
        } catch (Exception e) {
            System.out.println("Товар 'высший' из 1-2 сорта с наибольшей ценой: не найден");
        }
    }

    static List<Product> getProduct() {
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product("Товар 1 высший", 50.0, 1));
        productList.add(new Product("Товар 2", 40.0, 1));
        productList.add(new Product("Товар 3 высший", 30.0, 2));
        productList.add(new Product("Товар 4", 20.0, 2));
        productList.add(new Product("Товар 5 высший", 10.0, 3));
        productList.add(new Product("Товар 6 высший", 60.5, 1));

        return  productList;
    }
}
