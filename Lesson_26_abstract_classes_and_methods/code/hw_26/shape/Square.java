package hw_26.shape;

public class Square extends Shape{

    //конструктор
    public Square(double a) {
        super(a);
    }


    //методы
    @Override
    public double calcPerimeter(double a) {
        double perimeter = 4 * a;
        return perimeter;
    }

    @Override
    public double calcArea(double a) {
        double area = a * a;
        return area;
    }

}
