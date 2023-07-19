package hw_26.shape;

public class Triangle extends Shape{
    //поля
    private int sideTriangleA;
    private int sideTriangleB;
    private int sideTriangleC;

    //конструктор
    public Triangle(double a, int sideTriangleA, int sideTriangleB, int sideTriangleC) {
        super(a);
        this.sideTriangleA = sideTriangleA;
        this.sideTriangleB = sideTriangleB;
        this.sideTriangleC = sideTriangleC;
    }

    //сеттеры и геттеры
    public int getSideTriangleA() {
        return sideTriangleA;
    }

    public void setSideTriangleA(int sideTriangleA) {
        // проверка входящего параметра
        this.sideTriangleA = sideTriangleA;
    }

    public int getSideTriangleB() {
        return sideTriangleB;
    }

    public void setSideTriangleB(int sideTriangleB) {
        // проверка входящего параметра
        this.sideTriangleB = sideTriangleB;
    }

    public int getSideTriangleC() {
        return sideTriangleC;
    }

    public void setSideTriangleC(int sideTriangleC) {
        // проверка входящего параметра
        this.sideTriangleC = sideTriangleC;
    }

    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public double calcPerimeter() {
        int perimeter = sideTriangleA + sideTriangleB +sideTriangleC;
        return perimeter;
    }
}
