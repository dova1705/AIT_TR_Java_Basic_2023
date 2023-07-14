package hw_24;

public class SquareEquation {
    //поля класса
    int a;
    int b;
    int c;

    //конструктор
    public SquareEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //пустой конструктор
    public SquareEquation() {
    }

    //сеттеры и геттеры

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    //методы
    public void equationQuadraticRoots2(Integer a, Integer b, Integer c) {
        Integer d = b * b - 4 * a * c;
        if (d > 0) {
            Double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: Х1= " + x1 + ", Х2 = " + x2);
        } else if (d == 0) {
            Double x;
            x = (double) (-b / (2 * a));
            System.out.println("Уравнение имеет единственный корень: X = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }

    }
}
