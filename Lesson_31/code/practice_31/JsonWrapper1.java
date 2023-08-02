package practice_31;

public class JsonWrapper1 {
    //поле
    private Object value;

    //конструктор
    public JsonWrapper1(Object value) {
        this.value = value;
    }

    //геттер
    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value + "}";
    }
}
