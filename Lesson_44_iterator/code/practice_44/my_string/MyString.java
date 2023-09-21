package practice_44.my_string;

import practice_44.my_string.model.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character>{
    //поле класса
    private StringBuilder str;//StringBuilder - это встроенный в Java класс

    //конструктор класса
    public MyString(String str){
        this.str = new StringBuilder(str);
    }

    //убираем доступ к полю элемента класса
//    public StringBuilder getStr() {
//        return str;
//    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }

    //добавили символ
    public void addChar(char c){
        str.append(c);//добавляет символ
    }

    //удалили символ
    public void removeChar(char c){
        int index = str.indexOf(Character.toString(c));//нашли индекс на котором стоит c
        str.deleteCharAt(index);
    }

    public String toString(){
        return str.toString();
    }

    //Метод, который возвращает объект типа Iterator<Character>
    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}
