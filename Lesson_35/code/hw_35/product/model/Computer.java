package hw_35.product.model;

public class Computer extends Product{

    //поля класса описывающий объект
    private String cpu;
    private int ram;

    //Конструктор (super наследует родительские поля). Конструктор класса, по имени он совпадает с наименованием класса, НО ничего не возвращает и не void
    public Computer(int id, String brand, double price, String cpu, int ram) {
        super(id, brand, price);
        this.cpu = cpu;
        this.ram = ram;
    }

    //геттеры и сеттеры

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
