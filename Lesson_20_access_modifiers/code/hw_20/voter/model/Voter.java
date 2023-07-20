package hw_20.voter.model;

public class Voter {

    //Реализовать класс Избиратель (модель). Обеспечить невозможность регистрации в качестве избирателя лица,
    // которому еще не исполнилось 18 лет в классе-аппликации

    //поля
        private String name;
        private String address;
        private int age;

        //полный конструктор
    public Voter(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = checkAge(age);
    }

    //конструктор без адреса
    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
        address = "unknown";
    }

    //геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        }else {
            System.out.println("приходи в следующем году))");
        }
    }

    //метод проверка на возраст
    private int checkAge (int age) {
        if (age >= 18){
            return age;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "name: " + name + ", address: " + address + ", age: " + age;
    }
}
