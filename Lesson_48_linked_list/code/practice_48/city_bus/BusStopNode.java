package practice_48.city_bus;

public class BusStopNode {
    //поля класса
    String stopName;
    BusStopNode next;

    //конструктор
    public BusStopNode(String stopName) {
        this.stopName = stopName;
        this.next = null;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public BusStopNode getNext() {
        return next;
    }

    public void setNext(BusStopNode next) {
        this.next = next;
    }
}

