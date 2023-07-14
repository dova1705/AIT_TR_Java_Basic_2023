package practice.library.controller;

import practice.library.models.Book;
import practice.library.models.Library;

public class LibraryAppl {
    public static void main(String[] args) {
        Library library = new Library(1000);
        library.addBook(new Book("War and Peace", "Lev Tolstoi",1990, 2000000000000L));
        library.addBook(new Book("Anna Karenina", "Lev Tolstoi",1995, 2000000000001L));
        library.addBook(new Book("1984", "Oruell",1985, 2000000000002L));

        //System.out.println("Количество книг в библиотеке " + library.getSize());

        //сравнение или поиск книги
        Book bookFinded = library.findBook(2000000000001L);
        System.out.println(bookFinded);

        //для сокращения кода можно написать так
        System.out.println(library.findBook(2000000000001L));

        Book[] books; //создаем массив типа Book
        books = new Book[4];
        // создаем конкретные объекты класса Book
        books[0] = new Book("War and Peace", "Lev Tolstoi", 1990,2000000000000L);
        books[1] = new Book("Anna Karenina", "Lev Tolstoi", 1995,2000000000001L);
        books[2] = new Book("451", "Ray Bredberry", 1965,2000000000002L);
        books[3] = new Book("1984", "George Orwell", 1985,2000000000003L);

        library.addBook(books[0]);
        library.addBook(books[1]);
        library.addBook(books[2]);
        library.addBook(books[3]);
        //System.out.println(library.searchAuthor("Lev Tolstoi", books));
        System.out.println("Количество книг в библиотеке " + library.getSize());

        System.out.println("результат поиска");
        Book[] booksf;
        booksf = library.searchAuthor("Lev Tolstoi", books);
        for (int i = 0; i < booksf.length; i++) {
            System.out.println(booksf[i]);
        }
    }
}
