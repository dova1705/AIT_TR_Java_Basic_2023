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
        double s = (a * a) / 2;

        return s;
    }

    @Override
    public double calcPerimeter(double a) {
        double perimeter = a * 3;
        return perimeter;
    }
}
