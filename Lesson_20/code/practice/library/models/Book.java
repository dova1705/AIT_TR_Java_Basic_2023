package practice.library.models;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    int yearOfPublishing;
    public static final int ISBN_LENGTH = 13; //никто не может поменять это значение
    private final long isbn;

    //полный конструктор
    public Book(String title, String author, int yearOfPublishing, long isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn);//проверка ISBN
    }

    //конструктор без автора, когда автора нет
    public Book(String title, int yearOfPublishing, long isbn) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn);//проверка ISBN
        author = "unknown";
    }

    private long checkIsbn(long isbn){
        if(countDigits(isbn) == ISBN_LENGTH) {//проверка, что 13 цифр
    return isbn;
        }
        return -1;
    }

    //метод которое считает цифры
    private int countDigits(long isbn){
        int count = 0;
        do {
            count++;//счетчик количество цифр
            isbn /= 10; // делим число на 10
        } while (isbn != 0);
        return count;
    }
    //геттеры и сеттеры

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", isbn=" + isbn +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublishing, isbn);
    }
}
