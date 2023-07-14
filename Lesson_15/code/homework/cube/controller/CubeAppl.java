package homework.cube.controller;

import homework.cube.model.Cube;
public class CubeAppl {
    public static void main(String[] args) {
        Cube cb = new Cube(3);//создаем объект типа Cube
        Cube cb1 = new Cube(17);
        Cube cb2 = new Cube(20);

        //вызываем метод perimeter класса Cube для конкретного экземпляра класса
        int p = cb.perimeter();
        //печатаем результат
        System.out.println("периметр куба " + p);
        //в классе Cube в методе вычисления площади параметр оставил пустым. Потому что в CubeAppl в вызванном методе необязательно писать параметр
        double s = cb.square();
        System.out.println("площадь куба равен " + s);
        //в классе Cube в методе вычисления объема параметр оставил пустым. Потому что в CubeAppl в вызванном методе необязательно писать параметр
        int v = cb.volume();
        System.out.println("Объем куба равен " + v);

        System.out.println("===========================================================");
        System.out.println("периметр куба " + cb1.perimeter());
        System.out.println("площадь куба равен " + cb1.square());
        System.out.println("Объем куба равен " + cb1.volume());

        System.out.println("===========================================================");
        System.out.println("периметр куба " + cb2.perimeter());
        System.out.println("площадь куба равен " + cb2.square());
        System.out.println("Объем куба равен " + cb2.volume());

    }
}
