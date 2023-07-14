package homework.book.controller;

import homework.book.model.TheBook;
public class TheBookAppl {
    public static void main(String[] args) {

        TheBook book = new TheBook(10000000L, "Анна Каренина", "Лев Толстой", 1878);
        book.display();

        TheBook book1 = new TheBook(1000000L, "Война и мир", 1868);
        book1.display();

        TheBook book2 = new TheBook("Отцы и дети", "Иван Тургенев", 1862);
        book2.display();

    }
}
