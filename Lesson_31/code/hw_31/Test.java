package hw_31;

public class Test <T, U> {
    //поля
    T obj1;
    U obj2;

    public Test(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "{obj1: " + obj1 + ", obj2: " + obj2 + "}";
    }
}
