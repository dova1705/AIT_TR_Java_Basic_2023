package homework.book.model;

public class Dictionary extends Book{
    private int amountOfWords;

    public Dictionary(String title, String author, int year, long isbn, int amountOfWords) {
        super(title, author, year, isbn);
        this.amountOfWords = amountOfWords;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("количество слов: " + amountOfWords);
    }
}
