package hw_29;

import hw_29.shape.*;

public class ShapeAppl {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];//каждый новый класс в Java это новый тип данных

        shapes[0] = new Circle(10.0);//используем конструктор
        shapes[1] = new Circle(3.0);//используем конструктор
        shapes[2] = new Triangle(5.0);//используем конструктор
        shapes[3] = new Square(10.0);//используем конструктор
        shapes[4] = new Rectangle(5.0);//используем конструктор

        //решение "в лоб, перебор руками"
        double s = shapes[0].calcArea(shapes[0].getLength()) + shapes[1].calcArea(shapes[1].getLength()) + shapes[2].calcArea(shapes[2].getLength()) + shapes[3].calcArea(shapes[3].getLength() + shapes[4].calcArea(shapes[4].getLength()));
        System.out.println("общая площадь = " + s);

        double p = shapes[0].calcPerimeter(shapes[0].getLength()) + shapes[1].calcPerimeter(shapes[1].getLength()) + shapes[2].calcPerimeter(shapes[2].getLength()) + shapes[3].calcPerimeter(shapes[3].getLength() + shapes[4].calcPerimeter(shapes[4].getLength()));
        System.out.println("Общий периметр = " + p);

        //решение циклом for
        System.out.println("----------решение циклом for----------");
        double area = 0;
        double perimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            area = + area + shapes[i].calcArea(shapes[i].getLength());
           // area += shapes[i].calcArea(shapes[i].getLength());
            perimeter += shapes[i].calcPerimeter(shapes[i].getLength());
        }
        System.out.println("общая площадь = " + area);
        System.out.println("Общий периметр = " + perimeter);

        //решение циклом for each
        System.out.println("----------решение циклом for each----------");
        double s1 = 0;
        double p1 = 0;
        for ( Shape figure : shapes ) {
            s1 += figure.calcArea(figure.getLength());
            p1 += figure.calcPerimeter(figure.getLength());
        }
        System.out.println("общая площадь = " + s1);
        System.out.println("Общий периметр = " + p1);


        // Рассчитайте общую площадь кругов из задачи 2.
        System.out.println("----------общая площадь круга----------");
        Circle circle = new Circle(10.0);
        Circle circle1 = new Circle(3.0);
        double totalAreaCircle = circle.calcArea(circle.getLength()) + circle1.calcArea(3.0);
        System.out.println("Сумма площади 2 кругов = " + totalAreaCircle);

        //другой способ
        double s2 = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                s2 = s2 + shapes[i].calcArea(shapes[i].getLength());
            }
        }
        System.out.println("Сумма площади 2 кругов = " + s2 + " другой способ");
    }
}
