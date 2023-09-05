package hw_35.product.model;

import java.util.Objects;

public abstract class Product implements Comparable<Product>{
    // сделать на абстрактном классе Product (поля: id, brand, price),
    // дочерних классах Food, Furniture, Computer и интерфейс SuperMarket с методами
    // add, remove, search, size, totalSumOfPrice, averagePrice.

    private int id;
    private String brand;
    private double price;

    public Product(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Product o) {
        return this.id - o.id;
    }
}
