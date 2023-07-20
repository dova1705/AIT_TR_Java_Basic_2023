package practice_24;

import hw_24.SquareEquation;

public class WrapperClassesAppl {
    public static void main(String[] args) {

        //как найти количество цифр в числе версия 2 (цикл делим число на 10 пока оно не кончится)
        System.out.println("=============================Digits in number=====================");
        Integer x = 123456789;
        String st = x.toString();//перевели число в строку
        System.out.println("Number of digits "  + x + " are " + st.length());

        Double y = 32456.78;
        String st1 = y.toString();//перевели число в строку
        System.out.println("Number of digits " + y + " are " + st1.length()); //Double берёт длину с учётом точки

        ////присвоения и вычисление
        System.out.println("==============Calculation===========");
        int n = 20;
        Integer z = 10;
        System.out.println(n);
        System.out.println(z);
        z = z + 100;
        System.out.println(z);

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;//формула 2 * 3,14 * r
        System.out.println(circleLength);

        //методы с константами классов
        System.out.println("==============Constants of Wrapper Classes===========");
        System.out.println("Integer MAX " +  Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " +  Long.MAX_VALUE);
        System.out.println("Long MIN " + Long.MIN_VALUE);
        System.out.println("Double MAX " + Double.MAX_VALUE);
        System.out.println("Double MIN " + Double.MIN_VALUE);


        //как обработать деление на ноль
        System.out.println("_____________Not-a-Number (NaN)______________");

        double a = 20.0 / 0;
        if (Double.isInfinite(a) || Double.isNaN(a)){
            System.out.println("Wrong operation or wrong result.");
        }else {
            System.out.println(a);
        }

        //парсинг String to number (преобразовать строку к числу)
        String str1 = "987654";
        int num = Integer.parseInt(str1);//парсинг строки в число
        System.out.println(num);

        String str2 = "2.7118281828";
        Double exp = Double.parseDouble(str2);//парсинг строки в число
        System.out.println(exp);
    }
}
