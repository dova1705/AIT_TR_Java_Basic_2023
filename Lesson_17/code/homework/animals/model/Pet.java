package homework.animals.model;

public class Pet {
    //поля
    private String type;
    private int weight;
    private String livingConditions; //условия проживания (дома, на улице)

    //конструктор
    public Pet(String type, int weight, String livingConditions) {
        this.type = type;
        this.weight = weight;
        this.livingConditions = livingConditions;
    }
    //пустой конструктор
    public Pet() {
    }
    //методы
    //метод голос
    public void voice (String name) {
        //System.out.println();
    }
    //метод кушать
    public void eat (String name){
        System.out.println(name + " пора кушать");
        //this.type = name;
    }
    //метод спать
    public void sleep (String name) {
        System.out.println(name + " пора дремать");
    }
    //метод пробежка
    public void run (){
        System.out.println("пробежка на свежем воздухе");
    }

    public void display (){
        System.out.println("тип: " + type + ", вес: " + weight +  ", где живет " + livingConditions);
    }

    //геттеры и сеттеры
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLivingConditions() {
        return livingConditions;
    }

    public void setLivingConditions(String livingConditions) {
        this.livingConditions = livingConditions;
    }
}
