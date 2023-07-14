package inheritance_practice.book.controller;

import inheritance_practice.book.model.Book1;
public class BookAppl {
    public static void main(String[] args) {

        //создаем объектные переменные book1, book2, book3
        Book1 book1 = new Book1("Сердце дракона", "Кирил Клеванский", 2016, 1000000000L);
        Book1 book2 = new Book1("Код Да Винчи", "Ден Браун", 2003, 1000000001L);
        Book1 book3 = new Book1("Белый клык", "Джек Лондон", 1900, 1000000002L);

        book1.display();
        System.out.println("=================================================================");
        book2.display();
        System.out.println("=================================================================");
        book3.display();

    }
}
