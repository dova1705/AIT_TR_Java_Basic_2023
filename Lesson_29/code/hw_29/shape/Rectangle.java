package hw_29.shape;

public class Rectangle extends Shape{

    //конструктор
    public Rectangle(double side) {
        super(side);
    }

    //методы
    @Override
    public double calcArea(double side) {
        return side * side;
    }

    @Override
    public double calcPerimeter(double side) {
        return 2 * (side + side);
    }
}
