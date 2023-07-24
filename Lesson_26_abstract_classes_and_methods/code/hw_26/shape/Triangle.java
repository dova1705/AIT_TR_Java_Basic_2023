package hw_26.shape;

public class Triangle extends Shape{
    //поля
//    private int sideTriangleA;
//    private int sideTriangleB;
//    private int sideTriangleC;

    //конструктор
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea(double side) {
        return side * side * Math.sqrt(3) / 4.0;//площадь треугольника
    }

    @Override
    public double calcPerimeter(double side) {
        return side * 3;//периметр
    }
}
