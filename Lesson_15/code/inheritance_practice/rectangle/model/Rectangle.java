package inheritance_practice.rectangle.model;

//этот файл - это и есть капсула для класса Rectangle
//название файла Класса - всегда с большой Буквы

//Шаг 1 определяем поля класса
public class Rectangle {
    //длина
    public double a;

    //высота
   public double b;

//Шаг 2 определяем метод

    //конструктор класса Rectangle

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //методы установки значении полей класса
    public void setA(double a){
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    //метод для вычисления периметра
    public double perimeter(double a, double b) {
        return 2*a + 2*b;
    }


    //метод для вычисления площади
    public double square(double a, double b) {
        return a * b;
    }
}
