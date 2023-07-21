package hw_26.shape;

public class Triangle extends Shape{
    //поля
//    private int sideTriangleA;
//    private int sideTriangleB;
//    private int sideTriangleC;

    //конструктор
    public Triangle(double a) {
        super(a);
    }

    @Override
    public double calcArea(double a) {
        return a * a * Math.sqrt(3) / 4.0;//площадь
    }

    @Override
    public double calcPerimeter(double a) {
        return a * 3;//периметр
    }
}
