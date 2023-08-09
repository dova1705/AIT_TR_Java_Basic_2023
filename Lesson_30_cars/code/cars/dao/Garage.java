package cars.dao;

import cars.model.Car;

public interface Garage {

    //добавление авто
    boolean addCar(Car car);
    //удаление авто
    Car removeCar(String regNumber);
    //Находить авто по рег. номеру
    Car findCarsByRegNumber(String regNumber);
    //Находить авто по модели
    Car[] findCarsByModel(String model);
    //Находить авто по компании
    Car[] findCarsByCompany(String company);
    //Находить авто по объему двигателя
    Car[] findCarsByEngine(double min, double max);
    //Находить авто по цвету
    Car[] findCarsByColor(String color);
    int size();


}
