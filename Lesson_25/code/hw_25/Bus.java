package hw_25;

public class Bus {
    //поля класса
    String routeNumber;
    Integer capacity;
    Integer speed;
    Integer routeLength;

    //конструктор
    public Bus(String routeNumber, Integer capacity, Integer speed, Integer routeLength) {
        this.routeNumber = routeNumber;
        this.capacity = capacity;
        this.speed = speed;
        this.routeLength = routeLength;
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getRouteLength() {
        return routeLength;
    }

    public void setRouteLength(Integer routeLength) {
        this.routeLength = routeLength;
    }
    //методы
    public Boolean go (){
        if (speed > 0) {
            System.out.println("машина едет со скоростью: " + speed);
        } else {
            System.out.println("Машина не едет");
        }
        return true;
    }
}
