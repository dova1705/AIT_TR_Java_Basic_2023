package hw_32;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String regNumber;
    private String model;
    private String company; //в гараже стоят машины разных компании
    private double engine;
    private String color;
    private int millage;

    public Car(String regNumber, String model, String company, double engine, String color, int millage) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
        this.millage = millage;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    @Override
    public String toString() {
        return "Car{regNumber: " + regNumber + ", model: " + model +  ", company: " + company +  ", engine: " + engine + ", color: " + color + ", millage: " + millage +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public int compareTo(Car o) {
        return this.regNumber.compareTo(o.regNumber); //сортируем по алфавиту регномеров
    }
}
