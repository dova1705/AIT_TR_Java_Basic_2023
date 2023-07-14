package homework.tests;

public class DogTest {
    private int paws;
    private byte tail;

    //конструктор
    public DogTest(int paws, byte tail) {
        this.paws = paws;
        this.tail = tail;
    }

    public void display () {
        System.out.println("лапы " + paws + " хвост " + tail);
    }
    public void voice () {
        System.out.println("хрр");
    }

    //геттеры и сеттеры
    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public byte getTail() {
        return tail;
    }

    public void setTail(byte tail) {
        this.tail = tail;
    }

}
