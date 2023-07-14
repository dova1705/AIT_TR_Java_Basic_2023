import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson_4 задача 5 со звёздочкой");
        Scanner scan = new Scanner(System.in);
        System.out.println("Выведите Стоимость  товаров A: ");
        float priceA  = scan.nextFloat();
        System.out.println("Выведите количество товаров A: ");
        float warenA = scan.nextFloat();
        System.out.println("Выведите скидку на товар A в процентах: ");
        float rabatA = scan.nextFloat();

        // float Aprice = priceA*warenA;
        // float Arabat = (priceA*warenA)*10/100;
        // float Atotal = Aprice-Arabat;

        System.out.println("Выведите Стоимость  товаров B: ");
        float priceB  = scan.nextFloat();

        System.out.println("Выведите количество товаров B: ");
        float warenB = scan.nextFloat();

        System.out.println("Выведите скидку на товар B в процентах: ");
        float rabatB = scan.nextFloat();

        //float Bprice = priceB*warenB;
        // float Brabat = (priceB*warenB)*10/100;
        //float Btotal = Bprice-Brabat;

        float Aprice = priceA*warenA, Bprice = priceB*warenB;
        float Arabat = (priceA*warenA)*10/100,Brabat = (priceB*warenB)*10/100;

        float Atotal = Aprice-Arabat,Btotal = Bprice-Brabat;

        System.out.println("итоговую стоимость товара (A) со скидкой: "+ Atotal );
        System.out.println("итоговую стоимость товара (B) со скидкой : "+ Btotal );
        System.out.println ("итоговую стоимость товара (A+B) со скидкой " + (Atotal+Btotal));



    }
}