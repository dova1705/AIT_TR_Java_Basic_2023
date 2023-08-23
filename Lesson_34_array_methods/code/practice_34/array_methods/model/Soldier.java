package practice_34.array_methods.model;

import java.util.Objects;

public class Soldier implements Comparable<Soldier> { //Чтобы класс стал сортируемым, ему надо добавить implements Comparable и реализовать метод int compareTo

    //поля класса
    String name;
    int height;
    double weight;
    int profile; //индекс солдата

    public Soldier(String name, int height, double weight, int profile) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return height == soldier.height && Double.compare(soldier.weight, weight) == 0 && profile == soldier.profile && Objects.equals(name, soldier.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, profile);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Soldier{");
        sb.append("name='").append(name).append('\'');
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", profile=").append(profile);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Soldier o) {
        int res = -(this.height - o.height); //по росту от большого к меньшему
        return res != 0 ? res : -(this.profile - o.profile); // сравнивает по профилям
        //тернарный оператор
        //[первый операнд с условием] ? [второй операнд] : [третий операнд];
    }
}
