package practice_21.library.controller;

import practice_21.library.models.Book;
import practice_21.library.models.Library;

public class LibraryAppl {
    public static void main(String[] args) {
        Library library = new Library(1000);
        library.addBook(new Book("War and Peace", "Lev Tolstoi",1990, 2000000000000L));
        library.addBook(new Book("Anna Karenina", "Lev Tolstoi",1995, 2000000000001L));
        library.addBook(new Book("1984", "Orwell",1985, 2000000000002L));

        //сравнение или поиск книги по ISBN
        System.out.println("поиск книги по ISBN: " + library.findBook(2000000000001L));

        //печатаем и вызов метода поиск по названию
        System.out.println("поиск по названию: " + library.searchTitle("War and Peace"));

        Book[] books = new Book[4]; //создаем массив типа Book

        // создаем конкретные объекты класса Book
        books[0] = new Book("War and Peace", "Lev Tolstoy", 1990,2000000000000L);
        books[1] = new Book("Anna Karenina", "Lev Tolstoy", 1995,2000000000001L);
        books[2] = new Book("451", "Ray Bredberry", 1965,2000000000002L);
        books[3] = new Book("1984", "George Orwell", 1985,2000000000003L);

        //добавили книги в библиотеку
        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }
          System.out.println("Количество книг в библиотеке " + library.getSize());

        System.out.println("результат поиска:");
        Book[] booksF;//массив для результата поиска
        booksF = library.searchAuthor("Lev Tolstoy", books);
        for (int i = 0; i < booksF.length; i++) {
            System.out.println(booksF[i]);
        }

        //удаление книги
        System.out.println("удаление книги");
        System.out.println(library.removeBook(2000000000000L, books));
        System.out.println("размер библиотеки: " + library.getSize());

        //печать массива книг
        for (int i = 0; i < library.getSize(); i++) {
            System.out.println(books[i]);
        }
    }
}
