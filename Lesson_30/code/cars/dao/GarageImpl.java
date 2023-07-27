package cars.dao;

import cars.model.Car;

public class GarageImpl implements Garage{

    //поля
    private Car[] cars; //массив типа Car куда попадут все авто в гараже (пригодится в тесте)
    private int size; //размер гаража

    //конструктор
    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarsByRegNumber(car.getRegNumber()) != null ) {
            return false; //не можем добавить авто, если car равно null, нет место или такое авто уже есть
        }
   //     cars[size] = car; //добавление в конец массива
   //     size++; //после добавления авто увеличиваем размер
        cars[size++] = car; //постфиксная операция увеличит size после присвоения
        return true; //если все прошло успешно возвращаем истину
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) { //перебираем в цикле, обегаем массив
            if (regNumber.equals(cars[i].getRegNumber())){ //если нашелся авто с заданным рег номером
                Car temp = cars[i]; //создали объектную переменную и присвоили найденный cars[i]
                cars[i] = cars[--size];//на место удаленного ставим последний
                cars[size] = null;
                return temp;
            }
        }
        return null;
    }

    @Override
    public Car findCarsByRegNumber(String regNumber) {
        int count = 0;
        for (int i = 0; i < size; i++) { //пробегаем по массиву
            if (regNumber.equals(cars[i].getRegNumber())){//проверяем совпадение строк в поле regNumber
                count++; //возвращаем элемент массива типа Car
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        int count = 0;
        for (int i = 0; i < size; i++) { //пробегаем по массиву
            if (model.equals(cars[i].getModel())) { //проверяем совпадение строк в поле model
                count++;//возвращаем элемент массива типа Car
            }
        }
        Car[] carsFound = new Car[count];//определил массив размером по количество найденных
        int totalizer = 0;
        for (int i = 0; i < carsFound.length; i++) {
            if (model.equals(cars[i].getModel())){//проверяем совпадение строк в поле model
                carsFound[totalizer] = cars[i]; //заполняем массив carsFound
                totalizer++;
            }
        }
        return carsFound;
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        int count = 0;
        for (int i = 0; i < size; i++) { //пробегаем по массиву
            if (company.equals(cars[i].getModel())) { //проверяем совпадение строк в поле company
                count++;//возвращаем элемент массива типа Car
            }
        }
        Car[] carsF = new Car[count]; //определил массив размером по количество найденных
        int totalizer = 0;
        for (int i = 0; i < size; i++) {
            if (company.equals(cars[i].getCompany())) { //проверяем совпадение строк в поле company
                carsF[totalizer] = cars[i]; //заполняем массив carsFound
                totalizer++;
            }
        }
        return carsF;
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return new Car[0];
        //TODO
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return new Car[0];
    }

    @Override
    public int size() {
        return size;
    }
}
