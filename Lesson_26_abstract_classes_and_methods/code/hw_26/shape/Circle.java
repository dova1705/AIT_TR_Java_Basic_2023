package hw_26.shape;

public class Circle extends Shape{

    //конструктор
    public Circle(double a) {
        super(a);
    }

    //сеттеры и геттеры
    @Override
    public double calcArea(double a) {
        double area = Math.PI * a * a; //площадь круга = 3.14 * r * r;
        return area;
    }

    @Override
    public double calcPerimeter(double a) {
        return 2 * Math.PI * a; //периметр круга p = 2πr
    }
}
