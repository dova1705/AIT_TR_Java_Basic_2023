package hw_26;

public abstract class Shape {
    //поля
    double a;

    //конструктор
    public Shape(double a) {
        this.a = a;
    }

    //сеттеры и геттеры
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    //методы
    public abstract double calcArea ();

    public abstract double calcPerimeter();
}
