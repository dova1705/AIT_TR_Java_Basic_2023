package practice_69.animal;

// Подкласс
public class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);  // вызов конструктора родительского класса
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        super.makeSound();  // вызов метода родительского класса
        System.out.println(name + " the " + breed + " says woof");
    }
}