package company_employee.model;

import java.util.Objects;

public abstract class Employee {

    //поля класса
    protected static double minWage = 30.0;//ставка в евро
    protected final int id;//это хорошо
    protected String firstName;
    protected String lastName;
    protected double hours;

    //конструктор
    public Employee(int id, String firstName, String lastName, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
    }

    //геттеры и сеттеры
    public static double getMinWage() {
        return minWage;
    }

    public static void setMinWage(double minWage) {
        Employee.minWage = minWage;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        // проверка входящего параметра
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        // проверка входящего параметра
        this.lastName = lastName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        // проверка входящего параметра
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {//можно использовать просто toString
        //воспользуемся классом StringBuilder - это "класс - обертка" для класса String
        final StringBuilder sb = new StringBuilder("Employee");
        sb.append("id = ").append(id);
        sb.append(", firstName = ").append(firstName).append('\'');
        sb.append(", lastName = ").append(lastName).append('\'');
        sb.append(", hours = ").append(hours);
        sb.append(", salary = ").append(calcSalary());
        return sb.toString();
    }

    public abstract double calcSalary();// этот метод будет требоваться реализовать в дочерних классах
}
