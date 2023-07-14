package homework.book.controller;

import homework.book.model.Book;
import homework.book.model.Dictionary;
public class BookAppl {
    public static void main(String[] args) {
        Dictionary d1 = new Dictionary("немецко-русский словарь", "С.Матвеев", 2016, 978-5-17-0-2,25000);
        Dictionary d2 = new Dictionary("англо русский словарь", "Владимир Байков", 2018, 978-5-7261-0123-5, 40000);

        d1.display();
        d2.display();
    }
}
