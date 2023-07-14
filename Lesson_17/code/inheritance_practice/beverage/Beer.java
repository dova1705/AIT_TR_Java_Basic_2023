package inheritance_practice.beverage;

public class Beer extends Beverage{

    String type; //темное или светлое

    //конструктор
    public Beer(String title, String packing, int quantity) {
        super(title, packing, quantity);
    }

    //пустой конструктор для класса Beer
    public Beer() {
    }

    //метод для закупки
    //мы переопределили родительский метод
    public void toBuy (String title, String packing, int quantity, String type) {
        super.toBuy(title, packing, quantity);
        this.type = type;
    }

    //метод для показа того, что в кладовке
    //мы переопределили родительский метод
    public void displayStock () {
        super.displayStock();
        System.out.println("This is: " + type + " beer");
    }

    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public Beer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
