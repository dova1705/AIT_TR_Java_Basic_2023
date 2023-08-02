package practice_33.computer.model;

public class Comp {
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private String indicator;

    //конструктор со всеми полями
    public Comp(String cpu, int ram, int ssd, String brand, String indicator) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.indicator = indicator;
    }

    //пустой конструктор
    public Comp() {
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
        if(ram > 0) {
            this.ram = ram;
        } else {
            return;
        }
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        if(ssd > 0) {
            this.ssd = ssd;
        } else {
            System.out.println("Wrong value");
            return;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + ", SSD: " + ssd + ", indicator: " + indicator;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Comp)) {
            return false;
        }
        Comp other = (Comp) obj;
        return brand.equals(other.brand) && cpu.equals(other.cpu) && ram == other.ram && ssd == other.ssd;
    }

   public void computerTurnOn(){
        indicator = "On";
        System.out.println("Computer is working...");
    }
   public void computerTurnOff(){
        indicator = "Off";
        System.out.println("Computer is not working...");
    }
}
