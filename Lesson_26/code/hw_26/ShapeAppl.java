package hw_26;

import hw_26.shape.Circle;
import hw_26.shape.Shape;
import hw_26.shape.Square;
import hw_26.shape.Triangle;

public class ShapeAppl {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(10);
        shapes[1] = new Circle(3);
        shapes[2] = new Triangle(5);
        shapes[3] = new Square(10);

        double s = shapes[0].calcArea(shapes[0].getA()) + shapes[1].calcArea(shapes[1].getA()) + shapes[2].calcArea(shapes[2].getA()) + shapes[3].calcArea(shapes[3].getA());
        System.out.println("общая площадь = " + s);

        double p = shapes[0].calcPerimeter(shapes[0].getA()) + shapes[1].calcPerimeter(shapes[1].getA()) + shapes[2].calcPerimeter(shapes[2].getA()) + shapes[3].calcPerimeter(shapes[3].getA());
        System.out.println("Общий периметр = " + p);


        // Рассчитайте общую площадь кругов из задачи 2.

        Circle circle = new Circle(10);
        Circle circle1 = new Circle(7);
        double totalAreaCircle = circle.calcArea(10) + circle1.calcArea(7);
        System.out.println("общая площадь круга = " + totalAreaCircle);
    }
}
