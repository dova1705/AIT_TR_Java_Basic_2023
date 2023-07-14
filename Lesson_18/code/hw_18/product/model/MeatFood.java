package hw_18.product.model;

public class MeatFood extends Food{
    //поля
    private String meatType;

    //конструктор
    public MeatFood(double price, String name, long barCode, boolean isOutOfDate, String meatType) {
        super(price, name, barCode, isOutOfDate);
        this.meatType = meatType;
    }
    //геттеры и сеттеры
    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    //метод toString
    @Override
    public String toString() {
        System.out.print(super.toString());
        return  ", тип мяса: " + meatType;
    }
}
