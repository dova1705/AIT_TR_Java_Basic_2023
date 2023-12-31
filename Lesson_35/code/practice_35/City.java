package practice_35;

public class City implements Comparable<City>{

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
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

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City o) {
        //return this.name.compareTo(o.name); //сортируем по именам по алфавиту, таков естественный порядок для этого класса
        return Integer.compare(population, o.population); //по размеру населения
        //return this.population - o.population;//по размеру населения

    }
}
