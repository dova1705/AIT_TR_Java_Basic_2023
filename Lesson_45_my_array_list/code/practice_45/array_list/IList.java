package practice_45.array_list;

public interface IList <E> extends Iterable<E> {

    //опишем методы, которые нам нужны для работы со "списком" куда могут попасть любые типы данные
    //int, double, boolean, Integer, Double, String, типы на основы класса Employee, Car, Pet, Photo, Task

    int size(); //метод отвечает за размер IList

    default boolean isEmpty(){//позволяет проверить лист пустой или нет
        return size() == 0;
    }
    void clear();//удаляет все элементы
    boolean add(E element); //добавляем элемент
    default boolean contains(Object o){//есть такой элемент в листе или нет
        return indexOf(o) >= 0;
    }
   default boolean remove(Object o){ //удаление элемента списка
        int index = indexOf(o);
        if (index < 0){ //когда элемент не нашелся в списке
            return false;
        }
        remove(index);
        return true;
   }
    boolean add(int index, E element); //вставка на место по индексу
    E get(int index);//получает элемент по индексу
    int indexOf(Object o); //узнать индекс элемента списка
    int lastIndexOf(Object o); //ищем с конца списка в направлении его начало
    E remove(int index); //удаляем по индексу
    E set(int index, E element);

}
