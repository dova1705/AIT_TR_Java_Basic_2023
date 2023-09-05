package hw_35.product.model;

public class Furniture extends Product{

    //поле класса описывающий объект
    private String view;

    //Конструктор (super наследует родительские поля). Конструктор класса, по имени он совпадает с наименованием класса, НО ничего не возвращает и не void
    public Furniture(int id, String brand, double price, String view) {
        super(id, brand, price);
        this.view = view;
    }

    //геттеры и сеттеры

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}
