package practice_44.my_string.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    //поля класса
    private StringBuilder str;
    private int size;
    private int currentPosition;//текущая позиция

    //конструктор
    public MyStringIterator(StringBuilder str){
        this.str = str;
        size = str.length();
        //currentPosition = 0;
    }

    // метод 1 - проверяет есть ли следующий
    @Override
    public boolean hasNext() {
        return currentPosition < size; //логическое выражение, которое отражает логику наличия
    }

    // метод 2 - возвращает элемент
    @Override
    public Character next() {
        Character curCharacter = str.charAt(currentPosition);
        currentPosition++;
        return curCharacter;
    }

    public void remove(){
        str.deleteCharAt(--currentPosition);
        size--;
    }
}
