package practice_21.library.models;

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
    //метод поиска книги по названию
    public Book searchTitle (String title){
        for (int i = 0; i < size; i++) {//пробегаем по массиву
            if (title.equals(books[i].getTitle())){//проверяем совпадение строк в поле title
                return books[i];//возвращаем элемент массива типа Book
            }
        }
        return null;
    }
    //метод поиска книги по автору
    public Book[] searchAuthor (String author, Book[] books){
        //count how many books of author
        int count = 0;
       for (int i = 0; i < size; i++) {//пробегаем по массиву
            if (author.equals(books[i].getAuthor())) {//проверяем совпадение строк в поле author
                count++;//возвращаем элемент массива типа Book
            }
        }
        System.out.println("Количество книг: " + count);

       //заполним массив с результатом поиска
       Book[] booksF = new Book[count];//определил массив размером по количество найденных
        count = 0;
        for (int i = 0; i < booksF.length; i++) {
                if (author.equals(books[i].getAuthor())) {//проверяем совпадение строк в поле author
                    booksF[count] = books[i];//заполняем массив booksF
                    count++;
                }

        }
        return booksF;
   }

    //количество книг в библиотеке
    public int getSize (){
        return size;
    }

    // метод удаления книги из библиотеки
    // надо найти книгу
    // последнюю книгу поставить на место удаленной, количество книг в библиотеке -1
    public Book removeBook(long isbn, Book[] books ){
        Book victim = null;
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                victim = books[i];
                books[i] = books[size - 1]; // на место удаляемой ставим последнюю книжку
                books[size - 1] = null; // последнюю книгу стираем, так она теперь стоит на месте удаленной
                size--;
                break;
            }
        }
        return victim;
    }
}
