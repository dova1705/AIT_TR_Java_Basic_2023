package practice_69.animal;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("cat");
        myAnimal.makeSound(); // вывод: Some generic animal sound

        Dog myDog = new Dog("Muhtar","Haski");
        myDog.makeSound(); // вывод: Woof

        Bird myBird = new Bird("Kesha");
        myBird.makeSound(); // вывод: птица поёт
        myBird.eat(); // вывод: Животное ест
    }
}
