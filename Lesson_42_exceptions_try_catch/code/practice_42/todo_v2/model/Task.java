package practice_42.todo_v2.model;

import java.util.Objects;

public class Task implements Comparable<Task> { // для сортировки нужен implements Comparable<"имя класса">

    //поля класса, они описывают ОБЪЕКТЫ класса
    private int id; // идентификатор
    private String task; // содержание задачи
    private static int nextId;

    // конструктор
    public Task(String task) { // по имени совпадает с именем класса, ничего не возвращает и не void
        this.id = nextId++;
        this.task = task;
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // метод toString
    @Override
    public String toString() { //переопределяем для себя, для использования в своей программе, ЭТО ПОЛИМОРФИЗМ
        return  (id + 1) + " : " + task;
    }

    @Override
    public boolean equals(Object o) {// для сравнения полей
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Task o) { // при сортировке положительный возврат меняет местами
        return this.id - o.id; //естественная сортировка по id от меньшего к большому.
    }
}
