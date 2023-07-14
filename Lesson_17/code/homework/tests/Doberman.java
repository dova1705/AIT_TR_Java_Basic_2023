package homework.tests;

public class Doberman extends DogTest{
    public Doberman(int paws, byte tail) {
        super(paws, tail);
    }

    @Override //переопределить метод класса-родителя
    public void voice (){
        super.voice();
        System.out.println("гав - гав");
    }
}
