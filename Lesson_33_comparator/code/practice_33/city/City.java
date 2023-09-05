package practice_33.city;

import java.util.Objects;

public class City implements Comparable<City>{
    private String name;
    private int population;
    private int pollution;
    private String postCode;

    public City(String name, int population, int pollution, String postCode) {
        this.name = name;
        this.population = population;
        this.pollution = pollution;
        this.postCode = postCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPollution() {
        return pollution;
    }

    public void setPollution(int pollution) {
        this.pollution = pollution;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "City {name='" + name + ", population=" + population + ", pollution=" + pollution + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(postCode, city.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, postCode);
    }

    @Override
    public int compareTo(City o) {// City o - это второй объект из сравниваемых, а где первый объект, с которым происходит сравнение? this
        //return this.name.compareTo(o.name); //сортируем по именам по алфавиту, таков естественный порядок для этого класса
        return -(this.population - o.population);//сортируем по количеству населения
    }
}
