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
        System.out.println("напишите задачу для добавления: ");//приглашение пользователю
        String taskStr = sc.nextLine();//читаем пользователя
        System.out.println("напишите id для добавления: ");//приглашение пользователю
        int taskId = sc.nextInt();//читаем пользователя
        if (taskStr == null){
            return false; // Возвращаем false, т.к. задачу нельзя добавить!
        }
        Task[] taskCopy = Arrays.copyOf(tasks, tasks.length + 1);//в параметр Arrays.copyOf (tasks - указали откуда копируем, tasks.length - длина массива)
        taskCopy[capacity++] = new Task(taskId, taskStr);//добавление в конец массива новую задачу и увеличиваем размер (еще раз разобраться что такое постфикс и префикс)
        tasks = taskCopy;//в старый массив присвоили новый скопированный от старого массива + новая задача
        return true;
    }

    // метод, который удаляет дело из массива
    @Override
    public Task removeTask(int id) {
        // find by id then remove, quantity--
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getId() == id){// находим жертву по его id
                Task victim = tasks[i];// в объектную переменную victim кладем найденного
                //tasks[i] = tasks[capacity - 1];// берем последнего в списке и ставим его на место найденного
                tasks[capacity - 1] = null;// последнего в списке делаем null
                capacity--; //уменьшаем размер на 1
                return victim;//возвращаем найденный объект
            }
        }
        return null; //если не нашлось объект с заданным id возвращаем null
    }

    @Override
    public Task findTask(int id) {
        // find by id
        for (int i = 0; i < capacity; i++) {
            if (tasks[i].getId() == id){// находим жертву по его id
                return tasks[i];//возвращаем найденного
            }
        }
        return null;//если не нашлось объект с заданным id возвращаем null
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
