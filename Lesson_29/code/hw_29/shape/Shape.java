package hw_29.shape;

public abstract class Shape {
    //поля
    double length;//длина какого-то ребра для фигуры, для квадрата - сторона,
    // дла треугольника - сторона

    //конструктор
    public Shape(double length) {//конструктор работает только для дочерних классов!!!
        this.length = length;
    }

    //геттер
    public double getLength() {
        return length;
    }

    //сеттер
    public void setLength(double length) {
        this.length = length;
    }

    //методы
    public abstract double calcArea (double length);//тело метода отсутствует

    public abstract double calcPerimeter(double length);//тело метода отсутствует

}
