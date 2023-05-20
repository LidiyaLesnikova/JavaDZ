package org.example.DZ3.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
public class Main {
    public static void main(String[] args) {
        List<Product> productList = getProduct();
        Scanner sc = new Scanner(System.in);
        System.out.println("input necessary variety product: ");
        int variety = sc.nextInt();
        Double minPrice = productList.stream().filter(pr -> pr.variety == variety).min(Comparator.comparingDouble(Product::getPrice)).get().price;
        productList = productList.stream().filter(pr -> pr.variety == variety && pr.price.equals(minPrice)).toList();
        System.out.println("Product "+variety+" variety with min price: \n"+productList);
    }

    public static List<Product> getProduct() {
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product("product 1","country 1", 600.0, 50.5, 1));
        productList.add(new Product("product 2","country 1", 100.0, 100.0, 1));
        productList.add(new Product("product 3","country 2", 500.0, 50.0, 2));
        productList.add(new Product("product 4","country 2", 300.0, 30.0, 1));
        productList.add(new Product("product 5","country 3", 90.0, 20.0, 3));
        productList.add(new Product("product 6","country 3", 10.0, 30.0, 1));
        productList.add(new Product("product 7","country 4", 1000.0, 150.0, 2));
        return productList;
    }
}

