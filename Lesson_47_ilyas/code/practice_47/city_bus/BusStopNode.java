package practice_47.city_bus;

public class BusStopNode {
    // Поля класса
    String stopName;
    BusStopNode next;

    // Конструктор класса
    public BusStopNode(String stopName) {
        this.stopName = stopName;
        this.next = null;
    }
}

