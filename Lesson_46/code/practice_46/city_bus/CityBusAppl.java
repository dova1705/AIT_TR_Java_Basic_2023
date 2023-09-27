package practice_46.city_bus;

import practice_46.city_bus.model.Bus;

import java.util.ArrayList;
import java.util.List;

public class CityBusAppl {
    public static void main(String[] args) {

        //создадим список городских маршрутов
        //вывести на печать в отсортированном виде
        //подсчитать общее кол-во перевозимых за день пассажиров

        List<Bus> cityBuses = new ArrayList<Bus>();
        cityBuses.add(new Bus("Scania", "1000AG", "300", 90));
        cityBuses.add(new Bus("MAN", "2000AG", "100A", 100));
        cityBuses.add(new Bus("Mercedes", "5000AG", "9С", 105));
        cityBuses.add(new Bus("Ikarus", "7000AG", "B", 80));

        Bus bus1 = new Bus("MANN", "2000AG", "100A", 100);
        cityBuses.add(bus1);
        System.out.println(cityBuses.size());

        System.out.println(cityBuses.get(1));
        System.out.println(cityBuses.get(4));
        System.out.println("==============================================================");

        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }

        cityBuses.sort(Bus::compareTo);//сортировка
        System.out.println("==============================================================");

        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }

        System.out.println("===========================Total capacity===========================");
        int totalCapacity = 0;

        for (Bus bus : cityBuses) {
            totalCapacity += bus.getCapacity();
        }
        System.out.println(totalCapacity);

        Bus busToEdit = cityBuses.get(4);
        System.out.println(busToEdit);

        busToEdit.setModel("Ykarus");
        System.out.println(busToEdit);

        System.out.println("==============================================================");
        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }
    }
}

