package practice_69.animal;

public class Bird extends Animal{

    public Bird(){
        // тк в родительском классе Animal нет конструктора без аргументов мы ОБЯЗАНЫ
        // вызвать конструктор родительского класса и передать в него некий аргумент типа String
        super(null);
    }
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Птица поёт");
    }
}
