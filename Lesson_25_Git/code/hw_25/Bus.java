package hw_25;

public class Bus {
    //поля класса
   private String routeNumber;
    private int capacity;
    private double speed;
    private double routeLength;

    //конструктор
    // полный конструктор, все поля в него включены
    public Bus(String routeNumber, Integer capacity, Integer speed, Integer routeLength) {
        this.routeNumber = routeNumber;
        this.capacity = capacity;
        this.speed = speed;
        this.routeLength = routeLength;
    }

    // конструктор только с capacity (скорость)
    public Bus(int capacity) {
        this.capacity = capacity;
    }
    //пустой конструктор
    public Bus() {
    }

    //сеттеры и геттеры
    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getRouteLength() {
        return routeLength;
    }

    public void setRouteLength(double routeLength) {
        this.routeLength = routeLength;
    }

    //методы
    @Override
    public String toString() {
        return "Номер автобуса: " + routeNumber + ", скорость: " + speed;
    }

    public void go (double speed){
        if (speed > 0) {
            this.speed = speed;
            System.out.println("машина едет со скоростью: " + speed + " км");
        } else {
            System.out.println("Машина не едет");
        }
    }
    public void stop(){
        speed = 0;
        System.out.println("Автобус не едет, скорость = " + speed);
    }
    public void speedUp (double amplifierSpeed){
        speed += amplifierSpeed;
    }
    public void speedDown (double lowerSpeed){
        speed -= lowerSpeed;
    }
    public void displayBus(){
        speed = getSpeed();
        System.out.println("Номер маршрута: " + routeNumber + ", вместительность: " + capacity + ", скорость: " + speed);
    }
}
