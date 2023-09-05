package company_employee.model;

import java.util.Objects;

public class Worker extends Employee {
    //поля
    private double wage; //почасовая ставка

    //конструктор
    public Worker(int id, String firstName, String lastName, double hours, double wage) {
        super(id, firstName, lastName, hours);
        this.wage = wage;
    }

    //сеттеры и геттеры
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double calcSalary() {
        double salary = wage * hours;
        if (salary < hours * minWage){
            salary = hours * minWage;
        }
        return salary;
    }
}
