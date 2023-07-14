package homework.employee.model;

public class Employee {
    //Создать класс Работник (Employee) c полями:
    //уникальный номер
    //имя
    //фамилия
    //пол
    //зарплата
    //уровень налогообложения Создать приложение FirmaAppl в котором принять на работу несколько сотрудников.

    //поле класса
    public String id; //уникальный номер
    public String name;
    public String surName;
    public String gender;
    public int wages;

    //конструктор
    public Employee(String id, String name, String surName, String gender, int wages) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.wages = wages;
    }

    public void display (){
        System.out.print("уникальный номер: " + id + ", ");
        System.out.print("Имя: " + name + ", ");
        System.out.print("фамилмя: " + surName + ", ");
        System.out.print("пол: " + gender + ", ");
        System.out.print("заработная плата: " + wages + ", ");
        System.out.println();
    }

    //геттеры и сеттеры
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }
}
