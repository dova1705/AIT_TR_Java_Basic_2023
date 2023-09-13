package practice_39.todo_appl;

import practice_39.todo_appl.dao.ToDoListImpl;
import practice_39.todo_appl.model.Menu;
import practice_39.todo_appl.model.Task;

import java.util.Scanner;

public class ToDoAppl {

    public static void main(String[] args) {
        //поля
        ToDoListImpl toDoList = new ToDoListImpl(10);
        Task[] tasks = new Task[10];

        // greeting = приветствие
        System.out.println("Welcome to ToDo Application!");
        boolean loop = true;

        while (loop){
            // print menu
            Menu.printMenu(); //статический метод вызывается по имени класса
            // ask choice = выбор пользователя
            System.out.println();
            System.out.println("выберите что делать");
            Scanner sc = new Scanner(System.in);
            //включить сканер получить выбор пользователя
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    toDoList.printTasks();
                    break;
                case 2:
                    toDoList.addTask();
                    break;
//                case 3:
//                    toDoList.findTask();
                case 5:
                    loop = false;
                    System.out.println("======================= выход!  До встречи!!!   =======================");
                    break;
            }
        }
    }
}
