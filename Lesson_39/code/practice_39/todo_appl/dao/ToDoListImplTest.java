package practice_39.todo_appl.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_39.todo_appl.model.Task;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListImplTest {

    //поля
    ToDoListImpl toDoList; //поле, подключение тестируемого класса, создание объектной переменной

    Task[] tasks; //поле типа Task, это массив, пока он получил только название
    @BeforeEach
    void setUp() {
        toDoList = new ToDoListImpl(10); //вызов конструктора
        tasks = new Task[6];
        tasks[0] = new Task(100,"Утренняя зарядка");
        tasks[1] = new Task(101,"купить продукты");
        tasks[2] = new Task(102,"не забыть позвонить маме");
        tasks[3] = new Task(103,"прогулка перед сном");

        for (int i = 0; i < tasks.length; i++) {
            toDoList.addTask(tasks[i]);
        }
    }

    @Test
    void addTask() {
        System.out.println("количество дел: " + toDoList.quantity());
        toDoList.printTasks();
        Task task = new Task(104,"купить корм для животных");
        toDoList.addTask(task);
        System.out.println("количество дел: " + toDoList.quantity());
        toDoList.printTasks();
    }

    @Test
    void removeTask() {
        System.out.println("количество дел: " + toDoList.quantity());
        toDoList.printTasks();
        assertEquals(tasks[2], toDoList.removeTask(102));
        System.out.println("количество дел: " + toDoList.quantity());
        toDoList.printTasks();

    }

    @Test
    void findTask() {
        System.out.println("количество дел: " + toDoList.quantity());
        toDoList.printTasks();
        assertEquals(tasks[3],toDoList.findTask(103));
        System.out.println(toDoList.findTask(103));
    }
}