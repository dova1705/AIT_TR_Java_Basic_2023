package hw_26.shape;

public class Square extends Shape{

    //поля




    //конструктор
    public Square(double a) {
        super(a);
    }

    //сеттеры и геттеры




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
