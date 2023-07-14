package homework.animals.controller;

import homework.animals.model.Cat;
import homework.animals.model.Dog;

public class HouseAppl {
    public static void main(String[] args) {

        Dog dog1 = new Dog("собака",45, "на улице", "Сардар", "алабай", 4);
        dog1.display();
        dog1.run();
        dog1.voice();
        System.out.println("==========================================================");
        Dog dog2 = new Dog("собака", 25, "дома", "Мухтар", "овчарка", 3);
        dog2.display();
        dog2.eat("Мухтар");
        System.out.println("==========================================================");

        Cat cat1 = new Cat("кошка", 4, "дома", "Пончик", "сиамская", 2);
        cat1.display();
        cat1.voice("Пончик");
        cat1.sleep("Пончик");

        System.out.println("==========================================================");
        Cat cat2 = new Cat("кошка", 5, "дома", "Барсик", "манчкин", 2);
        Cat cat3 = new Cat("кошка", 5, "дома", "Том", "тойгер", 2);
        cat2.display();
        cat2.voice("Барсик");
        cat2.eat("Барсик");

        System.out.println("==========================================================");
        cat3.display();
    }
}
