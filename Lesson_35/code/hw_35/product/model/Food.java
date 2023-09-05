package hw_35.product.model;

public class Food extends Product {

    //поле класса описывающий объект
    private String variety;

    //Конструктор (super наследует родительские поля). Конструктор класса, по имени он совпадает с наименованием класса, НО ничего не возвращает и не void
    public Food(int id, String brand, double price, String variety) {
        super(id, brand, price);
        this.variety = variety;
    }

    //геттеры и сеттеры

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
