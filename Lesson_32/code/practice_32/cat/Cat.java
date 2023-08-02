package practice_32.cat;

import java.util.Objects;

public class Cat implements Comparable<Cat>{

    // Создать класс Cat, 4 поля
    // стандартные конструктор, геттеры и сеттеры
    // toString - переопределить
    // Создать класс для тестирования
    // создать массив с представителями класса
    // добавить интерфейс comparable в класс Cat, переопределить метод compareTo
    // отсортировать массив кошек


    //поля
    private String name; //кличка
    private int age;// возраст
    private String color; //цвет
    private double weight; //вес

    //конструктор
    public Cat(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }


    //геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", age=" + age + ", color='" + color + '\'' + ", weight=" + weight + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, weight);
    }

    @Override
      public int compareTo(Cat o) {
        //сортировка по имени и по возрасту
        int res1 = this.name.compareTo(o.name); //отвечает за имя
        int res2 = this.age - o.age;//отвечает за возраст
        int res = 0;
        if (res1 <= 0 && res2 <= 0) {res = 1;} else {res = -1;}
          return res;
       }

 //   @Override
  //  public int compareTo(Cat o) {
  //      return this.name.compareTo(o.name);//сравнение двух строк (сортировка по имени) поменять порядок сортировки можно поставив впереди минус
 //   }

//    @Override
//    public int compareTo(Cat o) {
//        //сортируем по возрасту от большего к меньшему, (от меньшего к большому this.age - o.age)
//        return o.age - this.age; //сравнение по возрасту, если результат отрицательный то порядок останется, а если положительный то объекты поменяют местами
//    }
}
