package practice_33.library.models;

public class Library {

      // добавление, удаление, поиск книги.
    private Book[] books;//массив типа Book куда попадут все книги в библиотеке
    private int size; //количество книг в библиотеке

    //метод класса, который задает размер библиотеки, т.е длину массива Book
    public Library (int capacity){
        books = new Book[capacity];
    }

    //метод добавление книги
    public boolean addBook(Book book){
        if ((books.length == size) || findBook(book.getIsbn()) != null){
            return false;//не можем добавить книгу, так как нет место или такая книга уже есть
        }
        books[size] = book;//помещаем книгу в массив
        size++;
        return true;
    }

    //метод поиска книги по ISBN
    public Book findBook(long isbn){
        for (int i = 0; i < size; i++) {//пробегаем по массиву
            if (isbn == books[i].getIsbn()){//проверяем совпадение ISBN
                return books[i];//возвращаем элемент массива типа Book
            }
        }
        return null;
    }
    //метод поиска книги по автору
    public Book[] searchAuthor (String author, Book[] books){
        //count how many books of author
        int count = 0;
       for (int i = 0; i < size; i++) {
            if (author.equals(books[i].getAuthor())) {//проверяем совпадение
                count++;
            }
        }
       //заполним массив с результатом поиска
       Book[] booksf = new Book[count];
        for (int i = 0; i < booksf.length; i++) {
            for (int j = 0; j < size; j++) {// пробегаем по массиву
                if (author.equals(books[j].getAuthor())) {//проверяем совпадение
                    booksf[i] = books[j];
                    i++;
                }
            }
        }
        return booksf;
   }
    public String getAuthor () {
        return getAuthor();
    }

    //количество книг в библиотеке
    public int getSize (){
        return size;
    }
}
