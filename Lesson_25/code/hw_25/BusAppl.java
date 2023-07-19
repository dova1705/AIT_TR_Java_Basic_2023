package hw_25;

public class BusAppl {
    public static void main(String[] args) {
        Bus bus = new Bus();//создали новый объект типа bus

        bus.setRouteNumber("17A");//через сеттер присвоили номер маршрута
        bus.displayBus();//вызов метода displayBus
        bus.go(10);//вызов метода go
        bus.displayBus();
        bus.speedUp(10);//метод добавление скорости
        bus.displayBus();
        bus.speedDown(5.2);// метод убавление скорости
        bus.displayBus();
        bus.stop();
        bus.displayBus();
    }
}
