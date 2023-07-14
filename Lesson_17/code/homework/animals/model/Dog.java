package homework.animals.model;

public class Dog extends Pet {

    //поля
    private String name;
    private String breed;
    private int age;

    //конструктор

    public Dog(String type, int weight, String livingConditions, String name, String breed, int age) {
        super(type, weight, livingConditions);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    //методы
    public void display(){
        System.out.println("тип: " + getType() + ", вес: " + getWeight() + ", где живет: " + getLivingConditions() + ", имя: " + name + ", порода: " + breed + ", возрвст: " + age);
    }

    public void voice () {
        super.voice(name);
        System.out.println(name + " Гав-гав!");
    }

    //геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
