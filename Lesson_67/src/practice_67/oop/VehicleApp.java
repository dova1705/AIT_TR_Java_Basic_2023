package practice_67.oop;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        Car car1 = new Car();
        Bicycle bicycle1 = new Bicycle();

        car.setWheels(4);
        bicycle.setWheels(2);

        car1.setWheels(6);
        car1.setEngine(3.5);

        bicycle1.setWheels(3);
        bicycle1.setType("child");

        // instanceof - это ключевое слово возвращает true или false
        System.out.println(car1 instanceof Vehicle); // проверяем относится ли объект к конкретному классу
        System.out.println(car1 instanceof Car); // проверяем относится ли объект к конкретному классу
        System.out.println("=================");
        System.out.println(bicycle1 instanceof Vehicle); // проверяем относится ли объект к конкретному классу
        System.out.println(bicycle1 instanceof Bicycle); // проверяем относится ли объект к конкретному классу

    }
}
