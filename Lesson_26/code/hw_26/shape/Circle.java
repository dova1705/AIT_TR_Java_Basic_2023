package hw_26.shape;

public class Circle extends Shape{

    //поля
    private double r;

    //конструктор
    public Circle(double a, double r) {
        super(a);
        this.r = r;
    }

    //сеттеры и геттеры
    public double getR() {
        return r;
    }

    public void setR(double r) {
        // проверка входящего параметра
        this.r = r;
    }

    @Override
    public double calcArea() {
        double area = Math.PI * Math.pow(r, 2); //площадь круга = 3.14 * r * r;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = 2 * Math.PI * r; //периметр круга p = 2πr
        return perimeter;
    }
}
