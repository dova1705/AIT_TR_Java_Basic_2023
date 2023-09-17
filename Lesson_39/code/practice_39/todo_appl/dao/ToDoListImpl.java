package practice_39.todo_appl.dao;

import hw_35.product.model.Product;
import practice_39.todo_appl.model.Task;

import java.util.Arrays;
import java.util.Scanner;

public class ToDoListImpl implements ToDoList{

    //поля
    private Task[] tasks;
    int capacity;

    //конструктор
    public ToDoListImpl(int capacity) {
        this.tasks = new Task[capacity];
    }


    // метод, который добавляет новую задачу в массив
    @Override
    public boolean addTask() {
        Scanner sc = new Scanner(System.in); //включили сканер
        System.out.println("Ввод задачи для добавления в запись: ");//приглашение пользователю
        String newTask = sc.nextLine();//читаем пользователя
        if (newTask != null){
            Task[] taskCopy = Arrays.copyOf(tasks, tasks.length + 1);//копируем массив на вход (tasks откуда копируем, tasks.length + 1 размер массива)
            // tasksCopy[0] = NULL
            taskCopy[capacity++] = new Task(capacity, newTask);//в скопированном массиве [capacity++] - это место новой задачи сначала добавляет потом, увеличивает размер
            tasks = taskCopy;//в старый массив присваиваем значение нового массива
        }
        return false;
    }
    // метод, который удаляет задачи из массива
    @Override
    public Task removeTask(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getId() == id){
                Task victim = tasks[i];
                System.arraycopy(tasks, i + 1, tasks, i, (--capacity) - i); //capacity - i - 1. tasks массив из которого будут копироваться элементы, i + 1 индекс элемента с которого начнется копирование, tasks массив в который будут скопированы элементы, i индекс элемента с которого начнется вставка скопированных элементов, (--quantity) - i количество элементов для копирования
                Task[] taskCopy = Arrays.copyOf(tasks, tasks.length - 1);
                tasks = taskCopy;
                return victim;
            }
        }
        return null;
    }
    // метод, поиск задачи из массива
    @Override
    public Task findTask(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getId() == id){
                return tasks[i];
            }
        }
        return null;
    }

    @Override
    public void printTasks() {
        // for loop, print tasks
        for (int i = 0; i < capacity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("==========================================================");
    }

    @Override
    public int quantity() {
        // return quantity;
        return capacity;
    }
}