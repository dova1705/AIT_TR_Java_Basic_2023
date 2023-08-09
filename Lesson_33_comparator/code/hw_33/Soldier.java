package hw_33;

import java.util.function.Predicate;

public class Soldier {

    //Задание 1. Создать класса Soldier (name, height, weight, profile). Profile = 1 до 99.
    private String name;
    private int height;
    private int weight;
    private int profile;

    public Soldier(String name, int height, int weight, int profile) {
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Soldier{name: " + name + ", height: " + height + ", weight: " + weight + ", profile: " + profile + "}";
    }

    //печать массива
    public static void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("========================================================");
    }

    //поиск объекта в массиве объектов
    public static int search(Object[] arr, Object value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)){
                return i;
            }
        }
        return -1; //несуществующий индекс
    }

    //поиск объектов по условию
    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate){//метод возвращает тип Т из массива типа Т[], отбор по предикату
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])){
                return arr[i];
            }
        }
        return null;
    }
}



