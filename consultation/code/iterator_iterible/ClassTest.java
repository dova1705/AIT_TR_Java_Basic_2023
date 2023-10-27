package iterator_iterible;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassTest implements Iterable<ClassTest>, Iterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("one"); // String
        list.add(1L); // Long
        list.add(1.7); // Double

        for (Object o : list) {
            System.out.println(o.getClass());
        }
        ClassTest ct = new ClassTest();
        while (ct.hasNext()){
            ct = ct.next();
        }
    }
    // A -> B -> C -> D -> E -> F
    // Iterable дает возможность вызвать foreach и перебрать все элементы от первого до последнего автоматический
    @Override
    public Iterator<ClassTest> iterator() {
        return null;
    }

    // Iterator позволяет взять любой объект и узнать, есть ли следующий в списке
    // C.hasNext() -> true
    // C.next() -> D
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public ClassTest next() {
        return null;
    }










}
