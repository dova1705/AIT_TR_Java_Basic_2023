package practice_31;

public class JsonWrapper2 < T >{

    //поле
    private T value; //тип value неизвестен (тип Т)

    //конструктор
    public JsonWrapper2(T value) {
        this.value = value;
    }

    //геттер
    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value +"}";
    }
}
