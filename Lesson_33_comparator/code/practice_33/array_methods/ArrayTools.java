package practice_33.array_methods;

import java.util.function.Predicate;

public class ArrayTools {

    //печать массива
    public static void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("================================================");
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

    //поиск объекта в массиве объектов возвращает boolean
    public static boolean searchBoolean(Object[] arr, Object value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)){
                return true;
            }
        }
        return false; //несуществующий индекс
    }

    //поиск объектов по условию
    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate){//метод возвращает тип Т из массива типа Т[], отбор по предикату
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])){//test встроенный в класс Predicate метод
                return arr[i];
            }
        }
        return null;
    }

}
