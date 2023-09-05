package practice_38.coffee;

public enum Coffe {
    ESPRESSO_SMALL(3.5,50), ESPRESSO_GRAND(4.0,150), AMERICANO(2.5,200), CAPUCCINO(4.5,300), LATTE(4.5,350);

    private double price;
    private int volume;

    Coffe(double price, int volume) {
        this.price = price;
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
