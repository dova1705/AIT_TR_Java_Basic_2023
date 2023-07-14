package homework.animals.model;

public class Cat extends Pet{
    //поля
    private String name;
    private String breed;
    private int age;

    //конструктор
    public Cat(String type, int weight, String livingConditions, String name, String breed, int age) {
        super(type, weight, livingConditions);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    //методы
    public void display(){
        super.display();
        System.out.println( "имя: " + name + ", порода: " + breed + ", возрвст: " + age);
    }

   public void voice (String name){
        super.voice(name);
       System.out.println(name + " мяу!");
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
