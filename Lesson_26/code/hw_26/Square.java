package hw_26;

public class Square extends Shape{

    //поля
    private double sideSquare;


    //конструктор
    public Square(double a, double sideSquare) {
        super(a);
        this.sideSquare = sideSquare;
    }

    //сеттеры и геттеры
    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }
    //методы
    @Override
    public double calcPerimeter() {
        double perimeter = 4 * sideSquare;
        return perimeter;
    }

    @Override
    public double calcArea() {
        double area = (sideSquare*2);
        return 0;
    }

}
