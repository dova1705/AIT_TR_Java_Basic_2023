package practice_27_interface.model;

//Manager: base + grade * hours

public class Manager extends Employee {
    //поля
    private double baseSalary;
    private int grade;

    //конструктор
    public Manager(int id, String firstName, String lastName, double hours, double baseSalary, int grade) {
        super(id, firstName, lastName, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    //геттеры и сеттеры
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + grade * hours;//почасовая ставка
        if (salary < hours * minWage){//если получилось ниже минимальной зп, то назначаем минимальную зп.
            salary = hours * minWage;
        }
        return salary;
    }
}
