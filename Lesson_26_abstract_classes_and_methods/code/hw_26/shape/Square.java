package hw_26.shape;

public class Square extends Shape{

    //конструктор
    public Square(double side) {
        super(side);
    }


    //методы
    @Override
    public double calcPerimeter(double side) {
        return 4 * side;
    }

    @Override
    public double calcArea(double side) {
        return side * side;
    }

}
