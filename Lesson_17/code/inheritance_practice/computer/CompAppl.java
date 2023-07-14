package inheritance_practice.computer;

public class CompAppl {
    public static void main(String[] args) {

        //создаем объектную переменную класса Computer с полями и их значениями
         Computer comp1 = new Computer("i5",12, 512, "HP");
         comp1.display();
        Computer comp2 = new Computer("i5",12, 512, "Acer");
        comp2.display();
        System.out.println();

        Laptop l1 = new Laptop("i7", 32, 1024, "Asus", 13, 2, "silver");
        l1.display();
        Laptop l2 = new Laptop("i9", 32, 1024, "Dell", 13, 2, "gold");
        l2.display();

    }
}
