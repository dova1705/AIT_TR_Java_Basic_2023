package hw_26.shape;

public class Circle extends Shape{

    //конструктор
    public Circle(double radius) {
        super(radius);
    }

    //сеттеры и геттеры
    @Override
    public double calcArea(double radius) {
        return Math.PI * radius * radius; //площадь круга = 3.14 * r * r;

    }

    @Override
    public double calcPerimeter(double radius) {
        return 2 * Math.PI * radius; //периметр круга p = 2πr
    }
}
