package practice_44.my_string;

import java.util.Iterator;

public class MyStringAppl {
    public static void main(String[] args) {
        MyString myString = new MyString("два пива или не два пива");//создали объект нового класса MyString
        System.out.println(myString);

        Iterator<Character> iterator = myString.iterator();

        while (iterator.hasNext()){
            char ch = iterator.next();
            if (ch == 'а'){
                iterator.remove();
            }
        }
        System.out.println(myString);

        iterator = myString.iterator();
        while (iterator.hasNext()){
            char ch = iterator.next();
            System.out.print(Character.toUpperCase(ch));
        }
       // System.out.println(myString);





//        myString.addChar('!');
//        System.out.println(myString);
//
//        myString.removeChar('п');//удаляет первый попавши
//        System.out.println(myString);
//
//        //напечатать все большими буквами
//        StringBuilder builder = myString.getStr();//в переменную builder переложили содержание myString с помощью get
//        for (int i = 0; i < builder.length(); i++) {
//            char c = builder.charAt(i);
//            c = Character.toUpperCase(c);
//            System.out.print(c);
//        }
//
//        //другой программист делает
//        System.out.println();
//        builder.setLength(5);
//        System.out.println(builder);
//        System.out.println(myString);
    }
}
