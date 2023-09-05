package hw_35.employee.model;

public class Engineer extends Employee{

    //поля класса описывающий объект
    private int grade;//ставка, уровень
    private int hours; //часы

    //Конструктор (super наследует родительские поля). Конструктор класса, по имени он совпадает с наименованием класса, НО ничего не возвращает и не void
    public Engineer(String name, int yearOfBirth, int experience, int id, int grade, int hours) {
        super(name, yearOfBirth, experience, id);
        this.grade = grade;
        this.hours = hours;
    }

    //еще один конструктор (это ПОЛИМОРФИЗМ!)
    public Engineer(int grade, int hours) {
        this.grade = grade;
        this.hours = hours;
    }

    //геттеры и сеттеры

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //метод считает зп
    public double calcSalary(){
        double salary = grade * hours;
        return salary;
    }
}
