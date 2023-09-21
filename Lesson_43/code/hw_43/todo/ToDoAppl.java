package hw_43.todo;

import hw_43.todo.dao.ToDoListImpl;
import hw_43.todo.model.Menu;
import hw_43.todo.model.Task;

import java.io.IOException;
import java.util.Scanner;

public class ToDoAppl {

    public static void main(String[] args) throws IOException {

        // приветствие
        System.out.println("Добро пожаловать в приложение ToDo!");
        ToDoListImpl toDoList = new ToDoListImpl(10);

        // TODO - read file
        toDoList.readTasks();

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // спросить о выборе
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Укажите свой выбор: ");
            int choice = scanner.nextInt();
            // выполнять
            switch (choice) {
                case 1: {
                    System.out.println("Ваши задачи: ");
                    toDoList.printTasks();
                    break;
                }
                case 2: {
                    scanner.nextLine();
                    System.out.println("Входная задача: ");
                    String task = scanner.nextLine();
                    Task newTask = new Task(task);
                    toDoList.addTask(newTask);
                    // TODO - сохраняем в файл
                    toDoList.saveTasks();
                    break;
                }
                case 3: {
                    System.out.println("Введите идентификатор задачи ID: ");
                    int id = scanner.nextInt();
                    Task findedTask = toDoList.findTask(id - 1);
                    System.out.println("Задача найдена: " + findedTask);
                    break;
                }
                case 4: {
                    System.out.println("Введите идентификатор задачи ID: ");
                    int id = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(id -1);
                    System.out.println(removedTask + " удаляется.");
                    // TODO - сохраняем в файл
                    toDoList.saveTasks();
                    break;
                }
                case 5:
                    return;
                default: {
                    System.out.println("Неправильный ввод.");
                }
            }
        }
    }
}
