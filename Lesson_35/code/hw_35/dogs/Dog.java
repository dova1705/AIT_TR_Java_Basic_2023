package hw_35.dogs;

import java.util.Objects;

public class Dog implements Comparable<Dog> {

    //поля класса, описывающий объект
    private int id;
    private String name;
    private int age;

    //конструктор
    public Dog(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //конструктор без полей String name; int age
    public Dog(int id) {
        this.id = id;
    }

    //сеттеры и геттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{ id: " + id + ", name: " + name + ", age: " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return id == dog.id && age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public int compareTo(Dog o) {
    //    return this.name.compareTo(o.name); //сортируем по именам по алфавиту, таков естественный порядок для этого класса
        return -(this.id - o.id); //сортируем по id
    }
}
