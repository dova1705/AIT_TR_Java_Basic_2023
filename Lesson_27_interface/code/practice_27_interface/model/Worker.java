package practice_27_interface.model;

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

    public abstract static class Employee {
        protected static double minWage = 30.0;//ставка в евро
        //поля класса
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
            practice_27_interface.model.Employee.minWage = minWage;
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
            practice_27_interface.model.Employee employee = (practice_27_interface.model.Employee) o;
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
}
