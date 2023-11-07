package hw_55;

import java.util.function.Function;

public class Hw_55 {
    public static void main(String[] args) {

        Person person1 = new Person("Tom", 20, "male");
        Person person2 = new Person("Leo", 17, "male");

        //Function<Person, Boolean>  ageCheck = (p) -> {return if(p.getAge() >=18) }

    }

    private static class Person{
        String name;
        int age;
        String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }
    }
}
