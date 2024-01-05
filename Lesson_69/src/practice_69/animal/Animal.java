package practice_69.animal;

// Базовый класс
public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a generic sound");
    }

    public void eat() {
        System.out.println("Животное ест");
    }
}
