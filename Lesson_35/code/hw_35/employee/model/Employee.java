package hw_35.employee.model;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    //Задание 1
    // создать класс Employee с полями: name, yearOfBirth, experience (стаж работы), образование
    //  со стандартными конструкторами, геттерами и сеттерами переопределить методы toString equals

    //поля класса, описывающий объект
    String name; //имя
    int yearOfBirth; //год рождение
    int experience;//стаж работы
    int id;//идентификатор

    //конструктор

    public Employee(String name, int yearOfBirth, int experience, int id) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.experience = experience;
        this.id = id;
    }


    //пустой конструктор


    public Employee() {
    }

    //сеттеры и геттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", experience=" + experience +
                ", id=" + id +
                '}';
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
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);// по имени, в алфавитном порядке
    }


}
