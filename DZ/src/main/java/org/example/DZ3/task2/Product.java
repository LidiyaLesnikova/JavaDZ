package org.example.DZ3.task2;

public class Product {
    String nameProduct;
    String country;
    Double weight;
    Double price;
    Integer variety;

    public Product(String nameProduct, String country, Double weight, Double price, Integer variety) {
        this.nameProduct = nameProduct;
        this.country = country;
        this.weight = weight;
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
                ", Сорт: " + variety + "\n";
    }
}
