package hw_18.product.model;

public class MilkFood extends Food{
    //поля
    private String milkType;
    private double fat;

    //конструктор
    public MilkFood(double price, String name, long barCode, boolean isOutOfDate, String milkType, double fat) {
        super(price, name, barCode, isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public MilkFood(boolean isOutOfDate, String milkType, double fat) {
        super(isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    //сеттеры и геттеры
    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    //метод toString
    @Override
    public String toString() {
        System.out.print(super.toString());
        return ", Тип молока: " + milkType + ", Жирность: " + fat;
    }
}
