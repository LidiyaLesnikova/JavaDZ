package org.example.DZ3.task1;

public class Product {
    String nameProduct;
    Double price;
    Integer variety;

    public Product(String nameProduct, Double price, Integer variety) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.variety = variety;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Наименование: '" + nameProduct + '\'' +
                ", Цена: " + price +
                ", Сорт: " + variety;
    }
}
