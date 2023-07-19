package hw_26.shape;

public abstract class Shape {
    //поля
    double a;

    //конструктор
    public Shape(double a) {
        this.a = a;
    }

    //пустой конструктор


    public Shape() {
    }

    //сеттеры и геттеры
    public double getA() {
        return a;
    }

    public void setA(double a) {
        // проверка входящего параметра
        this.a = a;
    }

    //методы
    public abstract double calcArea ();

    public abstract double calcPerimeter();

}
