package hw_18.product.model;

import java.util.Objects;

public class Product {
    //поля
    private double price; //цена
    private String name;
    private long barCode;//штрих-код

    //конструктор
    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    //пустой конструктор
    public Product() {
    }

    //сеттеры и гетторы
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    //метод toString
    @Override
    public String toString() {
        return "Название продукта: " + name + ", Цена: " + price + ", Штри-код" + barCode;
    }

    @Override
    public boolean equals(Object o) {//сигнатура метода: модификатор, ТИП ВОЗВРАЩАЕМОГО МЕТОДОМ ЗНАЧЕНИЯ, имя метода. в круглых скобках тип переменной и ее имя, которое принимает метод
        if (this == o) return true;//если мы сравниваем объект сам с собой если объекты равны возвращаем true
        //if (o == null || getClass() != o.getClass()) return false;//если сравниваем с null или объекты разных классав
        Product product = (Product) o;// производим downcasting предложенного для сравнения объекта до класса computer
        return ( barCode == product.barCode );//логическое выражение упрастили так как barCode отвечает за уникальность типов продукта
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode);
    }
}
