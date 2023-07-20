package hw_24;

import java.util.ArrayList;

public class JavaWrapperClasses {
    public static void main(String[] args) {

        ArrayList <Integer> myNumb = new ArrayList<Integer>();

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        Integer myInt1 = 17;
        Double myDouble1 = 92.05;
        Character myChar1 = 'D';
        System.out.println(myInt1.intValue());
        System.out.println(myDouble1.doubleValue());
        System.out.println(myChar1.charValue());

        String myStr = myInt1.toString();//преобразовали из целочисленного (Integer) в строку String
        System.out.println("В числе " + myInt1 + ", цифр: " + myStr.length());



    }
}
