package hw_18.product.model;

public class Food extends Product{
    //поля
    private boolean isOutOfDate;//годность продукта

    //конструктор
    public Food(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode);
        this.isOutOfDate = isOutOfDate;
    }

    //пустой конструктор
    public Food(boolean isOutOfDate) {

    }

    //сеттеры и геттеры
    public boolean isOutOfDate() {
        return isOutOfDate;
    }

    public void setOutOfDate(boolean outOfDate) {
        isOutOfDate = outOfDate;
    }

    @Override
    public String toString() {
        return "название: " + super.getName() + ", цена: " + super.getPrice() + ", штрих-код: " + super.getBarCode() + ", устаревший: " + isOutOfDate;
   }
}
