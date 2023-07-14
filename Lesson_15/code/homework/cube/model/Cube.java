package homework.cube.model;

public class Cube {

    //Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения периметра p,
    // площади s и объема v. Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
    // Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

    public int a; //поле класса

    //конструктор
    public Cube(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
     //метод для вычисления периметра
    public int perimeter (){
        return 12 * a;
    }

//метод площадь
    public int square() {
        return 6 * a * a;
    }
    //метод для вычисления объема
    public int volume(){
        return a * a * a;
    }


}
